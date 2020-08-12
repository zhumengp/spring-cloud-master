package org.com.zhump.dsp.service.impl;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.api.mode.dto.ApiAdvertTaskAddDTO;
import org.com.zhump.api.mode.dto.ApiAdvertTaskAreasDTO;
import org.com.zhump.dsp.dao.DspAdvertTaskMapper;
import org.com.zhump.dsp.entity.DspAdvertAreas;
import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.exception.DspBusinessException;
import org.com.zhump.dsp.service.IDspAdvertAreas;
import org.com.zhump.dsp.service.IDspAdvertTask;
import org.com.zhump.dsp.web.dto.AdvertTaskAddDTO;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.util.SerialNumBuilderUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "IDspAdvertTask")
@Log4j2
public class DspAdvertTaskImpl implements IDspAdvertTask {

    @Autowired
    private DspAdvertTaskMapper dspAdvertTaskMapper;

    @Autowired
    private IDspAdvertAreas dspAdvertAreas;

    /**
     * 查询数量
     * @param example
     * @return
     */
    @Override
    public int countByExample(DspAdvertTaskExample example) {
        return dspAdvertTaskMapper.countByExample(example);
    }

    /**
     * 删除任务
     * @param example
     * @return
     */
    @Override
    public int deleteByExample(DspAdvertTaskExample example) {
        return dspAdvertTaskMapper.deleteByExample(example);
    }

    /**
     * 新增任务
     * @param apiAdvertTaskAddDto
     * @return
     */
    @Override
    public boolean insertSelective(ApiAdvertTaskAddDTO apiAdvertTaskAddDto) {
        DspAdvertTaskWithBLOBs record = new DspAdvertTaskWithBLOBs();
        BeanUtils.copyProperties(apiAdvertTaskAddDto,record);
        String adId = SerialNumBuilderUtil.buildAdverSerial("");
        record.setAdId(adId);
        int i = dspAdvertTaskMapper.insertSelective(record);
        if ( i < 0){
            return false;
        }
        List<ApiAdvertTaskAreasDTO> apiAdvertTaskAreasDtos = apiAdvertTaskAddDto.getApiAdvertTaskAreasDtos();
        boolean b = dspAdvertAreas.insertBatchApi(adId, "123456",apiAdvertTaskAreasDtos);
        if (!b){
            log.error("新增地域标签失败,任务ID：{}",adId);
            throw new DspBusinessException(ErrorEnum.DSP10000004);
        }
        return i > 0 ? true :false;
    }
    /**查询广告任务*/
    @Override
    public List<DspAdvertTaskWithBLOBs> selectByExampleWithBLOBs(DspAdvertTaskExample example) {
        List<DspAdvertTaskWithBLOBs> list = dspAdvertTaskMapper.selectByExampleWithBLOBs(example);
        if (list == null || list.size() == 0){
            log.error("未查询到广告数据");
            throw new DspBusinessException(ErrorEnum.DSP10000001);
        }
        return list;
    }

    @Override
    public List<DspAdvertTask> selectByExample(DspAdvertTaskExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(DspAdvertTaskWithBLOBs record, DspAdvertTaskExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(DspAdvertTaskWithBLOBs record) {
        return 0;
    }
}

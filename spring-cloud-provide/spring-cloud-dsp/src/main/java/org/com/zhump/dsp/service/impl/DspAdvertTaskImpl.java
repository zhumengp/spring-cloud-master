package org.com.zhump.dsp.service.impl;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.dsp.dao.DspAdvertTaskMapper;
import org.com.zhump.dsp.entity.DspAdvertAreas;
import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.exception.DspBusinessException;
import org.com.zhump.dsp.service.IDspAdvertAreas;
import org.com.zhump.dsp.service.IDspAdvertTask;
import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.util.SerialNumBuilderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "IDspAdvertTask")
@Log4j2
public class DspAdvertTaskImpl implements IDspAdvertTask {

    @Autowired
    private DspAdvertTaskMapper dspAdvertTaskMapper;

    @Autowired
    private IDspAdvertAreas advertAreas;

    /**
     * 查询数量
     * @param example
     * @return
     */
    @Override
    public int countByExample(DspAdvertTaskExample example) {
        return dspAdvertTaskMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DspAdvertTaskExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public boolean insertSelective(DspAdvertTaskWithBLOBs record) {
        /**新增地域*/
        List<DspAdvertAreas> areasList = new ArrayList<>();
        DspAdvertAreas dspAdvertAreas = new DspAdvertAreas();
        dspAdvertAreas.setAddress("test1");
        dspAdvertAreas.setAdId(SerialNumBuilderUtil.buildAdverSerial(""));
        dspAdvertAreas.setCity("test2");
        dspAdvertAreas.setCoordinate("test3");
        dspAdvertAreas.setCrowdId(123456L);
        dspAdvertAreas.setScope(3L);
        dspAdvertAreas.setProvince("");
        dspAdvertAreas.setType(2);
        dspAdvertAreas.setRegionCode("");
        areasList.add(dspAdvertAreas);
        Integer result = advertAreas.insertBatch(areasList);
        if (result <= 0){
            throw new DspBusinessException(ErrorEnum.DSP10000004);
        }
        int i = dspAdvertTaskMapper.insertSelective(record);
        if (i <= 0){
            throw new DspBusinessException(ErrorEnum.DSP10000004);
        }
        return true;
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
    public DspAdvertTaskWithBLOBs selectByPrimaryKey(Integer id) {
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

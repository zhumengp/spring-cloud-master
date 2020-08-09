package org.com.zhump.dsp.service.impl;

import lombok.extern.log4j.Log4j2;
import org.com.zhump.dsp.dao.DspAdvertTaskMapper;
import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.exception.DspBusinessException;
import org.com.zhump.dsp.service.IDspAdvertTask;
import org.com.zhump.enums.ErrorEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "IDspAdvertTask")
@Log4j2
public class DspAdvertTaskImpl implements IDspAdvertTask {

    @Autowired
    private DspAdvertTaskMapper dspAdvertTaskMapper;

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
    public int insertSelective(DspAdvertTaskWithBLOBs record) {
        return 0;
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

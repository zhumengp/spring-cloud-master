package org.com.zhump.dsp.service.impl;

import org.com.zhump.dsp.dao.DspAdvertTaskMapper;
import org.com.zhump.dsp.entity.DspAdvertTask;
import org.com.zhump.dsp.entity.DspAdvertTaskExample;
import org.com.zhump.dsp.entity.DspAdvertTaskWithBLOBs;
import org.com.zhump.dsp.service.IDspAdvertTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "IDspAdvertTask")
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
        List<DspAdvertTaskWithBLOBs> dspAdvertTaskWithBLOBs = dspAdvertTaskMapper.selectByExampleWithBLOBs(example);
        return dspAdvertTaskWithBLOBs;
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

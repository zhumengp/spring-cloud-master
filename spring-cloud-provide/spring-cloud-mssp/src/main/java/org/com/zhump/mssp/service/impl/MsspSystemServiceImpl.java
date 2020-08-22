package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.dao.MsspSystemMapper;
import org.com.zhump.mssp.entity.MsspSystem;
import org.com.zhump.mssp.entity.MsspSystemExample;
import org.com.zhump.mssp.service.IMsspSystemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class MsspSystemServiceImpl implements IMsspSystemService {


    @Resource
    private MsspSystemMapper msspSystemMapper;
    @Override
    public int countByExample(MsspSystemExample example) {
        return msspSystemMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MsspSystemExample example) {
        return msspSystemMapper.deleteByExample(example);
    }

    @Override
    public int insertSelective(MsspSystem record) {
        return msspSystemMapper.insertSelective(record);
    }

    @Override
    public List<MsspSystem> selectByExample(MsspSystemExample example) {
        return msspSystemMapper.selectByExample(example);
    }

    @Override
    public MsspSystem selectByPrimaryKey(Integer id) {
        return msspSystemMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MsspSystem record, MsspSystemExample example) {
        return msspSystemMapper.updateByExampleSelective(record,example);
    }
}

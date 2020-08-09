package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.dao.MsspUserMapper;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MsspUserServiceImpl implements IMsspUserService {

    @Resource
    MsspUserMapper msspUserMapper;


    @Override
    public int countByExample(MsspUserExample example) {
        return msspUserMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MsspUserExample example) {
        return msspUserMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return msspUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MsspUser record) {
        return msspUserMapper.insertSelective(record);
    }

    @Override
    public List<MsspUser> selectByExample(MsspUserExample example) {
        return msspUserMapper.selectByExample(example);
    }

    @Override
    public MsspUser selectByPrimaryKey(Long id) {
        return msspUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MsspUser record, MsspUserExample example) {
        return msspUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MsspUser record) {
        return msspUserMapper.updateByPrimaryKeySelective(record);
    }
}

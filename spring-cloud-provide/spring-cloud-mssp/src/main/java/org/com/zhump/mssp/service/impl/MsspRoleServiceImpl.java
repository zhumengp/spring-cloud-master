package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.dao.MsspRoleMapper;
import org.com.zhump.mssp.dao.MsspUserMapper;
import org.com.zhump.mssp.entity.MsspRole;
import org.com.zhump.mssp.entity.MsspRoleExample;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspRoleService;
import org.com.zhump.mssp.service.IMsspUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MsspRoleServiceImpl implements IMsspRoleService {

    @Resource
    MsspRoleMapper msspRoleMapper;


    @Override
    public int countByExample(MsspRoleExample example) {
        return msspRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MsspRoleExample example) {
        return msspRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return msspRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(MsspRole record) {
        return msspRoleMapper.insertSelective(record);
    }

    @Override
    public List<MsspRole> selectByExample(MsspRoleExample example) {
        return msspRoleMapper.selectByExample(example);
    }

    @Override
    public MsspRole selectByPrimaryKey(Long id) {
        return msspRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MsspRole record, MsspRoleExample example) {
        return msspRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MsspRole record) {
        return msspRoleMapper.updateByPrimaryKeySelective(record);
    }
}

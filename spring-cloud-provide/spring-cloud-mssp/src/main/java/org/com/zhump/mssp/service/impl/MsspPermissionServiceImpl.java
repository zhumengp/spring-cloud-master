package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.dao.MsspPermissionMapper;
import org.com.zhump.mssp.entity.MsspPermission;
import org.com.zhump.mssp.entity.MsspPermissionExample;
import org.com.zhump.mssp.service.IMsspPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 资源表
 */
@Service
public class MsspPermissionServiceImpl implements IMsspPermissionService {


    @Autowired
    private MsspPermissionMapper msspPermissionMapper;

    @Override
    public int deleteByExample(MsspPermissionExample example) {
        return msspPermissionMapper.deleteByExample(example);
    }


    @Override
    public int insertSelective(MsspPermission record) {
        return msspPermissionMapper.insertSelective(record);
    }

    @Override
    public List<MsspPermission> selectByExample(MsspPermissionExample example) {
        return msspPermissionMapper.selectByExample(example);
    }

    @Override
    public MsspPermission selectByPrimaryKey(Long id) {
        return msspPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MsspPermission record, MsspPermissionExample example) {
        return msspPermissionMapper.updateByExampleSelective(record,example);
    }


}

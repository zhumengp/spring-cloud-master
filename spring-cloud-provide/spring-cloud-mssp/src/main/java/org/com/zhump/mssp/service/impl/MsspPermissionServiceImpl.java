package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.entity.MsspPermission;
import org.com.zhump.mssp.entity.MsspPermissionExample;
import org.com.zhump.mssp.service.IMsspPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 资源表
 */
@Service
public class MsspPermissionServiceImpl implements IMsspPermissionService {


    @Autowired
    private IMsspPermissionService msspPermissionService;

    @Override
    public int deleteByExample(MsspPermissionExample example) {
        return msspPermissionService.deleteByExample(example);
    }


    @Override
    public int insertSelective(MsspPermission record) {
        return msspPermissionService.insertSelective(record);
    }

    @Override
    public List<MsspPermission> selectByExample(MsspPermissionExample example) {
        return msspPermissionService.selectByExample(example);
    }

    @Override
    public MsspPermission selectByPrimaryKey(Integer id) {
        return msspPermissionService.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(MsspPermission record, MsspPermissionExample example) {
        return msspPermissionService.updateByExampleSelective(record,example);
    }


}

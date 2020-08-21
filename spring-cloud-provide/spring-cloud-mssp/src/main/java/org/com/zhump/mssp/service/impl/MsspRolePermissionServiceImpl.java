package org.com.zhump.mssp.service.impl;

import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.dao.MsspPermissionMapper;
import org.com.zhump.mssp.dao.MsspRoleMapper;
import org.com.zhump.mssp.dao.MsspRolePermissionMapper;
import org.com.zhump.mssp.entity.MsspRole;
import org.com.zhump.mssp.entity.MsspRolePermission;
import org.com.zhump.mssp.entity.MsspRolePermissionExample;
import org.com.zhump.mssp.exception.MsspBusinessException;
import org.com.zhump.mssp.service.IMsspRolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 资源表
 */
@Transactional(readOnly = true)
@Service
public class MsspRolePermissionServiceImpl implements IMsspRolePermissionService {


    @Autowired
    private MsspRolePermissionMapper msspRolePermissionMapper;

    @Transactional(readOnly = false, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean add(Integer roleId, List<Integer> resources) {
        //删除
        MsspRolePermissionExample example = new MsspRolePermissionExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        msspRolePermissionMapper.deleteByExample(example);
        //新增
        for (Integer resource : resources){
            MsspRolePermission recode = new MsspRolePermission();
            recode.setRoleId(roleId);
            recode.setPermissionId(resource);
            int i = msspRolePermissionMapper.insertSelective(recode);
            if (i <= 0){
                throw new MsspBusinessException(ErrorEnum.MSSP10000002.getCode(),"赋值角色权限异常");
            }
        }
        return true;
    }
}

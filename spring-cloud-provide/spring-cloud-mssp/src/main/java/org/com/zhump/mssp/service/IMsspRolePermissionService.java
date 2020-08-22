package org.com.zhump.mssp.service;


import org.com.zhump.mssp.entity.MsspRolePermission;
import org.com.zhump.mssp.entity.MsspRolePermissionExample;

import java.util.List;

public interface IMsspRolePermissionService {

    /**
     * 赋值角色权限
     * @param roleId
     * @param resources
     * @return
     */
    boolean add(Long roleId,List<Long> resources);

    List<MsspRolePermission> selectActive(MsspRolePermissionExample example);
}

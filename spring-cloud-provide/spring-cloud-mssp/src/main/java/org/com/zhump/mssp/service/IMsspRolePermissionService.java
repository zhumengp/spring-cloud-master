package org.com.zhump.mssp.service;


import java.util.List;

public interface IMsspRolePermissionService {

    /**
     * 赋值角色权限
     * @param roleId
     * @param resources
     * @return
     */
    boolean add(Integer roleId,List<Integer> resources);
}

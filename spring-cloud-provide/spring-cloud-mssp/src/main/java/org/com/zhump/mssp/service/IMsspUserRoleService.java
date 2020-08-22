package org.com.zhump.mssp.service;

import java.util.List;

public interface IMsspUserRoleService {

    /**赋值角色权限*/
    boolean insert(Long userId,List<Long> list);

    /**
     * 根据用户id删除角色
     */
    boolean delete(Long userId);


}

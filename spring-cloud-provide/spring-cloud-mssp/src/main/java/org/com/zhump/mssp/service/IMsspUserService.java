package org.com.zhump.mssp.service;

import org.com.zhump.mssp.entity.MsspUser;

public interface IMsspUserService {

    /**查询用户信息*/
    public MsspUser getByUserId(Long userId);
}

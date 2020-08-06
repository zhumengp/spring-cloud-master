package org.com.zhump.mssp.service;

import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.web.dto.MsspUserDTO;

public interface IMsspUserService {

    /**查询用户信息*/
    public MsspUser getByUserId(Long userId);


    /**新增用户*/
    public boolean insert(MsspUserDTO msspUserDTO);
}

package org.com.zhump.mssp.service.impl;

import org.com.zhump.mssp.dao.MsspUserMapper;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.service.IMsspUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MsspUserServiceImpl implements IMsspUserService {

    @Resource
    private MsspUserMapper msspUserMapper;

    /**
     * 根据用户Id查询用户信息
     * @param userId 用户主键
     * @return
     */
    @Override
    public MsspUser getByUserId(Long userId) {
        MsspUser msspUser = msspUserMapper.selectByPrimaryKey(userId);
        return msspUser;
    }
}

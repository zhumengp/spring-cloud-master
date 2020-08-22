package org.com.zhump.mssp.service.impl;

import org.com.zhump.enums.ErrorEnum;
import org.com.zhump.mssp.dao.MsspUserRoleMapper;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.entity.MsspUserRole;
import org.com.zhump.mssp.entity.MsspUserRoleExample;
import org.com.zhump.mssp.exception.MsspBusinessException;
import org.com.zhump.mssp.service.IMsspUserRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户角色服务层
 */
@Service
@Transactional(readOnly = true)
public class MsspUserRoleServiceImpl implements IMsspUserRoleService {


    @Autowired
    private MsspUserRoleMapper msspUserRoleMapper;


    @Transactional(readOnly = false, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean insert(Long userId,List<Long> list) {
        MsspUserRoleExample example = new MsspUserRoleExample();
        example.createCriteria().andUserIdEqualTo(userId);
        msspUserRoleMapper.deleteByExample(example);
        list.stream().forEach(roleId ->{
            MsspUserRole msspUserRole = new MsspUserRole();
            msspUserRole.setUserId(userId);
            msspUserRole.setRoleId(roleId);
            int insert = msspUserRoleMapper.insert(msspUserRole);
            if (insert <= 0){
                throw new MsspBusinessException(ErrorEnum.MSSP10000002.getCode(),"赋值用户角色失败");
            }
        });
        return true;
    }

    /**
     * 删除用户对应的角色
     * @param userId
     * @return
     */
    @Override
    public boolean delete(Long userId) {
        MsspUserRoleExample example = new MsspUserRoleExample();
        example.createCriteria().andUserIdEqualTo(userId);
        msspUserRoleMapper.deleteByExample(example);
        return true;
    }


}

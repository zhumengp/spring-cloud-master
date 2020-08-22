package org.com.zhump.mssp.service.impl;

import com.google.common.base.Preconditions;
import org.com.zhump.mssp.dao.MsspUserMapper;
import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspUserRoleService;
import org.com.zhump.mssp.service.IMsspUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional(readOnly = true)
@Service
public class MsspUserServiceImpl implements IMsspUserService {

    @Resource
    MsspUserMapper msspUserMapper;

    @Resource
    IMsspUserRoleService msspUserRoleService;


    @Override
    public int countByExample(MsspUserExample example) {
        return msspUserMapper.countByExample(example);
    }
    @Transactional(readOnly = false, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public int deleteByExample(MsspUserExample example) {
        return msspUserMapper.deleteByExample(example);
    }
    @Transactional(readOnly = false, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public boolean deleteByPrimaryKey(Long id) {
        int i = msspUserMapper.deleteByPrimaryKey(id);
        if (i < 0){
            return false;
        }
        //DATO
        //删除用户角色
        msspUserRoleService.delete(id);
        return true;
    }
    @Transactional(readOnly = false, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public int insertSelective(MsspUser record) {
        return msspUserMapper.insertSelective(record);
    }

    @Override
    public List<MsspUser> selectByExample(MsspUserExample example) {
        return msspUserMapper.selectByExample(example);
    }

    @Override
    public MsspUser selectByPrimaryKey(Long id) {
        return msspUserMapper.selectByPrimaryKey(id);
    }

    @Transactional(readOnly = false, isolation = Isolation.REPEATABLE_READ, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public int updateByExampleSelective(MsspUser record, MsspUserExample example) {
        return msspUserMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MsspUser record) {
        return msspUserMapper.updateByPrimaryKeySelective(record);
    }
}

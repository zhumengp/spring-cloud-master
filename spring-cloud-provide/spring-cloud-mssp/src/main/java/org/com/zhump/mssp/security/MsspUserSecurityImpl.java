package org.com.zhump.mssp.security;

import org.com.zhump.mssp.entity.MsspUser;
import org.com.zhump.mssp.entity.MsspUserExample;
import org.com.zhump.mssp.service.IMsspUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 数据库校验用户名和密码
 */
@Component
public class MsspUserSecurityImpl implements UserDetailsService {

    @Autowired
    private IMsspUserService msspUserService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        MsspUserExample example = new MsspUserExample();
        example.createCriteria().andAccountNameEqualTo(s);
        List<MsspUser> msspUsers = msspUserService.selectByExample(example);
        if (msspUsers == null || msspUsers.size() <= 0){
            throw new BadCredentialsException("用户名不存在或者密码错误");
        }
        return null;
    }
}

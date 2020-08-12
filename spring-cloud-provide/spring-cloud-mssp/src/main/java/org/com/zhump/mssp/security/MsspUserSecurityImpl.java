package org.com.zhump.mssp.security;

import org.com.zhump.mssp.service.IMsspUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * 数据库校验用户名和密码
 */
@Component
public class MsspUserSecurityImpl implements UserDetailsService {

    @Autowired
    private IMsspUserService msspUserService;


    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}

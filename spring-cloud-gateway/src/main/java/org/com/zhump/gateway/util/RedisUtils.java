package org.com.zhump.gateway.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;


/**
 * redis操作
 */
@Component(value = "RedisUtils")
public class RedisUtils {

    private static final long timeout = 1000 * 60 * 5;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;



    /**
     * get data by key
     */
    public String get(String key){
        String s = stringRedisTemplate.opsForValue().get(key);
        return s;
    }

    /**
     * create a globally unique token, valid for 5 minutes
     * This token is used by downstream services
     */
    public String createToken(String key){
        if (StringUtils.isBlank(key)){
            return null;
        }
        String token = stringRedisTemplate.opsForValue().get(key);
        if (StringUtils.isBlank(token)){
            token = UUID.randomUUID().toString().replace("-","");
            stringRedisTemplate.opsForValue().set(key,token, timeout,TimeUnit.SECONDS);
        }
        return token;

    }

}

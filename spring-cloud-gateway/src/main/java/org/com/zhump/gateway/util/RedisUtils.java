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

    @Autowired
    private StringRedisTemplate stringRedisTemplate;



    /**
     * 取数据
     */
    public String get(String key){
        String s = stringRedisTemplate.opsForValue().get(key);
        return s;
    }

    /**
     * 创建全局唯一ID，有效时长为5分钟
     */
    public String createToken(String key){
        if (StringUtils.isBlank(key)){
            return null;
        }
        /**
         * get token
         */
        String token = stringRedisTemplate.opsForValue().get(key);
        if (StringUtils.isBlank(token)){
            token = UUID.randomUUID().toString().replace("-","");
            stringRedisTemplate.opsForValue().set(key,token, 5,TimeUnit.MINUTES);
        }
        return token;

    }

}

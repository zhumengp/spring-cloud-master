package org.com.zhump.mssp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;


/**
 * redis操作
 */
@Component(value = "RedisUtils")
public class RedisUtils {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 放数据
     */
    public void set(String key,String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }

    /**
     * 取数据
     */
    public String get(String key){
        String s = stringRedisTemplate.opsForValue().get(key);
        return s;
    }

    /**
     * 删除数据
     */
    public void del(String key){
        stringRedisTemplate.delete(key);
    }
    /**
     * 存放有时间
     */
    public void set(String key,String value,Long expire){
        stringRedisTemplate.opsForValue().set(key,key,expire);
    }

}

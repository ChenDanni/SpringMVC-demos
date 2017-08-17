package com.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * Created by cdn on 17/8/16.
 */
@Service
public class CacheService {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void cacheValue(String key, String value, int expireTime){
        if (redisTemplate == null){
            System.out.println("err");
        }

        redisTemplate.opsForValue().set(key, value);
        if (expireTime > 0){
            redisTemplate.expire(key, expireTime, TimeUnit.SECONDS);
        }
    }

    public String getValue(String key){
        if (redisTemplate == null){
            System.out.println("err");
        }
        return redisTemplate.opsForValue().get(key);
    }
}

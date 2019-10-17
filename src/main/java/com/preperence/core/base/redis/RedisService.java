package com.preperence.core.base.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Author ： xy.
 * @Date ：Created in 15:10 2019/8/12
 * @Version: 1.0
 */
@Service
public class RedisService {
    @Autowired
    JedisPool jedisPool;

    public String get(String key) {
        Jedis jp = null;
        try {
            jp = jedisPool.getResource();
            String str = jp.get(key);
            return str;
        } finally {
            returnPool(jp);
        }
    }

    public Boolean set(String key, String value) {
        Jedis jp = null;
        try {
            jp = jedisPool.getResource();
            jp.set(key, value);
            return true;
        } finally {
            returnPool(jp);
        }
    }

    private void returnPool(Jedis jedis) {
        if (jedis != null) {
            jedis.close();
        }
    }
}

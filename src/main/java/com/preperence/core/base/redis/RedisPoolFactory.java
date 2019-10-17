package com.preperence.core.base.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author ： xy.
 * @Date ：Created in 23:07 2019/8/11
 * @Version: 1.0
 */
@Component
public class RedisPoolFactory {
    @Autowired
    RedisConfig redisConfig;

    /**
     * 获取jedie连接池
     * @return
     */
    @Bean
    public JedisPool getJedisResource() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(redisConfig.getPoolMaxIdle());
        jedisPoolConfig.setMaxTotal(redisConfig.getPoolMaxTotal());
        jedisPoolConfig.setMaxWaitMillis(redisConfig.getPoolMaxWait() * 1000);
        JedisPool jedisPool = new JedisPool(jedisPoolConfig,redisConfig.getHost(),redisConfig.getPort(),redisConfig.getTimeout(),redisConfig.getPassword(),redisConfig.getDb());
        return jedisPool;
    }
}

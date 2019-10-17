package com.preperence.core.base.redis;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author ： xy.
 * @Date ：Created in 17:54 2019/8/11
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {
    private String host;
    private String password;
    private Integer port;
    private Integer timeout;
    private Integer db;
    private Integer poolMaxTotal;
    private Integer poolMaxIdle;
    private Integer poolMaxWait;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getDb() {
        return db;
    }

    public void setDb(Integer db) {
        this.db = db;
    }

    public Integer getPoolMaxTotal() {
        return poolMaxTotal;
    }

    public void setPoolMaxTotal(Integer poolMaxTotal) {
        this.poolMaxTotal = poolMaxTotal;
    }

    public Integer getPoolMaxIdle() {
        return poolMaxIdle;
    }

    public void setPoolMaxIdle(Integer poolMaxIdle) {
        this.poolMaxIdle = poolMaxIdle;
    }

    public Integer getPoolMaxWait() {
        return poolMaxWait;
    }

    public void setPoolMaxWait(Integer poolMaxWait) {
        this.poolMaxWait = poolMaxWait;
    }
}

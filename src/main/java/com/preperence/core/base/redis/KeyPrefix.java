package com.preperence.core.base.redis;

/**
 * @Author ： xy.
 * @Date ：Created in 23:05 2019/8/24
 * @Version: 1.0
 */
public interface KeyPrefix {

    int expireSeconds();

    String getPrefix();
}

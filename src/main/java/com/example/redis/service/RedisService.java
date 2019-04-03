package com.example.redis.service;

/**
 * Created by gly on 2019-3-21.
 *
 * @author
 */
public interface RedisService {
    void set(String key,String value);

    Object get(String key);
}

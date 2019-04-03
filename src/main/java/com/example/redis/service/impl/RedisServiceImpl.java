package com.example.redis.service.impl;/**
 * Created by gly on 2019-3-21.
 *
 * @author
 */

import com.example.common.utils.RedisUtil;
import com.example.redis.service.RedisService;
import org.springframework.stereotype.Service;

/**
 * @Project : springboot-demo
 * @Package Name : com.example.redis.service.impl
 * @author guoguo
 * @Description:
 * @Author gly on 2019-3-21 19:59.
 */
@Service
public class RedisServiceImpl implements RedisService{
    @Override
    public void set(String key, String value) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.set(key,value);
    }

    @Override
    public Object get(String key) {
        RedisUtil redisUtil = new RedisUtil();
        return redisUtil.get(key);
    }
}

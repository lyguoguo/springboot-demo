package com.example;/**
 * Created by gly on 2019-3-21.
 *
 * @author
 */

import com.example.redis.service.RedisService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project : springboot-demo
 * @Package Name : com.example
 * @author guoguo
 * @Description:
 * @Author gly on 2019-3-21 20:04.
 */

public class RedisTest extends BaseJunit4Test {

    @Autowired
    private RedisService redisService;

    @Test
    public void set(){
        redisService.set("name","guoguo");
    }

    @Test
    public void get(){
        Object value = redisService.get("name");
        System.out.println("name："+value);

    }
}

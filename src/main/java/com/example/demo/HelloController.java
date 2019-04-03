package com.example.demo;/**
 * Created by gly on 2019-3-21.
 *
 * @author
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : springboot-demo
 * @Package Name : com.example.test.web
 * @author guoguo
 * @Description:
 * @Author gly on 2019-3-21 18:47.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}

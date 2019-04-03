package com.example.demo;/**
 * Created by gly on 2019-3-21.
 *
 * @author
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Project : springboot-demo
 * @Package Name : com.example.demo
 * @author guoguo
 * @Description:
 * @Author gly on 2019-3-21 19:12.
 */
@Controller
public class JspController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}

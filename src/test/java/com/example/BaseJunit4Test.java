package com.example;/**
 * Created by gly on 2019-3-21.
 *
 * @author
 */

import com.example.demo.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Project : springboot-demo
 * @Package Name : com.example
 * @author guoguo
 * @Description:
 * @Author gly on 2019-3-21 20:04.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseJunit4Test {
}

package com.silly.shop;

/**
 * Created by F2845529 on 2017/11/28.
 */

import com.silly.shop.context.ApplicationContextHolder;
import com.silly.shop.model.user.User;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

/**
 * @BeforeClass ==> @Before ==> @Test ==> @After ==> @AfterClass
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RedisMapperTest {
    @Test
    public void testApplicationContextAware() {
        ApplicationContextHolder.checkApplicationContext();
        RedisTemplate redisTemplate = ApplicationContextHolder.getBean("redisTemplate");
        System.out.println("testApplicationContextAware:" + redisTemplate);
    }

    /**
     * mybatis 2 cache
     */
    @Test
    public void testUser() {
        RedisTemplate redisTemplate = ApplicationContextHolder.getBean("redisTemplate");
        User user = new User();
        user.setUserId("1234");
        user.setEmail("fff@163.com");
        user.setPhoneNum("159999999");
        user.setPsw("79852");
        user.setAvastar("f");
        redisTemplate.opsForValue().set(user.getUserId() + "", user, 2, TimeUnit.MINUTES);
        user = (User) redisTemplate.opsForValue().get(user.getUserId() + "");
        System.out.println(user);
    }
}

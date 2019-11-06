package com.offcn.springbootdemo2;


import com.offcn.Springbootdemo2Application;
import com.offcn.pojo.Muser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springbootdemo2Application.class)
public class appTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void test01(){
        System.out.println("----");
    }
    @Test
    public void getReids(){
        System.out.println("111");
        redisTemplate.opsForValue().set("name","wangjiyu");
        System.out.println("2222");
        String a = (String) redisTemplate.opsForValue().get("name");
        System.out.println(a);
        Muser user = new Muser();
        user.setUid(1);
        user.setUname("wangjiyu");
        user.setPwd(123456);
        redisTemplate.opsForValue().set("user",user);
        Muser user1 = (Muser) redisTemplate.opsForValue().get("user");

        System.out.println(user1);
    }
}

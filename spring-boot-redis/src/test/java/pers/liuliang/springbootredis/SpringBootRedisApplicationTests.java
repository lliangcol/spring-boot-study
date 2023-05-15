package pers.liuliang.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringBootRedisApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis() {
        redisTemplate.boundValueOps("name").set("liuliang");
    }

    @Test
    public void testRedis2() {
        BoundValueOperations boundValueOperations = redisTemplate.boundValueOps("name");
        Object name = boundValueOperations.get();
        System.out.println(name);
    }
}

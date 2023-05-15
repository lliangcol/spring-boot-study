package pers.liuliang.springbootcondition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootConditionApplication {

    public static void main(String[] args) {
        // 启动 SpringBoot 应用，返回上下文对象
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootConditionApplication.class, args);

        // 未配置依赖的情况下：
        // Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'redisTemplate' available
        Object redisTemplate = context.getBean("redisTemplate");
        System.out.println(redisTemplate);

        Object user = context.getBean("user");
        System.out.println("user = " + user);
    }
}

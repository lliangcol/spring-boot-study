package pers.liuliang.springbootenable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import pers.liuliang.springboottest.config.EnableUserService;
import pers.liuliang.springboottest.service.UserService;

/**
 * ComponentScan 扫描范围是当前包及其子包
 * <p>
 * 1. 使用 ComponentScan 注解指定扫描包；
 * 2. 使用 Import 注解导入类；
 */
@SpringBootApplication
// @ComponentScan("") // 指定扫描包及其子包下的所有类
//@ComponentScan("pers.liuliang.springboottest.service")
//@Import(UserService.class)
@EnableUserService
public class SpringBootEnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootEnableApplication.class, args);

        //UserService userService = (UserService) context.getBean("userService");
        UserService userService = (UserService) context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}

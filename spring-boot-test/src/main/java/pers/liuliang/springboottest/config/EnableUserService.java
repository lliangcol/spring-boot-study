package pers.liuliang.springboottest.config;

import org.springframework.context.annotation.Import;
import pers.liuliang.springboottest.service.UserService;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(UserService.class)
public @interface EnableUserService {

}

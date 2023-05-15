package pers.liuliang.springboothello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pers.liuliang.springboothello.model.Role;
import pers.liuliang.springboothello.model.User;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/15 - 21:31
 */
@Configuration
public class UserConfig {
    @Bean
    public User user() {
        return new User();
    }

    @Bean
    public Role role() {
        return new Role();
    }
}

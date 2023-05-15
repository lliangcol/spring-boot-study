package pers.liuliang.springbootcondition.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import pers.liuliang.springbootcondition.condition.ClassCondition;
import pers.liuliang.springbootcondition.condition.ConditionOnClass;
import pers.liuliang.springbootcondition.domain.User;

@Configuration
public class UserConfig {
    @Bean
    //@Conditional(ClassCondition.class)
    //@ConditionOnClass("redis.clients.jedis.Jedis")
    @ConditionalOnProperty(name = "user.enable", havingValue = "true")
    public User user() {
        return new User();
    }
}

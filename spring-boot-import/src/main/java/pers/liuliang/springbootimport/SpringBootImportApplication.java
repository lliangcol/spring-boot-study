package pers.liuliang.springbootimport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import pers.liuliang.springboothello.config.MyImportBeanDefinitionRegistrar;
import pers.liuliang.springboothello.config.MyImportSelector;
import pers.liuliang.springboothello.config.UserConfig;
import pers.liuliang.springboothello.model.Role;
import pers.liuliang.springboothello.model.User;

@SpringBootApplication
//@Import(User.class) // 1. 导入 Bean
//@Import(UserConfig.class) // 2. 导入配置类
//@Import(MyImportSelector.class) // 3. 导入 ImportSelector 实现类
@Import(MyImportBeanDefinitionRegistrar.class) // 4. 导入 ImportBeanDefinitionRegistrar 实现类
public class SpringBootImportApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootImportApplication.class, args);
		User user = context.getBean(User.class);
		System.out.println(user);

		Role role = context.getBean(Role.class);
		System.out.println(role);
	}

}

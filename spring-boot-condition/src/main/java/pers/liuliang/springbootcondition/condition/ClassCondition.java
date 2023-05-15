package pers.liuliang.springbootcondition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class ClassCondition implements Condition {
    /**
     * @param context  判断条件能使用的上下文（环境），用于获取 BeanFactory、ClassLoader、Environment、ResourceLoader
     * @param metadata 注解的信息，元对象，可以获取到当前注解的所有信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
/*        // 1. 需求：导入 Jedis 坐标后创建 Bean
        // 2. 获取当前环境中是否存在 jedis.clients.jedis.Jedis 类
        // 3. 如果存在，返回 true，否则返回 false
        try {
            Class<?> clazz = Class.forName("redis.clients.jedis.Jedis");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }*/

        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String[] values = (String[]) map.get("value");

        boolean flag = true;
        for (String value : values) {
            try {
                Class<?> clazz = Class.forName(value);
            } catch (ClassNotFoundException e) {
                flag = false;
                break;
            }
        }

        return flag;
    }
}

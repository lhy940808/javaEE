package cn.web.anno;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnno {
    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
//    测试一：用注解的方式创建实例
    @Test
    public void testBean() {
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.test();
    }

//    测试二：使用注解的方式实现属性注入
    @Test
    public void tesstProperty() {
        User user= (User) context.getBean("user");
        user.test();
    }

//    测试三：使用注解的方式实现属性注入，方式二
    @Test
    public void testResorce() {
        User u = (User) context.getBean("user");
        u.test();
    }

//    测试四：使用注解和配置文件的混合方式实现实例的创建和属性注入
    @Test
    public void testMix() {
        MixWay mix = (MixWay) context.getBean("mix");
        mix.test();
    }
}


package cn.web.anno;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试使用注解的方式实现aop操作
public class TestAnno {

    private ApplicationContext context;
    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("cn/web/anno/bean.xml");
    }

    @Test
    public void testAnno() {
        User user = (User) context.getBean("user");
        user.test();
    }
}

package cn.web.c3p0;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC3p0 {
    @Test
    public void testAdd() {
        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
        Service service = (Service) context.getBean("service");
        service.test();

    }
}

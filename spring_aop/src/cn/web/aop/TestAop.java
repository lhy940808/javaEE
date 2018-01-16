package cn.web.aop;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

//    测试aop的基本操作，将mybook增强到book类中
    @Test
    public void testAop() {
        Book book = (Book) context.getBean("book");
        book.add();
    }
}

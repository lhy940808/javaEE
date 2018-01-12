package Property;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//属性注入两种方式的实现方法的测试
public class TestProperty {

//    测试一：有参数的构造器的方式
    @Test
    public void testConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        constructor cs = (constructor) context.getBean("property1");
        System.out.println(cs.name);
    }

    //测试二：使用setter实现属性注入
    @Test
    public void testSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        setter s = (setter) context.getBean("property2");
        System.out.println(s.name);
    }
}

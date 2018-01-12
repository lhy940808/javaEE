package Property;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//属性注入两种方式的实现方法的测试
public class TestProperty {

    public  ApplicationContext context;

    @Before
    public void setContext() {
        context = new ClassPathXmlApplicationContext("spring-core.xml");
    }
//    测试一：有参数的构造器的方式
    @Test
    public void testConstructor() {
        constructor cs = (constructor) context.getBean("property1");
        System.out.println(cs.name);
    }

    //测试二：使用setter实现属性注入
    @Test
    public void testSetter() {
        setter s = (setter) context.getBean("property2");
        System.out.println(s.name);
    }

    //测试三：注入对象类型属性的方法
    @Test
    public void testObeject() {
        Service s = (Service) context.getBean("service");
        s.test();
    }

//    测试四：注入复杂类型属性的方法
    @Test
    public void testComplex() {
        ComplexObeject complex = (ComplexObeject) context.getBean("complex");
        complex.test();
    }
}

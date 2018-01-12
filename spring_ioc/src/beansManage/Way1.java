package beansManage;

//1 这个包中主要是实现类实例化的三种方法

import entity.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Way1 {
    // 2 此类为方法一：使用类的无参数构造函数（需要重点掌握的）
    @Test
    public void Beans1() {
        // 解析xml配置文件，得到实例
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");

        // 2 得到实例创建的对象
        UserService user = (UserService) context.getBean("user");
        UserService user1 = (UserService) context.getBean("user");
        System.out.println("user way 1--" + user);
        System.out.println(user1);
        user.add();
    }

    //方法二 ：静态工厂来创建
    @Test
    public void beans2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        UserService user = (UserService) context.getBean("bean2");
        user.add();
    }

//    方法三：利用实例工厂来创建对象
    @Test
    public void beans3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        UserService user = (UserService)context.getBean("beans3");
        System.out.println(user);

    }
}

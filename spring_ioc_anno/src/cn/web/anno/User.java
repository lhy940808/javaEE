package cn.web.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value="user")
@Service(value="user")
public class User {
    //使用注解实现对象类型注入
//    1 在类里面声明一个对象引用变量
//    方式一：使用@Autowired
    @Autowired
    private Book book;

    public void test() {
        System.out.println("test user--------" );
        book.test();
    }
}


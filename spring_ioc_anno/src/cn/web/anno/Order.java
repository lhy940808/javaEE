package cn.web.anno;


import javax.annotation.Resource;

public class Order {
//    使用注解的方式实现属性注入的方式二
    //声明一个引用变量

    @Resource(name="book")
    public Book book;

    public void test() {
        System.out.println("order-");
        book.test();
    }
}

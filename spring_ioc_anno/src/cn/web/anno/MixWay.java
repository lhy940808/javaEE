package cn.web.anno;

import javax.annotation.Resource;

//该类使用混合方式进行实例创建和属性注入
//所谓混合创建就是，实例的创建使用配置文件实现，属性注入使用注解的方式实现
public class MixWay {
    @Resource(name="book1")
    private Book book;

    public void test() {
        System.out.println("mix way---");
        book.test();
    }
}

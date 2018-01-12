package Property;
//该包主要是实现属性注入的两种方式
//方法一：使用类的有参构造器来实现
public class constructor {
    public  String name;
    public constructor(String name) {
        this.name = name;
    }
}

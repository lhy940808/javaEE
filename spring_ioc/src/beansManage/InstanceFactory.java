package beansManage;

import entity.UserService;

//利用实例工厂来创建对象：
//实例工厂就是返回类对象的方法是非静态的
public class InstanceFactory {
    public UserService getUser() {
        return new UserService();
    }
}

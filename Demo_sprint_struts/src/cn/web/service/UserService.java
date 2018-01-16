package cn.web.service;

import cn.web.dao.UserDao;

public class UserService {

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }
    public void test() {
        System.out.println("service-----");
        dao.test();
    }
}

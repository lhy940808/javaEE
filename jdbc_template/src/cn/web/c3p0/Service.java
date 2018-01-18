package cn.web.c3p0;

public class Service {
    private Dao dao;

    public void setDao (Dao dao) {
        this.dao = dao;
    }

    public void test() {
        this.dao.add();
    }

}

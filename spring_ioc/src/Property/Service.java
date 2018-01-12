package Property;
//假设想在service类中引用dao类，在spriing的实现
public class Service {
    private Dao dao;
    public void setDao(Dao dao) {
        this.dao = dao;
    }
    public void test() {
        System.out.println("service---------");
        dao.test();
    }
}

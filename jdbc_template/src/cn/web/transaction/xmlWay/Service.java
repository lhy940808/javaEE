package cn.web.transaction.xmlWay;

//这个包里主要演示spring中事务的管理--配置文件实现方式

//案例：数据库有一个账户表，记录了每个用户的存储金额，现在A要向B赚钱，则要对A的记录进行减去转入的金额，B则要加上转入的金额
public class Service {

    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

//    业务逻辑层，实现转钱操作
    public void accountMoney ()  {
        this.dao.lessMoney();
//        这里的异常是为了检验事务的功能
        int i = 10 /0;
        this.dao.moreMoney();
    }

}

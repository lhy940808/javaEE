package cn.web.transaction.xmlWay;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试spring的事务管理
public class TestTx {
    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("cn/web/transaction/xmlWay/spriing-tx.xml");
    }

    @Test
    public void testTransaction() {
        Service service = (Service)context.getBean("service");
        service.accountMoney();
    }
}

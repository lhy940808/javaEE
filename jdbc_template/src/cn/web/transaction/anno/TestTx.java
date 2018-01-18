package cn.web.transaction.anno;


import cn.web.transaction.anno.Service;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//测试spring的事务管理---注解方式实现--这种方式会在加了@transactional的类上的所有方法都加上事务
public class TestTx {
    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("cn/web/transaction/anno/spriing-tx-anno.xml");
    }

    @Test
    public void testTransaction() {
        Service service = (Service)context.getBean("service");
        service.accountMoney();
    }
}

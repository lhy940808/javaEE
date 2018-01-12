import entity.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIOC {
  @Test
    public void  TestUser() {
        //1 读取配置文件中的类信息
        ApplicationContext  context = new ClassPathXmlApplicationContext("spring-core.xml");

        //2 得到配置创建的对象
        UserService user = (UserService) context.getBean("user");
        System.out.println(user);
        user.add();
    }
}

package cn.web.action;

import cn.web.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAction  extends ActionSupport{
    @Override
    public String execute() throws Exception {

//        以下是性能比较差的实现，spring帮我们解决了这个，在服务器一启动的时候就创建这个变量，利用了监听器和动态代理的技术
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService service = (UserService) context.getBean("userService");
        service.test();
        return NONE;
    }
}

package cn.web.anno;

//增强类

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//第二步，在增强类上使用aop注解
@Aspect
public class MyUser {

//    在方法上面使用注解完成增强配置
    @Before(value="execution(* cn.web.anno.User.test(..))")
    public void test() {
        System.out.println("myUser---before");
    }

    @AfterReturning(value="execution(* cn.web.anno.User.*(..))")
    public void after() {
        System.out.println("这是后置通知类型");
    }

//    @Around(value="execution(* cn.web.anno.User.*(..))")
//    public void around() {
//        System.out.println("这是环绕通知，方法之前和之后都会执行");
//    }
}

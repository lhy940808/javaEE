package cn.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//这是aspectj的aop操作的第一步，创建增强类，也就是要将该类的某个方法作用在被增强类的某个或者多个方法上，扩展被增强类的作用
public class MyBook {

    public void before1() {
        System.out.println("这是一个前置通知类型");
    }

    public void after() {
        System.out.println("这是一个后置通知类型");
    }

    public void exception() {
        System.out.println("这是一个异常通知类型");
    }

    public void finallyExcute() {
        System.out.println("这是一个后置之后类型");
    }

//    环绕通知，跟上面稍微有点不一样
    public void beforeAndAfter(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        被增强的方法之前执行的逻辑
        System.out.println("这是环绕类型 之前");

//        执行被增强的方法
        proceedingJoinPoint.proceed();

//        被增强方法之后执行的逻辑
        System.out.println("这是环绕通知之后");
    }
}

package org.springframework.module.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.print.attribute.standard.JobName;
import java.util.Arrays;

//@Component
//@Aspect
public class LogUtils {

	public Object around(ProceedingJoinPoint pjp){
		Object[] args = pjp.getArgs();
		Object result = null;
		try {
			System.out.println("log---环绕通知start 参数:" +Arrays.asList(args) );
			result = pjp.proceed();
		} catch (Throwable e) {
			System.out.println("异常通知--- stop");
		} finally {
			System.out.println("log-- 环绕通知结束 ： result " + result);
		}
		System.out.println("around -- 方法");
		return result;
	}
	public Object start(JoinPoint joinPoint){

		System.out.println("before -- 方法");
		return 100;
	}
	public void logFinally(JoinPoint joinPoint){
		System.out.println("afterReturning -- 方法");
	}
	public void stop(JoinPoint joinPoint){
		System.out.println("after -- 方法");
	}
	public void logException(JoinPoint joinPoint){
		System.out.println("AfterThrowing -- 方法");
	}
}

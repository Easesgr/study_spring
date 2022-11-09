package org.springframework.module.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashSet;

@Component
@Aspect
public class LogUtils {

	@Pointcut(value = "execution(public Integer org.springframework.module.aop.annotation.MyCalculator.*(Integer,Integer))")
	public void myPointcut(){};

	@Around(value = "myPointcut()")
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
	@Before(value = "myPointcut()")
	public Object start(JoinPoint joinPoint){
		HashSet<Character> set = new HashSet<>();
		System.out.println("before -- 方法");
		return 100;
	}
	@AfterReturning(value = "myPointcut()")
	public void logFinally(JoinPoint joinPoint){
		System.out.println("afterReturning -- 方法");
	}

	@After(value = "myPointcut()")
	public void stop(JoinPoint joinPoint){
		System.out.println("after -- 方法");
	}

	@AfterThrowing(value = "myPointcut()")
	public void logException(JoinPoint joinPoint){
		System.out.println("AfterThrowing -- 方法");
	}
}

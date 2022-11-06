package org.springframework.module.instantiation;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.module.suppier.User;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {


	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("执行创建之前---");
		BeforeInstantiation beforeInstantiation = (BeforeInstantiation) methodProxy.invoke(o, objects);
		System.out.println("执行创建之后---");
		return beforeInstantiation;
	}
}

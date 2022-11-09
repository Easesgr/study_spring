package org.springframework.module.proxy.jdk;

import java.lang.reflect.Proxy;

public class TestJDKProxy {
	public static void main(String[] args) {
		// 设置代理类的存放目录
		System.getProperties().put("com.anyi.proxy.jdk",true);
		// 创建需要代理的类
		MyCalculate myCalculate = new MyCalculate();
		// 代理增强类
		DynamicProxy dynamicProxy = new DynamicProxy(myCalculate);
		Calculate calculateProxy = (Calculate) Proxy.newProxyInstance(
				myCalculate.getClass().getClassLoader() // 类加载器
				, myCalculate.getClass().getInterfaces() // 传入实现的接口
				, dynamicProxy); // 传入代理增强类
		int add = calculateProxy.add(1, 1);
		System.out.println(add);
	}
}

package org.springframework.module.proxy.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.module.proxy.jdk.MyCalculate;

public class CglibTest {
	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(MyCglibCalculate.class);
		enhancer.setCallback(new MyMethodInterceptor());
		MyCglibCalculate myCglibCalculate = (MyCglibCalculate) enhancer.create();
		int add = myCglibCalculate.add(1, 1);
		System.out.println(add);
	}
}

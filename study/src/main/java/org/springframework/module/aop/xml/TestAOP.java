package org.springframework.module.aop.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	public static void main(String[] args) {ClassPathXmlApplicationContext aop = new ClassPathXmlApplicationContext("aop.xml");
		MyCalculator myCalculate = (MyCalculator) aop.getBean("myCalculator");
		Integer add = myCalculate.add(1, 1);
		System.out.println(add);
	}
}
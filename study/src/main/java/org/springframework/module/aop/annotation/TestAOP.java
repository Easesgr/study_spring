package org.springframework.module.aop.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(SpringAopConfiguration.class);
		ac.refresh();
		MyCalculator bean = ac.getBean(MyCalculator.class);
		System.out.println(bean.add(1,1));
	}
}
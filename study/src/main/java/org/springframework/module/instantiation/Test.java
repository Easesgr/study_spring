package org.springframework.module.instantiation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("instantiation.xml");
		BeforeInstantiation instantiation = (BeforeInstantiation) ac.getBean("instantiation");
		instantiation.doSomeThing();
	}
}

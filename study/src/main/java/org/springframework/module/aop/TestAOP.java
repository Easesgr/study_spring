package org.springframework.module.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext aop = new ClassPathXmlApplicationContext("aop.xml");
	}
}
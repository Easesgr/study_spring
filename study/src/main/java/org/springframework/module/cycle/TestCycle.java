package org.springframework.module.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("cycle.xml");
		A a = (A) ac.getBean("a");
		System.out.println(a);
		System.out.println(a.getB());
	}
}

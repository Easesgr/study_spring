package org.springframework.module;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
//		MyClassPathApplicationContext ac = new MyClassPathApplicationContext("application.xml");
		 ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
//		// ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("editor.xml");
//		Person person = (Person) ac.getBean("person");
//		Class1 class1 = (Class1) ac.getBean("class1");
//		Object myBeanFactory = ac.getBean("&myFactoryBean");
//		User user = (User) ac.getBean("myFactoryBean");A
//		System.out.println(user);
//		User user1 = (User) ac.getBean("myFactoryBean");
//		System.out.println(user1);
//		System.out.println(class1.getStudent());
//		System.out.println(person);
//		System.out.println(myBeanFactory);

//		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
//		Object user = ac.getBean("dog");
//		ac.close();
	}
}
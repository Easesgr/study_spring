package org.springframework.module.tx.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.module.tx.xml.service.BookService;

public class TestTxXml {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac =new ClassPathXmlApplicationContext("tx.xml");
		BookService bookService = (BookService) ac.getBean("bookService");
		bookService.checkout(1);
		System.out.println("扣减成功");
	}
}

package org.springframework.module.tx.annoation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.module.tx.annoation.config.SpringTxConfig;
import org.springframework.module.tx.annoation.service.BookService;

public class TestAnno {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringTxConfig.class);
		BookService bean =  ac.getBean(BookService.class);
		bean.checkout(1);
	}
}

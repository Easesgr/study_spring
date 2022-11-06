package org.springframework.module.beforebpp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {
	private String name;

	@PostConstruct
	public void init(){
		System.out.println("执行初始化");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("执行了销毁");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

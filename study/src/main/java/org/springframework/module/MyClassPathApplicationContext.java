package org.springframework.module;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathApplicationContext(String... configLocations){
		super(configLocations);
	}
	@Override
	protected void initPropertySources() {
		System.out.println("extend initPropertySources");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		//修改属性值
		setAllowBeanDefinitionOverriding(false);
		setAllowCircularReferences(false);
		// 调用父类方法，继续执行后面的方法
		super.customizeBeanFactory(beanFactory);
	}
}

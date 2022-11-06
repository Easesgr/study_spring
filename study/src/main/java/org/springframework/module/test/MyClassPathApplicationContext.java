package org.springframework.module.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.module.selfbfpp.MyBeanDefinitionRegisterPostProcessor;
import org.springframework.module.selfbfpp.MyBeanFactoryPostProcessor;

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
		addBeanFactoryPostProcessor(new MyBeanDefinitionRegisterPostProcessor());
		super.customizeBeanFactory(beanFactory);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("--------------------");
	}
}

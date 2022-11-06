package org.springframework.module.selfbfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

public class MyselfBeanDefinitionRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用了postProcessBeanFactory --- MyselfBeanDefinitionRegisterPostProcessor");
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("调用了postProcessBeanDefinitionRegistry --- MyselfBeanDefinitionRegisterPostProcessor");
	}
}

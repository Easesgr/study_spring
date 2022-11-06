package org.springframework.module.selfbfpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

public class MyBeanDefinitionRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("调用了postProcessBeanFactory---MyBeanDefinitionRegisterPostProcessor");

	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("调用了postProcessBeanDefinitionRegistry---MyBeanDefinitionRegisterPostProcessor");
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MyselfBeanDefinitionRegisterPostProcessor.class);
		builder.addPropertyValue("name","shuaige");
		registry.registerBeanDefinition("anyi",builder.getBeanDefinition());
	}
}

package org.springframework.module.shouldSkip;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.module.test.Person;

@Configuration
@Conditional(WindowsCondition.class)
public class BeanConfig {
	@Bean("person1")
	public Person person1(){
		return new Person(1,"zhangsan");
	}
	@Bean("person2")
	public Person person2(){
		return new Person(2,"lisi");
	}
}

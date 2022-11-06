package org.springframework.module.myfactorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.module.selftag.User;

public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject() throws Exception {
		return new User("anyi","111@qq.com","1234");
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isSingleton() {
		return FactoryBean.super.isSingleton();
	}
}

package org.springframework.module;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.module.methodOverrides.FruitPlate;

public class TestMethodOverride {
	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("methodOverride.xml");
		FruitPlate fruitPlate1 = (FruitPlate) ac.getBean("fruitplate1");
		fruitPlate1.getFruit();
		FruitPlate fruitPlate2 = (FruitPlate) ac.getBean("fruitplate2");
		fruitPlate2.getFruit();
	}

}
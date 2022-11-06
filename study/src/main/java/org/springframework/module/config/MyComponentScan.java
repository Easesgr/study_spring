package org.springframework.module.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.springframework.module.selftag"})
public class MyComponentScan {
	@Configuration
	@ComponentScan(basePackages = {"org.springframework.module.selftag"})
	class innerClass{

	}
}

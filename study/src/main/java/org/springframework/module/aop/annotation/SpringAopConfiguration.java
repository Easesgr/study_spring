package org.springframework.module.aop.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.springframework.module.aop.annotation"})
@EnableAspectJAutoProxy
public class SpringAopConfiguration {
}

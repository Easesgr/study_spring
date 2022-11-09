package org.springframework.module.aop.annotation;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class MyCalculator {

	public Integer add(Integer x, Integer y) {
		Integer result = x + y;
		return result;
	}
	public Integer div(Integer x, Integer y) {
		Integer result = x / y;
		return result;
	}

	public Integer sub(Integer x, Integer y) {
		Integer result = x - y;
		return result;
	}

	public Integer mul(Integer x, Integer y) {
		Integer result = x / y;
		return result;
	}
}

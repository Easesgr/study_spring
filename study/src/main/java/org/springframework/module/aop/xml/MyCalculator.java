package org.springframework.module.aop.xml;

public class MyCalculator {
	public Integer add(int x, int y) {
		Integer res = x + y;
		return res;
	}

	public Integer div(int x, int y) {
		return x / y;
	}

	public Integer sub(int x, int y) {
		return x - y;
	}

	public Integer mul(int x, int y) {
		return x / y;
	}
}

package org.springframework.module.proxy.cglib;

import org.springframework.module.proxy.jdk.Calculate;

public class MyCglibCalculate implements Calculate {
	public int add(int x, int y) {
		return x + y;
	}

	public int div(int x, int y) {
		return x / y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public int mul(int x, int y) {
		return x / y;
	}
}

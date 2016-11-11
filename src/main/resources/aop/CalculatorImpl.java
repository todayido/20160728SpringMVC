package aop;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int div(int i, int j) {
		return i/j;
	}

}

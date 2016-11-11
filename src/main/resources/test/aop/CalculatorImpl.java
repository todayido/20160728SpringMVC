package test.aop;

public class CalculatorImpl implements Calculator {

	public int add(int i, int j) {
		System.out.println("I："+i+" J："+j);
		return i + j;
	}

	public int sub(int i, int j) {
		System.out.println("I："+i+" J："+j);
		return i - j;
	}

}

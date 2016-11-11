package test.aop;

public class TestAOP {

	public static void main(String[] args) {
//		Calculator cal = new CalculatorImpl();
//		System.out.println(cal.add(1, 2));
//		System.out.println(cal.sub(5, 3));
		
		
		Calculator calculator = new CalculatorNologImpl();
		
		Calculator proxy = new CalculatorProxy(calculator).getLogingProxy();	

		System.out.println(proxy.getClass().getName());
		int a = proxy.add(4, 2);
		System.out.println(a);
		int b = proxy.sub(3, 1);
		System.out.println(b);
	}
	
}

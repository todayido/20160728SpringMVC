package test.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculatorProxy {
	
	private Calculator target;
	
	public CalculatorProxy(){
		
	}
	
	public CalculatorProxy(Calculator tartget){
		this.target = tartget;
	}
	
	public Calculator getLogingProxy(){
		
		Calculator proxy = null;
		
		ClassLoader classLoader = target.getClass().getClassLoader();
		
		Class []interfaces = new Class[]{Calculator.class};
		
		InvocationHandler h = new InvocationHandler() {
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				
				System.out.println("The method "+method.getName()+" "+Arrays.asList(args));
				Object object = method.invoke(target, args);
				return object;
			}
		};
		
		proxy = (Calculator)Proxy.newProxyInstance(classLoader, interfaces, h);
		return proxy;
		
	}
}

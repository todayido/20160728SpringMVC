package aopxml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {
	
	public void declarePotinCut(){}

	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("2、beforeMethod 前置通知，方法名："+joinPoint.getSignature().getName()+" 方法参数 ："+Arrays.asList(joinPoint.getArgs()));
	}
	
	public void afterMethod(JoinPoint joinPoint){
		System.out.println("6、afterMethod 后置通知");
	}
	
	public void afterReturning(JoinPoint joinPoint, Object result){
		System.out.println("7、afterReturning: 返回通知 ：" + result);
	}
	
	public void afterThrowing(JoinPoint joinPoint, ArithmeticException ex){
		System.out.println("7、afterThrowing 异常通知..." + ex);
	}
	 
	public Object around(ProceedingJoinPoint pjp){
		Object result = null;
		try {
			System.out.println("1、Around:前置通知"+pjp.getSignature().getName());
			result  = pjp.proceed();
			System.out.println("3、Around:返回通知：返回结果为："+result);
		} catch (Throwable e) {
			System.out.println("4、Around:异常通知");
		}
		
		System.out.println("5、Around:后置通知");
		return result;
	}
}

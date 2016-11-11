package aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
	
	// 声明切入点表达式
	// 其他的通知使用方法名来使用该表达式
	@Pointcut("execution(* aop.Calculator.*(int,int))")
	public void declarePotinCut(){}

	@Before("declarePotinCut()")
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("2、beforeMethod 前置通知，方法名："+joinPoint.getSignature().getName()+" 方法参数 ："+Arrays.asList(joinPoint.getArgs()));
	}
	
	@After("declarePotinCut()")
	public void afterMethod(JoinPoint joinPoint){
		System.out.println("6、afterMethod 后置通知");
	}
	
	@AfterReturning(value="execution(* aop.Calculator.*(int,int))",returning="result")
	public void afterReturning(JoinPoint joinPoint, Object result){
		System.out.println("7、afterReturning: 返回通知 ：" + result);
	}
	
	@AfterThrowing(value="execution(* aop.Calculator.*(int,int))",throwing="ex")
	public void afterThrowing(JoinPoint joinPoint, ArithmeticException ex){
		System.out.println("7、afterThrowing 异常通知..." + ex);
	}
	 
	@Around(value="execution(* aop.Calculator.*(int,int))")
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

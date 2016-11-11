package aopxml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class ValidateAspect {
	
	public void beforeMethod(JoinPoint joinPoint){
		System.out.println("ValidateAspect...");
	}
	
}

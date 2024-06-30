package com.springLearning.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

public class EmployeeFeedbackAfter implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] parms, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Return Value : "+returnValue);
		System.out.println("Thanks for Registering");
		
	}
	
	

}

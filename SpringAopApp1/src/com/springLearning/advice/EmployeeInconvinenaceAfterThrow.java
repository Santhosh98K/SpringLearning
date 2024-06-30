package com.springLearning.advice;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

public class EmployeeInconvinenaceAfterThrow implements ThrowsAdvice{
	
	
	public void afterThrowing(Method method, Object[] parm, Object target, Exception e) {
		 System.out.println("Power Failure Excetion");
	}

}

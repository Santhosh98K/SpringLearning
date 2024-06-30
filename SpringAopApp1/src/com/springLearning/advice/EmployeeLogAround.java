package com.springLearning.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class EmployeeLogAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Signed In");
		mi.proceed();
		System.out.println("Signed Off");
		return null;
	}

}

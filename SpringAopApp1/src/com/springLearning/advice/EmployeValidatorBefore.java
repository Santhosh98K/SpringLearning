package com.springLearning.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;


import com.springLearning.beans.Employe;

public class EmployeValidatorBefore implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] parm, Object target) throws Throwable {
		// TODO Auto-generated method stub
		
		System.out.println("++++++++++++++++++++");
		
		System.out.println("The method to which before applied :  "+method.getName());
		System.out.println("The Buisness compomentclass : "+target.getClass());
		System.out.println("Before Started");
		Employe emp = (parm[0] != null)? (Employe)parm[0]: (new Employe()) ;
		if(emp.getEmpId() < 1) {
			System.out.println("Employee Id is only positive number");
		}
		System.out.println("Before Ended -- Validation Over");
		System.out.println("++++++++++++++++++");
	}

}

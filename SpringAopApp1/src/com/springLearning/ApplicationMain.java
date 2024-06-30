package com.springLearning;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springLearning.beans.Employe;
import com.springLearning.service.IEmployee;


public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/springLearning/resources/ApplicationContext.xml");
		Employe emp = (Employe)context.getBean("EmpBean");
		IEmployee empimpl = (IEmployee) context.getBean("empProxy");
		
		//Before Validation applied to this method alone
		try{
			empimpl.getEmployeeDetials(emp);
		}
		catch(Exception e){
			
		}
		System.out.println("\n==============================\n");
		//Before Validation not applied to this method alone
		empimpl.getEmployeeName(emp);
		
				
	}

}

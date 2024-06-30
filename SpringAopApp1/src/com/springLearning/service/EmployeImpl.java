package com.springLearning.service;

import com.springLearning.beans.Employe;

public class EmployeImpl implements IEmployee {

	@Override
	public void getEmployeeDetials(Employe emp) {
		// TODO Auto-generated method stub
		
		System.out.println("Emp Name : "+ emp.toString());
		//throw new RuntimeException();
		
	}
	
	@Override
	public void getEmployeeName(Employe emp) {
		// TODO Auto-generated method stub
		System.out.println("Emp Name : "+ emp.toString());

		
	}

}

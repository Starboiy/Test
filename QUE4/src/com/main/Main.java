package com.main;

import com.employee.Employee;
import com.manager.Manager;

public class Main {
public static void main(String[] args) {
	Employee employee=new Employee();
	System.out.println(employee.calsal(30000));
	
	Manager manager =new Manager();
	System.out.println(manager.calsal(30000, 500));
}
}



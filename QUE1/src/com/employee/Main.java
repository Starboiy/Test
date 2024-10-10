package com.employee;
class Employee{
	String name;
	int id;
	double sal;
	String address;
	
	Employee(String name,int id,double sal,String address){
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;

	}
	Employee(){
		
	}
	
	@Override
	public String toString() {
		return "Employee [name = " + name + ", id = " + id + ", sal = " + sal + ", address = " + address + "]";
	}
}
public class Main {
public static void main(String[] args) {
	
	Employee employee = new Employee();
	System.out.println(employee);
	
	Employee employee2 = new Employee();
	employee2.name="Aditya";
	employee2.id=1;
	employee2.sal=30000;
	employee2.address="Mumbai";
	
	System.out.println(employee2.name);
	System.out.println(employee2.id);
	System.out.println(employee2.sal);
	System.out.println(employee2.address);
	
}
}
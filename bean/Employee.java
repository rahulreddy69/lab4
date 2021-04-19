package com.cg.eis.bean;
import java.util.Scanner;

import com.cg.eis.service.EmployeeService;

public class Employee implements EmployeeService {
	
	int id;
	String name;
	int salary;
	String designation;
	String insuranceScheme;
	Scanner sc = new Scanner(System.in);
	public void getDetail()
	{
		name = sc.next();
		id = sc.nextInt();
		salary = sc.nextInt();
		designation = sc.next();
	}
	public void Scheme()
	{
		if(salary>10000 || designation=="Manager")
		{
			insuranceScheme="FixedDeposit";
		}
		else
			insuranceScheme="SavingsScheme";
	}
	public void Display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(designation);
		System.out.println(insuranceScheme);
	}

}
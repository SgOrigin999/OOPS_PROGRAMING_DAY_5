package com.bridgelab.employeewage.day5;

public class EmployeeWage {
	public static final int FULL_TIME = 1;
	public  void checkAvilablity() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::" + empCheck);
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
	}
	
	public static void main(String[] args) {
		EmployeeWage emp= new EmployeeWage();
		System.out.println("Welcome To Employee Wage Computation Day Five::");
		System.out.println("Check Employee Avilablity::");
		emp.checkAvilablity();
	}
}

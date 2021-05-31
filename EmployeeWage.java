package com.bridgelab.employeewage.day5;

public class EmployeeWage {
	public static final int FULL_TIME = 1;
	public static int WAGEPERHOUR = 20;
	public static int FULL_TIME_HRS=8;
	public  void checkAvilablity() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::" + empCheck);
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
	}
	
	public  int  calculateDailyWage() {
		int totalWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			totalWage = WAGEPERHOUR * FULL_TIME_HRS;
			System.out.println("Employee daily Wage::" + totalWage);
		} else {
			System.out.println("Employee daily Wage::" + totalWage);
		}
		return totalWage;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Day Five::");
		EmployeeWage emp= new EmployeeWage();
		System.out.println("Check Employee Avilablity::");
		emp.checkAvilablity();
		System.out.println("Calculate Daily Wage::"+emp.calculateDailyWage());
		
	}
}

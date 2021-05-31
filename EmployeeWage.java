package com.bridgelab.employeewage.day5;

public class EmployeeWage {
	public static final int FULL_TIME = 1;
	public static final int HALF_TIME = 0;
	public static int WAGEPERHOUR = 20;
	public static int FULL_TIME_HRS = 8;
	public static int HALF_TIME_HRS = 4;
	public static int NUM_OF_WORKING_DAYS = 20;
	public static int MAX_WORKING_HRS = 100;

	public void checkAvilablity() {
		double empCheck = Math.floor(Math.random() * 10) % 2;
		System.out.println("Emp Check Value::" + empCheck);
		if (empCheck == FULL_TIME) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is not Present");
		}
	}

	public int calculateDailyWage() {
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

	public double partTimeWage() {
		int totalWage = 0;
		int partTimrHrs = 8;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			totalWage = WAGEPERHOUR * partTimrHrs;
			System.out.println("Employee PartTimeIf Present Wage::" + totalWage);
		} else {
			System.out.println("Employee Absent Then Wage::" + totalWage);
		}
		return totalWage;
	}

	public double wageForMonth() {
		int empHrs;
		int empWage;
		int totalWage = 0;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case FULL_TIME:
				empHrs = 8;
				break;
			case HALF_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			empWage = WAGEPERHOUR * empHrs;
			totalWage = totalWage + empWage;
		}
		return totalWage;

	}

	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Computation Day Five::");
		EmployeeWage emp = new EmployeeWage();
		System.out.println("Check Employee Avilablity::");
		emp.checkAvilablity();
		System.out.println("Calculate Daily Wage::" + emp.calculateDailyWage());
		System.out.println("Add Part Time wage::" + emp.partTimeWage());
		System.out.println("Calculate  Wage For Month::" + emp.wageForMonth());

	}
}

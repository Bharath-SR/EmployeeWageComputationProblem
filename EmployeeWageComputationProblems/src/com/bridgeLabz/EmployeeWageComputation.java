/**
 * 
 */
package com.bridgeLabz;

import java.util.Random;

/**
 * @author Admin
 *
 */
public class EmployeeWageComputation {

	/**
	 * UC5: Calculating Wages For a Month (days =20)
	 */
	public static void main(String[] args) {
		// Driving Class
		
		Random random = new Random();
		

		int wagePerHour = 20;
		int fullDayHour = 8;
		int wagePerDay = 0;
		int partTimeHours = 4;
		int monthlySalary = 0;
		

		for (int days = 1; days <= 20; days++) {
			int attendance = random.nextInt(3);
			wagePerDay =0;
			switch (attendance) {

			case 0:
				System.out.println("Employee Absent");
				break;

			case 1:
				System.out.println("Employee is Present PartTime");
				wagePerDay = partTimeHours * wagePerHour;
				break;
			case 2:
				System.out.println("Employee is Present Full Time");
				wagePerDay = wagePerHour * fullDayHour;
				break;
			}

			monthlySalary = monthlySalary + wagePerDay;
			System.out.println(days+ " : " + monthlySalary);
		}
}
}

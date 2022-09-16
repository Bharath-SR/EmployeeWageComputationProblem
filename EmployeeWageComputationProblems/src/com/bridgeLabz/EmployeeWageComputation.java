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
	 * UC2: Calculate Daily Employee Wage
	 */
	public static void main(String[] args) {
		// Driving Class
		
		Random random = new Random();
		int attendance = random.nextInt(3);

		int wagePerHour = 20;
		int fullDayHour = 8;
		int wagePerDay = 0;

		if (attendance == 2) {
			System.out.println("Employee is Present Full Day");
			wagePerDay = wagePerHour * fullDayHour;
		}
		 else
			System.out.println("Employee is Absent");

		System.out.println("Employee Wage Per Day is :" + wagePerDay);
	}

}

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
	 * UC4: Solving Using Switch Case Statement
	 */
	public static void main(String[] args) {
		// Driving Class
		
		Random random = new Random();
		int attendance = random.nextInt(3);

		int wagePerHour = 20;
		int fullDayHour = 8;
		int wagePerDay = 0;
		int partTimeHours = 4;
		
		switch(attendance){
		case 0:
			System.out.println("Employee is Absent");
		break;
		case 1:
			System.out.println("Employee is Present Part Time");
			wagePerDay = wagePerHour * partTimeHours;
		break;
		case 2:
			System.out.println("Employee is Present Full Day");
			wagePerDay = wagePerHour * fullDayHour;
		break;
		}
		System.out.println("Employee Wage Per Day is :" + wagePerDay);

		
	}

}

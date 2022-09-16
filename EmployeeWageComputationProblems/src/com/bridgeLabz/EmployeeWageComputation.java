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
	 * UC1: Check Employee is Present or Absent (Using Random Function)
	 */
	public static void main(String[] args) {
		// Driving Class
		
		Random random = new Random();
		int attendance = random.nextInt(2); 

		if (attendance == 1) {
			System.out.println("Employee is Present");
			
		}
		 else {
			System.out.println("Employee is Absent");

		}

	}

}

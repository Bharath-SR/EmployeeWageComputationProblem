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
	 * UC6: Calculating Wages till a Condtion of total working hours or days is reached
	 */
	static Random random = new Random();

	 int wagePerHour = 20;
     int fullDayHour = 8;
	 int partTimeHours = 4;
	 int wagePerDay = 0;
	 int monthlySalary = 0;
	 int monthlyHour = 0;
	 int days = 0;

	public void EmployeeWage() {
		{
			while (monthlyHour <= 100 || days <= 20) {

				days++;

				int attendance = random.nextInt(3); 
				wagePerDay = 0;
				switch (attendance) {
                case 0:
					System.out.println("Employee Absent");
					break;

				case 1:
					System.out.println("Employee Part Time Present");
					wagePerDay = partTimeHours * wagePerHour;
					monthlyHour = monthlyHour + partTimeHours;
					break;
				case 2:
					System.out.println("Employee Full Day Present..");
					wagePerDay = wagePerHour * fullDayHour;
					monthlyHour = monthlyHour + fullDayHour;
					break;
				}

				monthlySalary = monthlySalary + wagePerDay;
				System.out.println("Days: " + days + " :MonthlyHoursOfEmployee: " + monthlyHour + ": Monthly Salary Of Employee: " + monthlySalary);
			}
		}
	}

	public static void main(String[] args) {
		EmployeeWageComputation empwage =new EmployeeWageComputation();
		empwage.EmployeeWage();
}
}

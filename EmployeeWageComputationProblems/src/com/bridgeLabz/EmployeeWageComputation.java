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
	 * UC8: Employee Wage for Multiple Companies
	 */
	static Random random = new Random();

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHours = 4;
	static int wagePerDay = 0;
	static int monthlySalary = 0;
	static int monthlyHour = 0;
	static int days = 0;

	static void EmployeeWage(String companyName, int empRatePerHour ,int  numOfWorkingDays , int maxHoursPerMonth) {
		{
			while (monthlyHour <= 100 || days <= 20) {

				days++;

				int attendance = random.nextInt(3); // Generate 3 random number 0,1,2
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
		 int totalEmpWage =monthlyHour * empRatePerHour;
	        System.out.println("Total Employee wage for company: " + companyName+" is:" + totalEmpWage);
	        return;
	}

	public static void main(String[] args) {

		EmployeeWage("Campany A",15,22,220);
		EmployeeWage("Caompany B",20,20,200);

	}
}

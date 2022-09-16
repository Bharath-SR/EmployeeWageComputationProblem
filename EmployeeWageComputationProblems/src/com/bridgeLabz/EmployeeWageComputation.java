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
	 * UC9: Save Total Wage of Each Company
	 */
	static Random random = new Random();

	static int wagePerHour = 20;
	static int fullDayHour = 8;
	static int partTimeHours = 4;
	static int wagePerDay = 0;
	static int monthlySalary = 0;
	static int monthlyHour = 0;
	static int days = 0;
	static String companyName;

	public EmployeeWageComputation(String companyName, int wagePerHour, int days, int monthlyHour) {
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.days = days;
		this.monthlyHour = monthlyHour;
	}

	static void ComputeEmployeeWage() {
		{
			while (monthlyHour <= 100 && days != 20) {
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
		int totalEmpWage = monthlyHour * wagePerHour;
		System.out.println("Total Employee wage for company: " + companyName + " is:" + totalEmpWage);
		return;
}

	public static void main(String[] args) {
		EmployeeWageComputation company1 = new EmployeeWageComputation("Company A",15,22,220);
		company1.ComputeEmployeeWage();
		EmployeeWageComputation company2 = new EmployeeWageComputation("Company B",20,20,200);
		company2.ComputeEmployeeWage();
		}
}

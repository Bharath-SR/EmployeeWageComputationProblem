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
	 * UC10: Employee Wage of Multiple Companies
	 */
	public static final int partTime = 1;
	public static final int fullTime = 2;

	public class CompanyEmpWage {
		public final String company;
		public final int empRatePerHour;
		public final int numOfWorkingDays;
		public final int maxHoursPerMonth;

		public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
			this.company = company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		}

	}

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;

	public EmployeeWageComputation() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	private void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			int totalEmpWage = calculateEmpHrs(companyEmpWageArray[i]);
			System.out.println("Total Employee Wage for Company " + companyEmpWageArray[i].company + " is : " + totalEmpWage);
		}
	}

	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth);
		numOfCompany++;
	}

	private int calculateEmpHrs(CompanyEmpWage companyEmpWage) {
		// Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		// Computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case fullTime:
				empHrs = 8;
				break;
			case partTime:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}

			totalEmpHrs += empHrs;
			System.out.println("Day : " + totalWorkingDays + " Emp Hrs : " + empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String args[]) {
		EmployeeWageComputation employeeWageBuilder = new EmployeeWageComputation();
		employeeWageBuilder.addCompanyEmpWage("Company A",15,22,220);
		employeeWageBuilder.addCompanyEmpWage("Company B",20,20,200);
		employeeWageBuilder.computeEmpWage();
	}
}

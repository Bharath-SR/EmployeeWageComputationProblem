/**
 * 
 */
package com.bridgeLabz;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Admin
 *
 */
public class EmployeeWageComputation {

	/**
	 * UC11: Employee Wage of Multiple Companies using Interface Approach
	 */
	public interface ComputeEmpWage {
		public void addEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth);
		public void computeCompanyWage();
	}
	public static class CompanyWage {
		public String company;
		public int empRatePerHour;
		public int numWorkingDays;
		public int maxHourPerMonth;
		public int totalWage;

		public CompanyWage(String company, int empRatePerHour, int numWorkingDays, int maxHourPerMonth) {
			this.company = company;
			this.empRatePerHour = empRatePerHour;
			this.numWorkingDays = numWorkingDays;
			this.maxHourPerMonth = maxHourPerMonth;
		}
		public void setTotalWage(int totalwage) {
			this.totalWage = totalwage;
		}
		public String toString() {
			return "Total emp wage for company: " + company + " is " + totalWage;
		}
	}
	public static class EmpBuilder implements ComputeEmpWage {
		static final int fullTime = 2;
		static final int partTime = 1;
		public ArrayList<CompanyWage> compempwagelist;
		private int n = 0;
		public EmpBuilder() {
			compempwagelist = new ArrayList();
		}
		public void addEmployeeWage(String company, int empRatePerHour, int numWorkingDays, int maxHourPerMonth) {
			CompanyWage comp = new CompanyWage(company, empRatePerHour, numWorkingDays, maxHourPerMonth);
			compempwagelist.add(comp);
		}
		public void computeCompanyWage() {
			for (int i = 0; i<compempwagelist.size(); i++) {
				CompanyWage c1 = compempwagelist.get(i);
				c1.setTotalWage(this.ComputeWage(c1));
				System.out.println(c1.totalWage);
			}
		}
		public int ComputeWage(CompanyWage comp) {
			int employeehrs = 0;
			int totalworkdays = 0;
			int totalemphrs = 0;
			while (totalemphrs <= comp.maxHourPerMonth && totalworkdays < comp.numWorkingDays) {
				totalworkdays++;
				int check = (int) Math.floor(Math.random() * 10) % 3;
               switch (check) {
				case 1:
					employeehrs = 4;
					break;
				case 2:
					employeehrs = 8;
					break;
				default:
					employeehrs = 0;
				}
				totalemphrs += employeehrs;
				System.out.println("Employee Working hours for day" + totalworkdays + " is: " + employeehrs);
			}
			return totalemphrs * comp.empRatePerHour;
		}
	}
	public static void main(String[] args) {
		ComputeEmpWage emp = new EmpBuilder();
		emp.addEmployeeWage("Company A",15,22,220);
		emp.addEmployeeWage("Company B",20,20,200);
		emp.computeCompanyWage();
 }
}

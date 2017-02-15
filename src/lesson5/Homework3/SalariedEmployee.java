package lesson5.Homework3;

import lesson5.Homework3.interfaces.Calculate;

public class SalariedEmployee extends Employee implements Calculate {
	
	private String socialSecurityNumber;
	private int hourses, rate;
	
	//Constructor
	public SalariedEmployee(String employeeId, String name) {
		super(employeeId, name);
		socialSecurityNumber = employeeId;
	}
	
	public SalariedEmployee(String employeeId, String name, int rate, int hourses) {
		this(employeeId, name);
		this.hourses = hourses;
		this.rate = rate;
		socialSecurityNumber = employeeId;
	}
	
	public int getSalary() {
		return rate*hourses;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public int calculatePay() {
		
		return getSalary();
	}

}

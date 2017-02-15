package lesson5.Homework3;

import lesson5.Homework3.interfaces.Calculate;

public class ContractEmployee extends Employee implements Calculate {
	
	private String federalTaxIdmember;
	private int valueContractPayment;
	
	public ContractEmployee(String employeeId, String name) {
		super(employeeId, name);
		federalTaxIdmember = employeeId;
	}
	
	public ContractEmployee(String employeeId, String name, int valueContractPayment) {
		super(employeeId, name);
		this.federalTaxIdmember = employeeId;
		this.valueContractPayment = valueContractPayment;
	}
		
	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	@Override
	public int calculatePay() {
		
		return this.valueContractPayment/12;
	}

}

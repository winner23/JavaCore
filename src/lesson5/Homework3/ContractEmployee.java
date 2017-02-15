package lesson5.Homework3;

import lesson5.Homework3.interfaces.Calculate;

public class ContractEmployee extends Employee implements Calculate {

	@Override
	public int calculatePay() {
		
		return 0;
	}

}

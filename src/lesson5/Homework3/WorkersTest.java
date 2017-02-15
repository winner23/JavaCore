package lesson5.Homework3;

import lesson5.Homework3.interfaces.Calculate;

public class WorkersTest {
	
	private void sort(Employee[] workers){
		Employee temp;
		for(int i=0; i<workers.length-1;i++)
			for(int j=i+1; j<workers.length;j++){
				if((((Calculate) workers[i]).calculatePay())<((Calculate) workers[j]).calculatePay()){
					temp = workers[j];
					workers[j] = workers[i];
					workers[i] = temp;
				}
			}
	}
	
	public static void main(String [] args){
		WorkersTest test = new WorkersTest();
		
		Employee[] employeers = new Employee[6];
		employeers[0] = new SalariedEmployee("33445566", "Neil Armstrong", 60, 72);
		employeers[1] = new ContractEmployee("12121212", "Peter Sellers", 42000);
		employeers[2] = new SalariedEmployee("33445577", "Jesse Owens", 48, 76);
		employeers[3] = new ContractEmployee("12121233", "Steve Jobs", 44200);
		employeers[4] = new SalariedEmployee("33445588", "Roger Federer", 65, 48);
		employeers[5] = new ContractEmployee("12121255", "Carl Lewis", 38000);
		
		/*for(Employee worker:employeers){
			System.out.println(worker.getName()+"\t ID:"+worker.getEmployeeld()+" \t Monthly wage: $"+((Calculate) worker).calculatePay());
		}*/
		
		test.sort(employeers);
		System.out.println("The average monthly wage in descending order: ");
		
		for(Employee worker:employeers){
			System.out.println(worker.getName()+"\t ID:"+worker.getEmployeeld()+" \t Monthly wage: $"+((Calculate) worker).calculatePay());
		}
		
	}
	
}

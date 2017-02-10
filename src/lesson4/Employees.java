package lesson4;

public class Employees {

	public static void main(String[] args) {
		
		Employee employees[] = new Employee[1];
		
		for (int i=0; i<employees.length; i++){
			employees[i] = Employee.hiring();
		}

	}

}

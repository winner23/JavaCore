package lesson4;

public class Employees {

	private Employee[] sort(boolean ascending, Employee employees[]){
		Employee tmp = null;
		Employee res[] = employees;
		for (int i=0; i<res.length-1; i++){
			for (int j=i+1; j<res.length;j++){
				if((ascending)&&(res[i].getSalery()>res[j].getSalery())){
					tmp = res[j];
					res[j] = res[i];
					res[i] = tmp;
				}else if((!ascending)&&(res[i].getSalery()<res[j].getSalery())){
					tmp = res[j];
					res[j] = res[i];
					res[i] = tmp;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		Employees org = new Employees();
		Employee employees[] = new Employee[5];
		
		for (int i=0; i<employees.length; i++){
			employees[i] = Employee.hiring();
			
		}
		
		for(Employee employee: employees){
			System.out.println(employee);
		}
		
		System.out.println("Sort ascending order:");
		employees = org.sort(true, employees);
		
		
		for(Employee employee: employees){
			System.out.println(employee);
		}
		
		System.out.println("Sort descending order:");
		employees = org.sort(false, employees);
		
		for(Employee employee: employees){
			System.out.println(employee);
		}
	}

}

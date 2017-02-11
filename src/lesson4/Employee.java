package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
	
	private String name;
	private Departments departmentName=null;
	private int salery;
	
	Scanner scan = new Scanner(System.in);
		
	public enum Departments {
		Management, Financial, Controling, IT, RnD, Marketing, Production
	}
	//Constructor realized by method hiring()
	private Employee(){}
	
	//Getters and Setters
	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Departments getDepartmentName() {
		return departmentName;
	}

	void setDepartmentName(Departments departmentName) {
		this.departmentName = departmentName;
	}
	
	void setDepartmentName(String departmentName) {
		
		this.departmentName = findDepartmentName(departmentName);
	}

	int getSalery() {
		return salery;
	}

	void setSalery(int salery) {
		this.salery = salery;
	}
	//Parsing name of department
	private Departments findDepartmentName(String strDepartmentName){
		
		Departments result;
		
		switch(strDepartmentName){
		case "Management":{
			result = Departments.Management;
			break;
		}
		case "Financial":{
			result = Departments.Financial;
			break;
		}
		case "Controling":{
			result = Departments.Controling;
			break;
		}
		case "IT":{
			result = Departments.IT;
			break;
		}
		case "RnD":{
			result = Departments.RnD;
			break;
		}
		case "Marketing":{
			result = Departments.Marketing;
			break;
		}
		case "Production":{
			result = Departments.Production;
			break;
		}
		default: {
			result = null;
		}
		}
		return result;
	}
		
	//Enter data manually 	
	private void inputData(){
		System.out.println("Enter data for new employee");
		System.out.print("Name: ");
		setName(scan.next());
		System.out.print("Enter the name of deparment ");
		System.out.print(Arrays.toString(Departments.values())+ "\n:");
		do{
			setDepartmentName(findDepartmentName(scan.next()));
		}while(getDepartmentName() == null);
		System.out.print("Salery: ");
		setSalery(scan.nextInt());	
	}
	
	public static Employee hiring(){
		Employee result = new Employee();
		result.inputData();
		return result;
	}
	
	@Override
	public String toString(){
		return "Name:"+getName()+ " (Department:"+getDepartmentName()+" ), Salary: "+getSalery();	
	}
}

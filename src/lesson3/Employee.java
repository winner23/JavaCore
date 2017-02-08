package lesson3;

public class Employee {

	private String name;
	private double rate;
	private int hours;
	private static int totalHours;
	
	//Constructors
	public Employee() {
		this.name = "UnknowName";
	}

	public Employee(String name, double rate) throws Exception {
		setName(name);
		this.setRate(rate);
	}

	public Employee(String name, double rate, int hours) throws Exception {
		setName(name);
		this.setRate(rate);
		this.setHours(hours);
	}
	
	
	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if(validateName(name)) {
			this.name = name;	
		} else {
			throw new Exception("Incorect Name");
		}
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		if(rate>0.01){
			this.rate = rate;
		}	
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours>1){
			if (this.hours<1){
				Employee.totalHours -= this.hours;
			}
			Employee.totalHours += hours;
			this.hours = hours;
		}
	}
	
	
	//Methods of tasks
	public double salary() {
		if (hours<1 || rate <0.01) {
			System.out.println("Worning!!! Data for salary isn't correct!!! Employee:"+getName());
		}
		return rate * hours; 
	}
	
	public void changeRate(double rate) {
		this.rate = rate;
	}
	
	public double bonuses(){
		
		return salary() * 0.2;
	}
	public double bonuses(double bonus){
		if (bonus<1){
			return salary() * bonus;
		}
		System.out.println("Incorect bonus!");
		return salary();
	}
	
	@Override
	public String toString() {
		return "[Name: "+getName()+", rate: "+getRate()+", hours: "+getHours()+"],[Salery:"+salary()+" , Bonuses:"+bonuses()+"]";
	}
	
	//Service methods
	
	//Validate if it correct name
	private boolean validateName(String name) {
		// Validate name format
		if(name.length()>1)	{
			return true;
		} else {
			return false;
		}
	}
	
	//Entry point of class
	public static void main(String ...args) {
		Employee employee1 = new Employee();
		Employee employee2 = null;
		Employee employee3 = null;
		try{
			employee2 = new Employee("Alex", 10.0);
			employee3 = new Employee("Pavel", 15.0, 22);
			
			employee1.setName("Bill");
			employee1.setHours(20);
			employee1.setRate(17.5d);
			
			employee2.setHours(23);
		} catch (Exception e) {
			System.out.println("Incorrect making object:"+e.getMessage());
		}
		
		System.out.println("Total hours of all workers: "+Employee.totalHours);
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		
	}

}

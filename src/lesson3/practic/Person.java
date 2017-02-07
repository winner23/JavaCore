package lesson3.practic;

import java.time.DateTimeException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Person {
	
	private String name;
	private int birthYear;
	static final int  MAXLifeSpan = 122; //Maximum life span
	
	//Constructors
	
	public Person(String name, int birthYear) {
		this.name = name;
		this.setBirthYear(birthYear);
	}
	
	public Person() {
		this.name="UnknownName";
		this.birthYear = getYear();
		
	}
	
	//Getters and Setters
	
	String getName() {
		return name;
	}
	void setName(String name) throws Exception {
		if(validateName(name)) {
			this.name = name;	
		} else {
			throw new Exception("Incorect Name");
		}
	}
	
	int getBirthYear() {
		return birthYear;
	}
	
	void setBirthYear(int birthYear) {
		int maxYear = getYear();
		int minYear = maxYear-Person.MAXLifeSpan;
		if ((birthYear<maxYear) && (birthYear>=minYear)) {
			this.birthYear = birthYear;
		} else {
			throw new DateTimeException("Incorrect Birthday Date for person: "+this.getName());
		}
	}
	
		
	//Task methods
	
	public int age(){
		return getYear() - getBirthYear();
	}
	
	public void input(){
		Scanner getText = new Scanner(System.in);
		System.out.print("Enter name: ");
		name = getText.next();
		System.out.print("Enter birth year: ");
		birthYear = getText.nextInt();
	}
	
	public void output(){
		System.out.printf("This person name is %s , age is %d and was born in %d \n",getName(), age(), getBirthYear());	
	}
	
	public void changeName(String name) throws Exception{
		setName(name);
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
	
	//Return current year
	
	private int getYear(){
		return new GregorianCalendar().get(Calendar.YEAR);
	}
	//Fabric method with manual input of data
		/*public static Person input(){
			Scanner getText = new Scanner(System.in);
			System.out.print("Enter name: ");
			String name = getText.nextLine();
			System.out.print("Enter birth year: ");
			int birthYear = getText.nextInt();
			Person result = new Person(name, birthYear);
			getText.close();
			return result;
		}*/
	@Override
	public String toString(){
		return "[Name:" + getName() + ", age:" + age() + ", birth year:" + getBirthYear() +"]";
	}
	
	//Entry Point
	public static void main(String ... args){
		//make object without data
		Person person1 = new Person();
		person1.output();
		person1.input();
		System.out.println("Now this person got new data: " + person1);
		
		Person person2 = new Person("Igor", 1950);
		System.out.println(person2);
		
		Person person3 = new Person("Oleg", 1992);
		person3.output();
		
		Person person4 = new Person("Andriy", 2006);
		person4.output();
		person4.input();
		System.out.println("Now this person got new data: " + person4);
		
		//Incorrect data for object
		try {
			Person person5 = new Person("",0);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
}

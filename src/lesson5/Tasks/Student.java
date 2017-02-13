package lesson5.Tasks;

public class Student extends Person {

	final static public TypePerson TYPE_PERSON=TypePerson.Student;
	
	
	public Student(String name){
		setName(name);
	}
	
	@Override
	public void print() {
		
		System.out.println("This is a "+TYPE_PERSON+ " , name is "+getName());
	}

}

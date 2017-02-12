package lesson5;

public abstract class Person {
	private String name;
	
	enum TypePerson {
		Teacher,Cleaner,Student
	}
	
	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public abstract void print();
}

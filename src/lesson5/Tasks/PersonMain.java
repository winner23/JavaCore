package lesson5.Tasks;

public class PersonMain {

	public static void main(String[] args) {
		Person [] school = new Person[5];
		school[0] = new Teacher("Anna", 28, 75);
		school[1] = new Teacher("Roman", 32, 65);
		school[2] = new Cleaner("Ivanna", 8, 45);
		school[3] = new Student("Peter");
		school[4] = new Student("Janna");
		
		
		for (Person person : school){
			person.print();
			}
		
		for (Person person: school){
			if (person instanceof Staff){
				System.out.println(person.getName() +" salary is $"+ ((Staff) person).salary());
			}
		}
		
	}

}

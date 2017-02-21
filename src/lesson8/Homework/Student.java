package lesson8.Homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student{
	private String name;
	private Integer course;
	
	
	public Student(String name, Integer course) {
		super();
		this.name = name;
		this.course = course;
	}

	public static void main(String [] args){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ivan",1));
		students.add(new Student("Petro",2));
		students.add(new Student("Vasyl",2));
		students.add(new Student("Ira",1));
		students.add(new Student("Stepan",3));
		students.add(new Student("Igor",3));
		
		Student.printStudents(students, 2);
		
		System.out.println("\nSorted by Name:");
		students.sort(new ComparatorName());
		for(Student student:students){
			System.out.println(student);
		}
		System.out.println("\nSorted by Course:");
		students.sort(new ComparatorCourse());
		for(Student student:students){
			System.out.println(student);
		}
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCourse() {
		return course;
	}

	public void setCourse(Integer course) {
		this.course = course;
	}
	
	//List of students by course;
	public static void printStudents(List<Student> students, int course){
		
		System.out.println("Students for course: "+course);
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext()){
			Student stud = iter.next();
			if(stud.getCourse()==course){
				System.out.println(stud.getName());
			}
		}
	}
	
	private static class ComparatorName implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getName().compareTo(student2.getName());
		}
		
	}
	
	private static class ComparatorCourse implements Comparator<Student>{

		@Override
		public int compare(Student student1, Student student2) {
			
			return student1.getCourse().compareTo(student2.getCourse());
		}
		
	}
	
	@Override
	public String toString(){
		return "Student name: " +getName()+" ,Course: "+getCourse() ;
	}
	
}

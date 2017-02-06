package lesson3.exapmle;

public class Student {
	private String name;
	private int rating;
	private static int number=0;
	private static int sum=0;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getRating() {
		return rating;
	}
	void setRating(int rating) {
		this.rating = rating;
		sum += rating;
	}
	
	public Student(String name){
		this.name = name;
		number++;
	}
	
	public Student(String name, int rating) {
		sum += rating;
		number++;
		this.name = name;
		this.rating = rating;
	}
	double getAvgRaiting(){
		return (double) sum/number;
	}
	
	void changeRaiting(int rating){
		sum -= this.rating;
		this.rating = rating;
		sum += rating;
	}
	
	boolean betterStudent(Student student){
		return this.getRating()> student.getRating();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", rating=" + rating + "]";
	}
		

	
}

package lesson6.Tasks;

import java.util.Scanner;

public class Task1 {

	private Scanner scanner;
	//Manual enter data
	private int input(String question) throws DataFormatException{
		scanner = new Scanner(System.in);
		String inStr;
		boolean correct=true;
		do{
			System.out.print(question);
			inStr = scanner.next();
			//Check format of entered data by regular expression
			correct = inStr.matches("^[-,0-9]+"); 
			if(!correct){
				throw new DataFormatException("Enter Integer value");
			}
		}while(!correct);
		return Integer.parseInt(inStr);
	}
	//Calculate square of rectangle
	private int squareRectangle(int a, int b) throws ArithmeticException {
		if(a<0 || b<0){
			throw new ArithmeticException("Incorect input data. Value must be positive!");
		}
		int res=a*b;
		return res;
	}
	//main
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		int a=0,b=0,square=0;
		try {
			a = t1.input("Enter a: ");
			b = t1.input("Enter b: ");
			square = t1.squareRectangle(a, b);
		} catch (DataFormatException|ArithmeticException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		System.out.println("Area of a rectangle: "+square);
	}
}

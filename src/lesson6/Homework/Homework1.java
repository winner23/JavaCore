package lesson6.Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework1 {

	Scanner scanner;
	private double div(double a,double b){
		return a/b;
	}
	
	
	public static void main(String[] args) {
		
		Homework1 homework = new Homework1();
		homework.scanner = new Scanner(System.in);
		double a=0,b=0;
		try{
			System.out.println("Enter a:");
			a = homework.scanner.nextDouble();
			System.out.println("Enter b:");
			b = homework.scanner.nextDouble();
		}catch(InputMismatchException e){
			System.err.println(e.getMessage());
		}
		System.out.println("a / b = "+homework.div(a, b));
		
	}

}

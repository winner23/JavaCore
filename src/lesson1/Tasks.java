package lesson1;

import java.util.Scanner;

public class Tasks {

	public Tasks(){
		
		//First Task
		
		int a,b;
		//Input Data
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		a = scan.nextInt();
		System.out.print("Enter b: ");
		b = scan.nextInt();
		
		
		//Calculation and output
		System.out.print("a+b=");
		System.out.println(a+b);
		System.out.print("a-b=");
		System.out.println(a-b);
		System.out.print("a*b=");
		System.out.println(a*b);
		System.out.print("a/b=");
		System.out.println(a/b);
		
		//Second Task
		
		System.out.println("How are you? ");
		String answer = scan.next();
		System.out.println("You are " + answer);
		scan.close();
	}

}

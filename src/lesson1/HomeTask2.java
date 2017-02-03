package lesson1;

import java.io.IOException;
import java.util.Scanner;

class HomeTask2 {
	protected HomeTask2() throws IOException{
		String name;
		int age;	
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		name = scan.next();
		System.out.println("How old are you?");
		age = scan.nextInt();
		
		System.out.printf("Your name is %s and age is %d", name, age);
		scan.close();
		
	}
}

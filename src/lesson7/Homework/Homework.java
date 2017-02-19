package lesson7.Homework;

import java.util.Scanner;

class Homework {

	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//First task
		System.out.println("Enter sentence:");
		String str = scanner.nextLine();
		String [] sentence = str.split("[^\\w]+");
		int len = 0;
		int letters = 0; 
		String maxWord=null;
		for(String word:sentence){
			if(len<word.length()){
				maxWord = word;
				len=word.length();
			}
			letters +=word.length();
		}
		System.out.println("a) the longest word is "+maxWord);
		System.out.println("b) the number of sentences letters is "+letters);
		
		StringBuilder revers = new StringBuilder(sentence[1]);
		revers.reverse();
		System.out.println("c) the second word in reverse order: "+revers);
		
	}

}

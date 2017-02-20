package lesson7.Homework;

import java.util.Scanner;

class Homework {

	private static Scanner scanner = new Scanner(System.in);
	
	private String maxWord(String [] sentence){
		String result=null;
		int len = 0;
		for(String word:sentence){
			if(len<word.length()){
				result = word;
				len=word.length();
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Homework task1 = new Homework();
		//First task
		System.out.println("Enter sentence of five words:");
		String str = scanner.nextLine();
		String [] sentence = str.split("[^\\w]+");
		String maxword = task1.maxWord(sentence);
		System.out.println("a) the longest word is "+maxword);
		System.out.println("b) the number of its letters is "+maxword.length());
		StringBuilder revers = new StringBuilder(sentence[1]);
		revers.reverse();
		System.out.println("c) the second word in reverse order: "+revers);
		
		//Second task
		System.out.println("Enter sentence with spaces between words:");
		str = scanner.nextLine();
		sentence = str.split("[ ]+");
		StringBuilder trimInside = new StringBuilder();
		for(String word:sentence){
			trimInside.append(word+" ");
		}
		System.out.println("Trimmed string: "+trimInside);
		
		//Third task
		
	}
}

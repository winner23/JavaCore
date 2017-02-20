package lesson7.Homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	
	private String trimInsideString(String string){
		String [] sentence = string.split("[ ]+");
		StringBuilder trimInside = new StringBuilder();
		for(String word:sentence){
			trimInside.append(word+" ");
		}
		return trimInside.toString();
	}
	//Find all baks
	private String regexFind(String string){
		
		String result="";
		Pattern pattern = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher matcher = pattern.matcher(string);
		while(matcher.find()){
			result +=" "+string.substring(matcher.start(), matcher.end());
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Homework task = new Homework();
		//First task
		System.out.println("Enter sentence of five words:");
		String str = scanner.nextLine();
		String [] sentence = str.split("[^\\w]+");
		String maxword = task.maxWord(sentence);
		System.out.println("a) the longest word is "+maxword);
		System.out.println("b) the number of its letters is "+maxword.length());
		StringBuilder revers = new StringBuilder(sentence[1]);
		revers.reverse();
		System.out.println("c) the second word in reverse order: "+revers);
		
		//Second task
		System.out.println("Enter sentence with spaces between words:");
		str = scanner.nextLine();
		System.out.println("Trimmed string: "+task.trimInsideString(str));
		
		//Third task
		System.out.println("Trimmed string: ");
		str = scanner.nextLine();
		System.out.println("Baks:"+task.regexFind(str));
		
		
		
	}
}

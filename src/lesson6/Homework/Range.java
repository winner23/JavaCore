package lesson6.Homework;

import java.util.Scanner;

public class Range {
	
	private Scanner scanner = new Scanner(System.in);
	
	public int readNumber(int start, int end) throws IllegalArgumentException, NumberFormatException{
		
		int result = scanner.nextInt();
		if (result<end&&result>start){
			return result;
		} else {
			throw new IllegalArgumentException(""+result+" Out of range["+start+"-"+end+"]");
		}
	}
	
	public static void main(String []args){
		Range range = new Range();
		int start = 1;
		int end = 100;
		for(int i=0; i<10; i++){
			
			int tmp = range.readNumber(start, end);
			
			start = tmp;
		}
	}
}

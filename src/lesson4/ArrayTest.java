package lesson4;

import java.util.Arrays;

public class ArrayTest {

	private int [] arr = {7, 0, -9, 1001, 31, -66, 23, 1, -9, 10};
	
	//Method returns the biggest of these numbers
	private int maxElement(){
		int max = 0;
		for (int i=0; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		return max;
	}
	
	//Method returns the sum of positive numbers in the array
	private int sumPositiv(){
		int sum = 0;
		for (int i=0; i<arr.length; i++){
			if(arr[i]>0){
				sum += arr[i];
			}
		}
		return sum;
	}
	
	//Method returns the amount of positive numbers in the array
	private int countPositive(){
		int count = 0;
		for (int i=0; i<arr.length; i++){
			if(arr[i]>0){
				count++;
			}
		}
		return count;
	}
	//Method returns the amount of negative numbers in the array
	private int countNegative(){
		int count = 0;
		for (int i=0; i<arr.length; i++){
			if(arr[i]<0){
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		ArrayTest test = new ArrayTest();
		System.out.println("Array = "+Arrays.toString(test.arr));
		System.out.println("The biggest of these numbers is "+test.maxElement());
		System.out.println("The sum of positive numbers in the array is "+test.sumPositiv());
		
		System.out.println("The amount of negative numbers in the array is "+test.countNegative());
		System.out.println("The amount of positive numbers in the array is "+test.countPositive());

		
		
	}

}

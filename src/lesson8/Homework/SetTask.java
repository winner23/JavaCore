package lesson8.Homework;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetTask {

	private void print(Set set,String msg){
		System.out.print(msg+": ");
		for(Object el:set){
			System.out.print(el.toString()+"  ");	
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		SetTask task = new SetTask();
		
		String [] arrayStr1 = {"one","two","Hello"};
		String [] arrayStr2 = {"one", "seven","eight","Bye"};
		
		Set<String> set1 = new LinkedHashSet<String>();
		Set<String> set2 = new LinkedHashSet<String>();
		
		for(String s:arrayStr1){
			set1.add(s);
		}
		for(String s:arrayStr2){
			set2.add(s);
		}
		
		task.print(set1,"set1");
		task.print(set2,"set2");
		System.out.println("Intersect:");
		
		SetMod<String> smStr = new SetMod<String>();
		
		smStr.intersect(set1, set2);
		task.print(set1,"set1");
		task.print(set2,"set2");
		System.out.println("Union:");
		smStr.union(set1, set2);
		task.print(set1,"set1");
		task.print(set2,"set2");
	}
}

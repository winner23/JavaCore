package lesson8.Homework;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Person {
		
	public static void main(String[] args) {
		Map<String,String> personMap = new LinkedHashMap<>();
		personMap.put("Franko", "Ivan");
		personMap.put("Shevchenko", "Taras");
		personMap.put("Ukrayinka", "Lesya");
		personMap.put("Amosov", "Nikolai");
		personMap.put("Mazepa", "Ivan");
		personMap.put("Velykyy", "Volodymyr");
		personMap.put("Grushevskyy", "Mychaylo");
		personMap.put("Gogol", "Nikolai");
		personMap.put("Stus", "Vasyl");
		personMap.put("Skovoroda", "Grigory");
		
		//Print the entities of the map 
		Person task = new Person();
		task.display(personMap);
		
		//Find duplicates
		int duplicates = task.countDuplicatesValues(personMap);
		if (duplicates>=2){
			System.out.println("\nThere are two persons with the same first name.");
		} else {
			System.out.println("\nThere are less two persons with the same first name.");
		}
		
		//Remove by Value
		String name = "Nikolai";
		System.out.println("\nWithout person with the name "+name+":");
		task.removeValues(name,personMap);
		task.display(personMap);
		
	}
	//Find and remove some Values 
	private void removeValues(String lastName, Map<String, String> personMap) {
		List<String> keys = new ArrayList<String>();
		for(Map.Entry<String, String> element:personMap.entrySet()){
			if(lastName.equals(element.getValue())){
				keys.add(element.getKey());
			}
		}
		for(String key:keys){
			personMap.remove(key);
		}
	}
	//Print Map
	private void display(Map<String,String> map){
		for(Entry<String, String> element:map.entrySet()){
			System.out.println(element.getKey() +" : "+element.getValue());
		}
	}
	//Count Duplicates of Values in Map 
	private int countDuplicatesValues(Map<String, String> personMap) {
		int duplicates = 0;
		String valueTmp;
		List<String> values = new ArrayList<String>();
		for(Map.Entry<String, String> element:personMap.entrySet()){
			values.add(element.getValue());
		}
		while(values.size()>1){
			valueTmp = values.get(0);
			values.remove(0);
			if(values.contains(valueTmp)){
				duplicates++;
				while(values.contains(valueTmp)){
					values.remove(valueTmp);
				}
			}
		}
		return duplicates;
	}

}

package lesson8.Homework;

import java.util.ArrayList;
import java.util.Iterator;
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
		if (duplicates>0){
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
	
	//Print Map
	private void display(Map<String,String> map){
		for(Entry<String, String> element:map.entrySet()){
			System.out.println(element.getKey() +" : "+element.getValue());
		}
	}
	
	//Count Duplicates of Values in Map 
	private int countDuplicatesValues(Map<String, String> personMap) {
		
		Map<String, String> tmpMap = new LinkedHashMap<>(personMap);
		Iterator<String> iter = tmpMap.values().iterator();
		String tmp;
		List<String> dupVal = new ArrayList<String>();
		
		while(iter.hasNext()){
			tmp = iter.next();
			iter.remove();
			if (tmpMap.containsValue(tmp)&&!dupVal.contains(tmp)){
				dupVal.add(tmp);
			}
		
		}
		
		return dupVal.size();
	}
	
	//Find and remove some Values 
		private void removeValues(String lastName, Map<String, String> personMap) {
			
			Iterator<String> elem = personMap.values().iterator();
			while(elem.hasNext()){
				if(elem.next().equals(lastName)){
					elem.remove();
				}
			}

		}
}

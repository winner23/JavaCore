package lesson8.Tasks;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CollectionTask2 {

	private static Scanner scanner = new Scanner(System.in);
	
	//Print elements of Map (key,value)
	private void display(Map<Integer,String> employeeMap){
		for(Map.Entry<Integer, String> element:employeeMap.entrySet()){
			System.out.println(element.getKey() +" : "+element.getValue());
		}
	}
	
	//Find Value by ID
	private void findValue(String str, Map<Integer,String> employeeMap){
		if(str.matches("^[0-9]+")){
			Integer keyInt = Integer.parseInt(str);
			if(employeeMap.containsKey(keyInt)){
				System.out.println("Coresponding name: "+employeeMap.get(keyInt));
			} else {
				System.out.println("Coresponding name for key "+keyInt+" not found.");
			}
		} else {
			System.out.println("Incorrect Integer format for key");
		}
	}
	
	//Find ID by Value
	private void findID(String str, Map<Integer,String> employeeMap){
		if(employeeMap.containsValue(str)){
			for(Map.Entry<Integer, String> element:employeeMap.entrySet()){
				if(element.getValue().equals(str)) {
					System.out.println("Coresponding ID: "+element.getKey());
				}
			}
		} else {
			System.out.println("Coresponding ID not found");
		}
	}
	
	public static void main(String[] args) {
				
		Map<Integer,String> employeeMap = new TreeMap<Integer,String>();
		employeeMap.put(1, "Ira");
		employeeMap.put(2, "Anya");
		employeeMap.put(3, "Roman");
		employeeMap.put(4, "Volodya");
		employeeMap.put(5, "Igor");
		employeeMap.put(6, "Taras");
		employeeMap.put(7, "Vika");
		
		CollectionTask2 task = new CollectionTask2();
		task.display(employeeMap);
		
		System.out.print("Enter ID: ");
		String str = scanner.next();
		task.findValue(str, employeeMap);
		
		System.out.println("Enter value:");
		str = scanner.next();
		task.findID(str, employeeMap);
	}
}

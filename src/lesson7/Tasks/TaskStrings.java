package lesson7.Tasks;

import java.util.Scanner;

public class TaskStrings {

	static private Scanner scanner = new Scanner(System.in); 
	
    private boolean checkSubstring(String string, String subString){
        return string.contains(subString);
    }
    
    private String input(String msg){
		
    	System.out.print(msg);
    	
    	return scanner.next();
    	
    }

    public static void main(String[] args) {

        TaskStrings task = new TaskStrings();
        String str1 = "IT Academy";
        String str2 = "IT";

        System.out.println(task.checkSubstring(str1,str2));
        
        String surname = task.input("Enter Surame: ");
        String name = task.input("Enter Name: ");
        String nampatronymic = task.input("Enter Patronymic Name: ");
        
        

    }
}

package lesson7.Tasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskStrings {

	static private Scanner scanner = new Scanner(System.in); 
	
    private boolean checkSubstring(String string, String subString){
        return string.contains(subString);
    }
    
    private String input(String msg){
    	System.out.print(msg);
    	return scanner.next();
    }

    public static boolean checkWithRegExp(String userNameString){
    	Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
    	Matcher m = p.matcher(userNameString);
    	return m.matches();
    	}

    public static void main(String[] args) {

    	//First task
        TaskStrings task = new TaskStrings();
        String str1 = "IT Academy";
        String str2 = "IT";

        System.out.println(task.checkSubstring(str1,str2));
        
        //Second task
        String surname = task.input("Enter Surame: ");
        String name = task.input("Enter Name: ");
        String patronymic = task.input("Enter Patronymic Name: ");
        
        System.out.println(surname+" "+name.toUpperCase().charAt(0)+". "+ patronymic.toUpperCase().charAt(0)+".");
        System.out.println(name);
        System.out.println(surname+" "+name+" "+patronymic);
        
        //Third task
        boolean correctNames = true;
        for(int i=0;i<5;i++){
        	name = task.input(Integer.valueOf(i)+". Name:");
        	correctNames = correctNames && task.checkWithRegExp(name); 
        }
        if(correctNames){
        	System.out.println("The entered names is valid.");
        } else {
        	System.out.println("The entered names is invalid.");
        }
    }
}

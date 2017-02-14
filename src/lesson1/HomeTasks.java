package lesson1;

import java.io.IOException;

public class HomeTasks {
	
	public static void main(String ... args) throws IOException{
		
		int executeTask = 0;
		Tasks classTasks;
		HomeTask1 task1;
		HomeTask2 task2;
		HomeTask3 task3;
		HomeTask4 task4;
		
		try{
			
			switch (executeTask){
			case 0:{
				classTasks = new Tasks();
				break;
			}
			case 1:{
				task1 = new HomeTask1();
				break;
			}
			case 2:{
				task2 = new HomeTask2();
				break;
			}
			case 3:{
				task3 = new HomeTask3();
				task3 = new HomeTask3(2016);
				break;
			}
			case 4:{
				task4 = new HomeTask4();
				break;
			}
			default:{
				task1 = new HomeTask1();
				task2 = new HomeTask2();
				task3 = new HomeTask3();
				task4 = new HomeTask4();
			}
		
			}
		}catch (IOException e) {
			System.err.println("Entered incorrect data"+e.getMessage());
		}
		
	}
	
}

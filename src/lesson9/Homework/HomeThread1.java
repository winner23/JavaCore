package lesson9.Homework;

public class HomeThread1 {
	//Homework task1
	//The first thread
	Thread thread1 = new Thread(() ->
	{
		for(int i=0;i<5;i++){
			System.out.println("Thread 1 working...");
		}
	});
	//The second thread
	Thread thread2 = new Thread(() ->
	{
		for(int i=0;i<5;i++){
			System.out.println("Thread 2 working...");
		}
	});
	
	public static void main(String [] args){
		HomeThread1 mainThread = new HomeThread1();
		//start two threads
		mainThread.thread1.start();
		mainThread.thread2.start();
		//Wait for ending this threads to start third (main) thread.
		try {
			mainThread.thread1.join();
			mainThread.thread2.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++){
			System.out.println("Main thread working...");
		}
		
		
	}
	
	
}

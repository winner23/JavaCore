package lesson9.Tasks;

public class TreadT1  {

	public static void main(String ...args){
		Thread t1 = new Thread(new Study());
		Thread t2 = new Thread(new Hello());
		Thread t3 = new Thread(new Peace());
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(0);
			t2.join(0);
			t3.join(0);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("My name is Volodya");
		
		
		
	}
	
	
	
}

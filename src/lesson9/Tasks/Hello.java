package lesson9.Tasks;

public class Hello implements Runnable {

	@Override
	public void run() {
		int i=0;
		while(i++<5){
			System.out.println("Hello World");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	} 

}

package lesson9.Tasks;

public class Peace implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("Peace in the peace");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		 
	}

}

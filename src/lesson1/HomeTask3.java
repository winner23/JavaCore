package lesson1;

class HomeTask3 {
	int year;
	
	protected HomeTask3() {
		//year for example
		this.year = 20;
		print(leapYear(year));
	}
	
	protected HomeTask3(int year){
		this.year = year;
		print(leapYear(year));
	}

	private void print(boolean isLeap){
		if(isLeap){
			System.out.print(year);
			System.out.println(" is Leap Year.");
		}else{
			System.out.print(year);
			System.out.println(" is't Leap Year.");
		}
	}
	
	public boolean leapYear(int year){
		
		if ((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0) )){
			return true;
		} else {
			return false;
		}

	}


}

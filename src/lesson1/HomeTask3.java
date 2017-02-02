package lesson1;

public class HomeTask3 {

	
	public HomeTask3() {
		int year = 2500;
		if(leapYear(year)){
			System.out.print(year);
			System.out.println(" is Leap Year.");
		}else{
			System.out.print(year);
			System.out.println(" is't Leap Year.");
		}
		
	}

	static boolean leapYear(int year){
		/*if (year % 4 != 0) {

			return false;

			} else if (year % 100 == 0) {

			return false;

			} else if (year % 400 == 0) {

			return true;

			} else {

			return true;
			
			}*/
		
		
		if ((year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0) )){
			return true;
		} else {
			return false;
		}

	}


}

package lesson1;

class HomeTask4 {
	protected HomeTask4(){
		//Loop for rows
		for (int row=1; row<=5 ; row++){
			if(row % 2 == 0) {
				//Skip even rows
				System.out.println();
				continue;
			}
			//Loop for printing spaces
			for( int sp=2; sp>(row/2); sp--){
				System.out.print("  ");
			}
			//Loop for printing asterisk
			for( int ast=1; ast<=row; ast++){
				System.out.print("* ");
			}
			
			
		}
	}
}

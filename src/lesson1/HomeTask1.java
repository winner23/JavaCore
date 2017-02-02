package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask1 {
	
	public HomeTask1() throws IOException{
		//Create BufferedReader instance for input from console
				BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter the radius: ");
				//Input radius from console 
				String radiusStr = bufRead.readLine();
				double radius = Float.parseFloat(radiusStr);
				
				//Calculate the Perimeter
				double perimeter = radius * Math.PI;
				System.out.print("Perimeter is: ");
				System.out.println(perimeter);
				
				//Calculate the Square
				double sqr = (Math.PI*radius*radius)/4;
				System.out.print("Square is: ");
				System.out.println(sqr);
	}
}

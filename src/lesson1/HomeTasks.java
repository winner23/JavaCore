package lesson1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeTask {
	
	public static void main(String ... args) throws IOException{
		//Create BufferedReader instance for input from console
		BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the radius: ");
		//Input radius from console 
		String radiusStr = bufRead.readLine();
		double radius = Double.parseDouble(radiusStr);
		//Calculate the Perimeter
		Double perimeter = radius * Math.PI;
		
		System.out.println("Perimeter is: " + perimeter.toString());
		//Calculate the Square
		Double sqr = (Math.PI*Math.sqrt(radius))/4;
		System.out.println("Square is: " + sqr.toString());
	}
	
}

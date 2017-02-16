package lesson6.Tasks;

import java.util.Arrays;

public class ColorException extends IllegalArgumentException implements PlantsExeption {

	public ColorException() {
		printCorrectTypes();
	}

	public ColorException(String arg0) {
		super(arg0);
		printCorrectTypes();
	}

	public ColorException(Throwable arg0) {
		super(arg0);
		printCorrectTypes();
	}

	public ColorException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		printCorrectTypes();
	}
	public void printCorrectTypes(){
		System.err.println("Incorrect type! Use only:"+Arrays.deepToString(Color.values()));
	}
}

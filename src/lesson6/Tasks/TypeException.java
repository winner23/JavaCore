package lesson6.Tasks;

import java.util.Arrays;

public class TypeException extends IllegalArgumentException implements PlantsExeption {

	public TypeException() {
		printCorrectTypes();
	}

	public TypeException(String s) {
		super(s);
		printCorrectTypes();
	}

	public TypeException(Throwable cause) {
		super(cause);
		printCorrectTypes();
	}

	public TypeException(String message, Throwable cause) {
		super(message, cause);
		printCorrectTypes();
	}
	public void printCorrectTypes(){
		System.err.println("Incorrect type! Use only:"+Arrays.deepToString(Type.values()));
	}

}

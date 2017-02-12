package lesson5;

import lesson5.interfaces.Animal;

public class Dog implements Animal{

	private Type animalType;
	
	public Dog(){
		animalType = Type.Mammals;
	}
	
	public Type getAnimalType(){
		return animalType;
	}
	
	@Override
	public boolean voice() {
		System.out.println("Woof");
		return true;
	}

	@Override
	public String[] feed() {
		String [] feeds = new String[2];
		feeds[0] = "Meet";
		feeds[1] = "Porridge";
		return feeds;
	}

}

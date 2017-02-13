package lesson5.Tasks;

import lesson5.Tasks.interfaces.Animal;

public class Cat implements Animal{

	private Type animalType;
	
	public Cat(){
		animalType = Type.Mammals;
	}
	
	public Type getAnimalType() {
		return animalType;
	}

	@Override
	public boolean voice() {
		System.out.println("Myau!");
		return true;
	}

	@Override
	public String[] feed() {
		String feeds[] = new String[4];
		feeds[0]="Mouse";
		feeds[1]="Birds";
		feeds[2]="Cheese";
		feeds[3]="Milk";
		
		return feeds;
		
	}

}

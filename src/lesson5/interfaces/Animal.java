package lesson5.interfaces;

import lesson5.interfaces.Animal.Type;

public interface Animal {
	boolean voice();
	
	String [] feed();
	
	Type getAnimalType();
	
	enum Type {Fish, Amphibians, Reptiles, Birds, Mammals, Insects, Molluscs, Crustaceans, Corals, Arachnidas
		
	}

}

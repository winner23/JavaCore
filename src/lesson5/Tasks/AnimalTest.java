package lesson5.Tasks;

import lesson5.Tasks.interfaces.Animal;

public class AnimalTest {
	
	public static void main(String [] args){
		Animal [] animals = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Dog();
		for(Animal animal:animals){
			if(animal instanceof Cat){
				System.out.print("\nThis is a cat. It is a ");
			}
			if(animal instanceof Dog){
				System.out.print("\nThis is a dog. It is a ");
			}
			System.out.println(animal.getAnimalType());
			animal.voice();
			System.out.println("It likes eat:");
			for(String feed: animal.feed()){
				System.out.print(feed+"  ");
			}
		}
		
	}
}

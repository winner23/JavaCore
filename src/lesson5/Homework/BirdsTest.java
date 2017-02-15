package lesson5.Homework;

import lesson5.Homework.Bird.Sex;

public class BirdsTest {
	static Bird birds[] = new Bird[4];
	
	public static void main(String [] args){
		birds[0] = new Eagle(Sex.male, "white head");
		birds[1] = new Swallow(Sex.female,"white and black");
		birds[2] = new Penguin(Sex.female, "wings are fins");
		birds[3] = new Chicken(Sex.male, "bright feathers");
		
		for(Bird bird:birds){
			System.out.print(bird+" ");
			bird.fly();
			System.out.println();
		}
	}
}

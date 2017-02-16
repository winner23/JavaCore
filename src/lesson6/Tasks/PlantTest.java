package lesson6.Tasks;

public class PlantTest {

	public static void main(String[] args) {
		
		Plants [] plants = new Plants[5];
		
		try{
			plants[0] = new Plants("Mosses", "red", 2);
			plants[1] = new Plants("Ferns", "green", 4);
			plants[2] = new Plants("cycads", "yellow", 7);
			plants[3] = new Plants("Conifers", "green", 15);
			plants[4] = new Plants("Flowering", "blue", 5);
		}catch(TypeException |ColorException e){
			((PlantsExeption) e).printCorrectTypes();
		}
		
		for( Plants plant: plants){
			System.out.println(plant);
		}
	}

}

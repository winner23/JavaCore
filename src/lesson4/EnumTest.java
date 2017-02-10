package lesson4;

public class EnumTest {

	public enum Continents {
		Eurasia, Africa, North_America, South_America, Antarctica, Australia
	};
	Continents  continent;
	
	public Continents getContinent(String city){
		
		switch (city){
		case "Australia":{
			continent = Continents.Australia;
			break;
		}
		case "Morocco": case "Algeria": case "Libya": case "Egypt": case "Sudan": case "Mali": case "Nigeria": case "Ethiopia": {
			continent = Continents.Africa;
			break;
		}
		case "Antarctica":{
			continent = Continents.Antarctica;
			break;
		}
		case "Ukraine": case "Russia": case "Spain": case "Germany": case "Poland": case "Kazakhstan": case "Mongolia": case "China":{
			continent = Continents.Eurasia;
			break;
		}
		case "Brazil": case "Argentina": case "Bolivia": case "Colombia": case "Peru": case "Venezuela":{
			continent = Continents.South_America;
			break;
		}
		case "United States": case "Canada": case "Mexico": case "Guatemala": {
			continent = Continents.North_America;
			break;
		}
		default:{
			continent = null;
		}
		}
		
		return continent;
		
	}
	
	
	public static void main(String [] args){
		EnumTest test = new EnumTest();
		String country = "Ukraine";
		System.out.println(test.getContinent(country));
		
	}

}

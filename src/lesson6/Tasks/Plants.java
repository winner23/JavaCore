package lesson6.Tasks;

public class Plants {

	int size;
	Color color;
	Type type;
	
	public Plants(String type, String color, int size){
		this.size = size;
		this.type = typeStr2Enum(type);
		this.color = colorStr2Enum(color);
	}
	
	private Type typeStr2Enum(String type) throws TypeException {
			
		switch(type.toLowerCase()){
		case "greenalgae": return Type.GreenAlgae; 
		case "mosses": return Type.Mosses;
		case "ferns": return Type.Ferns;
		case "horsetails": return Type.Horsetails;
		case "cycads": return Type.Cycads;
		case "conifers": return Type.Conifers;
		case "flowering":return Type.Flowering;
		default: throw new TypeException(type);
		}
	}

	private Color colorStr2Enum(String color) throws ColorException{
		switch(color.toLowerCase()){
		case "red":  return Color.Red;
		case "blue": return Color.Blue;
		case "white": return Color.White;
		case "green": return Color.Green;
		case "yellow": return Color.Yellow;
		case "violet": return Color.Violet;
		default: throw new ColorException(color);
		}
		
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString(){
		return "Type:"+getType()+", Color:"+getColor()+", Size:"+getSize();
	}
	
}

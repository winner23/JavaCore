package lesson5.Homework;


public abstract class Bird {
	private String feathers;
	private boolean layEggs;
	
	protected enum Sex {
		male, female
	}
	
	public Bird(Sex sex, String feathers){
		if(sex==Sex.male) {
			this.itLayEggs(false);
		} else if (sex==Sex.female){
			this.itLayEggs(true);
		}
		this.setFeathers(feathers);
	}
	
	@Override
	public String toString(){
		String className = this.getClass().getName();
		String [] classPath = className.split("\\.");
		if (classPath.length<1) {
			return null;
		} else {
			return "This "+ classPath[classPath.length-1]+(canLayEggs()?" can lay eggs":" can't lay eggs");
		}
		
	}

	protected boolean canLayEggs(){
		return layEggs;
	}
	protected void itLayEggs(boolean layEggs){
		this.layEggs = layEggs;
	}
	
	protected String getFeathers(){
		return this.feathers;
	}
	
	protected void setFeathers(String feathers){
		this.feathers = feathers;
	}
	
	public abstract  boolean fly();
	
}

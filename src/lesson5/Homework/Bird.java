package lesson5.Homework;

import lesson5.Homework.Bird.Sex;

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

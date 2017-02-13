package lesson5.Tasks;

public class Teacher extends Staff {

	final static public TypePerson TYPE_PERSON=TypePerson.Teacher;
	
	private int hours;
	private int rate;
	
	public Teacher(String name, int hours, int rate){
		setName(name);
		setHours(hours);
		setRate(rate);
	}
	
	
	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	@Override
	public int salary() {
		if(getHours()>1 && getRate()>1){
			return getHours()*getRate();
		}else{
			return 0;
		}
	}

	@Override
	public void print() {
		System.out.println("This is a "+TYPE_PERSON+ " , name is "+getName());
	}

}

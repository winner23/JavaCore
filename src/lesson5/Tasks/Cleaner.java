package lesson5.Tasks;

public class Cleaner extends Staff{

	final static public TypePerson TYPE_PERSON=TypePerson.Cleaner;
	
	private int days;
	private int rate;
	
	public Cleaner(String name, int days, int rate){
		setName(name);
		setDays(days);
		setRate(rate);
	}
	
	
	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public int getRate() {
		return rate;
	}


	public void setRate(int rate) {
		this.rate = rate;
	}


	@Override
	public int salary() {
		if(getDays()>1 && getRate()>1){
			return getDays()*getRate();
		}else{
			return 0;
		}
	}

	@Override
	public void print() {
		System.out.println("This is a "+TYPE_PERSON+ " , name is "+getName());
	}

}

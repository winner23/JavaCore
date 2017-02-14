package lesson5.Homework;

public class FlyingBird extends Bird {

	public FlyingBird(Sex sex, String feathers) {
		super(sex, feathers);

	}

	@Override
	public boolean fly() {
		return true;
	}

}

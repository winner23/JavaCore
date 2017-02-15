package lesson5.Homework;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(Sex sex, String feathers) {
		super(sex, feathers);
	}

	@Override
	public boolean fly() {
		System.out.print("and can't fly");
		return false;
	}

}

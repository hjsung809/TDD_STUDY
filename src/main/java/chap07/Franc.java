package chap07;

public class Franc extends Money{

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		amount *= multiplier;
		return null;
	}

}

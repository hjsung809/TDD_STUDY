package chap05;

public class Franc {
	private int amount;

	public Franc(int amount) {
		this.amount = amount;
	}

	public Franc times(int multiplier) {
		amount *= multiplier;
		return null;
	}
	
	public boolean equals(Object object) {
		Franc dollar = (Franc)object;
		return amount == dollar.amount;
	}

}

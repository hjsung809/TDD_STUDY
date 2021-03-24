package chap03;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public Dollar times(int multiplier) {
		amount *= multiplier;
		return null;
	}
	
	public boolean equals(Object object) {
		Dollar dollar = (Dollar)object;
		return amount == dollar.amount;
	}

}

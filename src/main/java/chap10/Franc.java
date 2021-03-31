package chap10;

public class Franc extends Money{
	public Franc(int amount, String currency) {
		super(amount, currency);
	}
	
//	public Money times(int multiplier) {
//		return Money.franc(amount * multiplier);
//	}
	// Money로 올려짐.
}

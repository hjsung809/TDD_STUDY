package chap11;

public class Money {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		// 하위 클래스를 제거하기 위해 상위 클래스를 사용하도록 변경하였다.
//		return new Dollar(amount, "USD"); 
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount) {
		// 하위 클래스를 제거하기 위해 상위 클래스를 사용하도록 변경하였다.
//		return new Franc(amount, "CHF");
		return new Money(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}
	
	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount && currency().equals(money.currency());
	}
	
	
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	public String toString() {
		return amount + " " + currency;
	}
	
}

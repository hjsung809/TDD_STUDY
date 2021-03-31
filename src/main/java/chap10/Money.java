package chap10;

public class Money {
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Dollar(amount, "USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount, "CHF");
	}
	
	public String currency() {
		return currency;
	}
	
	// 클래스를 비교하는게 아닌 currency를 비교하게끔 바꾸었다.
	public boolean equals(Object object) {
		Money money = (Money)object;
		return amount == money.amount && currency().equals(money.currency());
	}
	
	// 공통의 메서드가 되었다.
	public Money times(int multiplier) {
		return new Money(amount * multiplier, currency);
	}
	
	// 디버깅을 위해 추가한 메서드이다.
	public String toString() {
		return amount + " " + currency;
	}
	
}

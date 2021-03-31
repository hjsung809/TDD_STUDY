package chap12;

public class Money implements Expression{
	protected int amount;
	protected String currency;
	
	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}
	
	public static Money franc(int amount) {
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
	
	// 어떻게 할지 명확함으로 속도를 내어 한번에 작성됨.
	// 어떻게 설계해야할지 명확하지 않으면 가짜 구현부터 하고 리팩토링을 하라. (단계의 크기를 줄여라)
	Expression plus(Money addend) {
		return new Money(amount + addend.amount, currency);
	}
}

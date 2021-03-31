package chap12;

public class Bank {
	// Express에 대한 축약을 책임지게 하려고 만듬.
	
	// reduce의 스텁.
	Money reduce(Expression source, String to) {
		return Money.dollar(10);
	}
}

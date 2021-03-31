package chap13;

public class Bank {
//	Money reduce(Expression source, String to) {
//		// 지저분한 코드.
//		// 1. 캐스팅이 모든 Expression에 대해 작동해야 함.
//		// 2. 공용 필드와 그 필드들에 대한 두 단계에 걸친 레퍼런스.
//		Sum sum = (Sum)source;
//		int  amount = sum.augend.amount + sum.addend.amount;
//		return new Money(amount, to);
//	}
	
//	Money reduce(Expression source, String to) {
//		// source가 Sum이 아니라 Money일때 처리. 다형성을 사용하도록 바꿀 것.
//		if(source instanceof Money) return (Money) source;
		// Sum의 reduce 에 대한 책음을 Sum으로 옮김.
//		Sum sum = (Sum)source;
//		return sum.reduce(to);
//	}
	
//	Money reduce(Expression source, String to) {
//		// source가 Sum이 아니라 Money일때 처리. 다형성을 사용하도록 바꿀 것.
//		if(source instanceof Money) return (Money) source.reduce(to);
//		Sum sum = (Sum)source;
//		return sum.reduce(to);
//	}
	
	Money reduce(Expression source, String to) {
		return source.reduce(to);
	}
}

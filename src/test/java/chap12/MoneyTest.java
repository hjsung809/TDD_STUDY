package chap12;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void testMultiplication() {
		Money five = Money.dollar(5);
		assertEquals(Money.dollar(10), five.times(2));
		assertEquals(Money.dollar(15), five.times(3));
	}
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
	
	@Test
	public void testSimpleAddition() {
		// 5$ + 5$ = 10$ 에 대한 테스트.
//		Money sum = Money.dollar(5).plus(Money.dollar(5));
//		assertEquals(Money.dollar(10), sum);
		
		// 컴파일은 되지만 실패함.
		// 은행과 수식 메타포를 통해 일단 작성됨.
		Money five = Money.dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD"); // bank는 여러 통화에 대한 저장소, USD(단일 통화)로 축약
		assertEquals(Money.dollar(10), reduced); 
	}
}

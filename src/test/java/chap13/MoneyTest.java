package chap13;

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
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum)result;
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum, "USD"); // bank는 여러 통화에 대한 저장소, USD(단일 통화)로 축약
		assertEquals(Money.dollar(10), reduced); 
	}
	
	@Test
	public void testPlusReturnsSum() {
		// Money.plus는 Sum을 반환해야 한다.
		Money five = Money.dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
	
	@Test
	public void testReduceSum() {
		// Sum의 Money가 같은 통화이고, reduce로 얻고자하는 통화와 같다면,
		// reduce는 Sum내의 amount들이 합친 값을 반환해야한다.
		Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.dollar(7), result);
	}
	
	@Test
	public void testReduceMoney() {
		Bank bank = new Bank();
		Money result = bank.reduce(Money.dollar(1), "USD");
		assertEquals(Money.dollar(1), result);
	}
}

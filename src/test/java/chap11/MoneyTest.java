package chap11;

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
	
//	@Test
//	public void testFrancMultiplication() {
//		Money five = Money.franc(5);
//		assertEquals(Money.franc(10), five.times(2));
//		assertEquals(Money.franc(15), five.times(3));
//	}
	// testMultiplication 테스트에서 이미 충분한 테스트가 이뤄지고 있다.
	
	@Test
	public void testEquality() {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		// 여기에 있던 두줄의 테스트 코드의 의미가 위의 두줄과 같아 삭제하였다.
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
	
	@Test
	public void testCurrency() {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}
	
//	@Test
//	public void testDifferentClassEquality() {
//		assertTrue(new Money(10, "CHF").equals(new Franc(10, "CHF")));
//	}
	// Franc 클래스를 제거하려는 중이기 때문에 오히려 짐이 된다.
	// 동치성 테스트는 testEquality 테스트에서 충분히 이뤄진다.
}

package account;

import static org.junit.Assert.*;
import org.junit.Test;

public class AccountTest {
	private Account testAccount = new Account();

	@Test
	public void Account_AddBalance() {
		testAccount.addBalance(200);
		int actual = testAccount.getBalance();
		int expected = 200;
		
		assertEquals(expected, actual);
	}

	@Test
	public void Account_ReduceBalance_shouldNotReduceBelow100() {
		testAccount.addBalance(200);
		testAccount.reduceBalance(150);
		int actual = testAccount.getBalance();
		int expected = 200;
		
		assertEquals(expected, actual);
	}

}

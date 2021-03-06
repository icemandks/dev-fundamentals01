package calc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalcTest {

	private StringCalc calc;
	
	@Before
	public void SetUp() {
		this.calc = new StringCalc();
	}

	@Test
	public void StringCalc_sum_testEmpty() {
		String text = "";
		int expected = 0;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test1argument() {
		String text = "1";
		int expected = 1;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test2arguments() {
		String text = "1,2";
		int expected = 3;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test3argument() {
		String text = "1,3,4";
		int expected = 8;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_testlinebrake() {
		String text = "1,3\n4\n3\n4,6,1";
		int expected = 22;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_testnarguments() {
		int n = 50;
		int expected = 0;
		String text = "";

		for (int i = 0; i < n; i++) {
			if (i > 0) text += ",";
			text += i;
			expected += i;
		}

		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test1000() {
		String text = "2,1000";
		int expected = 2;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test100more() {
		String text = "1,3\n1000,4,3000";
		int expected = 8;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test1customdelimiter() {
		String text = "//[;]\n1;2;3";
		int expected = 6;

		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test2customdelimiter() {
		String text = "//[;][-]\n1;2-3";
		int expected = 6;

		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test3customdelimiter() {
		String text = "//[;][#][--]\n1;2--3,4,5#6";
		int expected = 21;

		Assert.assertEquals(expected, this.calc.Add(text));
	}

	// NEGATIVE TESTING
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	// @Test
	// public void whenExceptionThrown_thenRuleIsApplied() {
	// 	exceptionRule.expect(NumberFormatException.class);
	// 	exceptionRule.expectMessage("For input string");
	// 	Integer.parseInt("1a");
	// }
	
	@Test
	public void StringCalc_sum_testnotnumber() {
		exceptionRule.expect(Exception.class);
		// exceptionRule.expectMessage("Exception occurred: For input string:");
		String text = "1,*,4";
		this.calc.Add(text);
	}

	@Test(expected = Exception.class)
	public void StringCalc_sum_testlinebrakeandcomma() {
		String text = "1,3\n,4";
		int expected = 8;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test(expected = Exception.class)
	public void StringCalc_sum_testformatcustomdelimiter() {
		String text = "//[;\n1;2;3";
		int expected = 6;

		Assert.assertEquals(expected, this.calc.Add(text));
	}

}

package calc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringCalcTest {

	@Test
	public void StringCalc_sum_testEmpty() {
		String text = "";
		int expected = 0;
		StringCalc calc = new StringCalc();
		
		Assert.assertEquals(expected, calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test1argument() {
		String text = "1";
		int expected = 1;
		StringCalc calc = new StringCalc();
		
		Assert.assertEquals(expected, calc.Add(text));
	}

	@Test
	public void StringCalc_sum_test2arguments() {
		String text = "1,2";
		int expected = 3;
		StringCalc calc = new StringCalc();
		
		Assert.assertEquals(expected, calc.Add(text));
	}

	@Test(expected = Exception.class)
	public void StringCalc_sum_test3argument() {
		String text = "1,3,4";
		int expected = 0;
		StringCalc calc = new StringCalc();
		
		Assert.assertEquals(expected, calc.Add(text));
	}

}

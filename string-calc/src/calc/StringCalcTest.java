package calc;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class StringCalcTest {

	private StringCalc calc = new StringCalc();

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
		System.out.print(text);
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test(expected = Exception.class)
	public void StringCalc_sum_testnotnumber() {
		String text = "1,*,4";
		int expected = 5;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

	@Test(expected = Exception.class)
	public void StringCalc_sum_testlinebrakeandcomma() {
		String text = "1,3\n,4";
		int expected = 8;
		
		Assert.assertEquals(expected, this.calc.Add(text));
	}

}

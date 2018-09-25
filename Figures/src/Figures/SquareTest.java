package Figures;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SquareTest {
	
	private Square sqr = new Square(5);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void Square_Constructor_Area() {
		Double actual = this.sqr.area();
		Double expected = (double) 25;

		assertEquals(expected, actual);
	}

	@Test
	public void Square_Constructor_getHeight() {
		int actual = this.sqr.getHeight();
		int expected = 5;

		assertEquals(expected, actual);
	}

	@Test
	public void Square_Constructor_getBase() {
		int actual = this.sqr.getBase();
		int expected = 5;

		assertEquals(expected, actual);
	}

	@Test
	public void Square_Constructor_getFigureType() {
		String actual = this.sqr.getFigureType();
		String expected = "Square";

		assertEquals(expected, actual);
	}

	@Test
	public void Square_Constructor_setTag() {
		this.sqr.setTag("sqr-01-test");
		String actual = this.sqr.getTag();
		String expected = "sqr-01-test";

		assertEquals(expected, actual);
	}

}

package Figures;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {

	private Rectangle rec = new Rectangle(8, 7);

	@Test
	void Rectangle_Constructor_Area() {
		Double actual = this.rec.area();
		Double expected = (double) 56;

		assertEquals(expected, actual);
	}

	@Test
	void Rectangle_Constructor_getHeight() {
		int actual = this.rec.getHeight();
		int expected = 7;

		assertEquals(expected, actual);
	}

	@Test
	void Rectangle_Constructor_getBase() {
		int actual = this.rec.getBase();
		int expected = 8;

		assertEquals(expected, actual);
	}

	@Test
	void Rectangle_Constructor_getFigureType() {
		String actual = this.rec.getFigureType();
		String expected = "Rectangle";

		assertEquals(expected, actual);
	}

	@Test
	void Rectangle_Constructor_setTag() {
		this.rec.setTag("Rec-01-test");
		String actual = this.rec.getTag();
		String expected = "Rec-01-test";

		assertEquals(expected, actual);
	}

}

//Account_ReduceBalance_shouldNotReduceBelow100
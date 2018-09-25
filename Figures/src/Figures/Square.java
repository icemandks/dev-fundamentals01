package Figures;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
		this.type = "Square";
	}

	public Square(String label) {
		super(label);
		this.type = "Square";
		
	}

	public static void main(String[] args) {
		Square c = new Square(8);

		c.setTag("S-01");
		c.drawTxt();
		c.printDescription();
		
		IFigure[] figures = new IFigure[3];
		
		figures[0] = c;
		figures[0].setTag("test");
		figures[0].printDescription();
	}

}

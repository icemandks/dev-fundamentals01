package Figures;

public class Rectangle extends GeometricFigure{
	
	protected int base = 0;
	protected int height = 0;

	public Rectangle(int base, int height) {
		this.base = base;
		this.height = height;
		this.type = "Rectangle";
	}
	
	public Rectangle(String label) {
		super(label);
		this.type = "Rectangle";
	}

	public int getBase() {
		return this.base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getFigureType() {
		return this.type;
	}

	public Double area() {
		return (double) (this.height * this.base);
	}

	public void drawTxt() {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(8, 4);
		rec.setTag("Rec-1");
		rec.printDescription();
	}

}

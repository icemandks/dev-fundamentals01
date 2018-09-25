package Figures;

public abstract class GeometricFigure implements IFigure {
	
	protected String FigureName = new String();
	protected String type = new String();
	protected String tag = new String();
	protected Double area = (double) 0;
	protected String label = new String();

	public GeometricFigure() {
		
	}

	public GeometricFigure(String label) {
		this.label = label;
	}

	public final String getLabel() {
		return this.label;
	}

	public final void setLabel(String label) {
		this.label = label;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getFigureType() {
		return this.type;
	}

	public final void printDescription() {
		System.out.println("Tag: " + this.tag);
		System.out.println("Figure Type: " + this.type);
		System.out.println("Area: " + this.area());
	}

}

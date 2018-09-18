/** Castle */
public class Castle extends Figure {
  public Castle(int color) {
    super(color);
  }

  public String whoAmI() {
    String output = super.whoAmI();
//    System.out.println("Castle");
    return output + " Castle";
  }

  /**
   * Castle movement We are supposing an empty board
   */
  public boolean move(Position origin, Position destination) {
    return
    // Valid movement
    ((origin.getRow() == destination.getRow()) || (origin.getColumn() == destination
        .getColumn())) &&
    // origin = destination
        ((origin.getRow() != destination.getRow()) || (origin.getColumn() != destination
            .getColumn())) &&
        // Inside the bounds
        ((origin.getRow() >= 1 && origin.getRow() <= 8)
            && (origin.getColumn() >= 1 && origin.getColumn() <= 8)
            && (destination.getRow() >= 1 && destination.getRow() <= 8) && (destination
            .getColumn() >= 1 && destination.getColumn() <= 8));
  }
  public final static void main(String args[]) {
	  
	  Figure [] castle = new Figure[15];
	  for (int i=0; i<15; i++){
		  if (i % 2 == 0) {
			  castle[i] = new Castle(i % 3);
		  }
		  else {
			  castle[i] = new Queen(i % 3);
		  }
		  System.out.println("I am a " + castle[i].whoAmI());
	  }
	  
  }
} // Castle

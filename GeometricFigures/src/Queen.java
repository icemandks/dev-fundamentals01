/** Queen */
public class Queen extends Figure {
  public Queen(int color) {
    super(color);
  }

  public String whoAmI() {
    String output = super.whoAmI();
//    System.out.println("Queen");
    return output + " Queen";
  }

  /**
   * Not needed for this exercise.
   */
  public boolean move(Position origin, Position destination) {
    // This is not correct, but we will not need it for this exercise
    return true;
  }
  
  public final static void main(String args[]) {
	  Figure queen1 = new Queen(1);
//	  Figure queen2 = new Queen(0);
	  
	  System.out.println(queen1.getClass());
  }
} // Queen

import ch.aplu.turtle.Turtle;

public class Spiel {
  
  // Anfang Attribute
  private int runde;
  // Ende Attribute
  
  // Anfang Methoden
  public int getRunde() {
    return runde;
  }

  public void setRunde(int rundeNeu) {
    runde = rundeNeu;
  }
  
  public void gewonnenCheck() {
    // TODO hier Quelltext einfügen
    
  }
  
  public void ZugCheck() {
    // TODO hier Quelltext einfügen
    
  }
  
  public int LocationY(){
    int a = (int) TurtleaufdemEis.turtle1.getTurtleX()/70;
    return a;
  }
  
  public int LocationX() {
    int b = (int) (TurtleaufdemEis.turtle1.getTurtleY()/70)/-1;
    return b;
  }
  // Ende Methoden
} // end of Spiel


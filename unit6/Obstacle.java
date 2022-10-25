
import processing.core.*;

public class Obstacle{

  public Obstacle(int xIn, int yIn, int dIn, PApplet p){
    this.p = p;
    this.x = xIn;
    this.y = yIn;
    this.d = dIn;
  }

  public void display(){

    p.fill(0xFFF9FA0F);
    p.noStroke();
    p.ellipse(x,y,d,d);
  }

  private PApplet p;
  int x,y,d;
  int c;
}

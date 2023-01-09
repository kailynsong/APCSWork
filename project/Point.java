
import processing.core.*;

public class Point{
  private PApplet p;
  private int x, y, r, color;

  public Point(PApplet p, int x, int y, int r, int color){
    this.p = p;
    this.x = x;
    this.y = y;
    this.r = r;
    this.color = color;
  }

  public void display(){
    p.fill(color);
    p.ellipse(x, y, r, r);

  }

}


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

  public boolean addPoint(int tempx,int tempy){
    if(tempx > x-r/2 && tempx < x+r+r/2 && tempy > y-r/2 && tempy < y+r+r/2){
      return true;
    }else{
      return false;
    }
  }

  public void display(){
    p.fill(color);
    p.ellipse(x, y, r, r);

  }
}

}

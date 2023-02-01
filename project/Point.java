
import processing.core.*;

public class Point{
  private PApplet p;
  int x, y, r;

  public Point(PApplet p, int x, int y, int r){
    this.p = p;
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public boolean addPoint(int tempx,int tempy){
    if(tempx > x-r/2 && tempx < x+r+r/2 && tempy > y-r/2 && tempy < y+r+r/2){
      return true;
    }else{
      return false;
    }
  }

  public void display(){
    p.fill(254,255,121);
    p.ellipse(x, y, r, r);

  }
}

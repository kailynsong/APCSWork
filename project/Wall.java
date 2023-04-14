import processing.core.*;

public class Wall{

  public Wall(PApplet p, int xIn, int yIn, int wIn, int hIn){
    this.p = p;
    this.x = xIn;
    this.y = yIn;
    this.w = wIn;
    this.h = hIn;
  }

  public boolean isInside(int tempx, int tempy){
    if(tempx > x-w/2 && tempx < x+w+w/2 && tempy > y-h/2 && tempy < y+h+h/2){
      return true;
    }else{
      return false;
    }
  }
      
    public boolean ghostWall(int tempx, int tempy){
    if(tempx > x-10 && tempx < x+30 && tempy > y-10 && tempy < y+30){
      return true;
    }else{
      return false;
    } 
  }
    
    public int WgetX(){return x;}
    
    public int WgetY(){return y;}

  public void display(){
    p.noStroke();
    p.fill(46,142,255);
    p.rect(x,y,w,h);

  }

  private int x,y,w,h;
  private PApplet p;

}

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
    if(tempx > x && tempx < x+w && tempy > y && tempy < y+h){
      return true;
    }else{
      return false;
    }
  }
      
    //change collision detection to if the velocity of the character is going to 
    //hit the wall to make vx = 0 and vy = 0
    public boolean ghostWall(int tempx, int tempy){
    if(tempx > x-ww && tempx < x+ww && tempy > y-ww && tempy < y+ww){
      return true;
    }else{
      return false;
    } 
  }
    
  public void display(){
    p.noStroke();
    p.fill(46,142,255);
    p.rectMode(p.CORNER);
    p.rect(x,y,w,h);

  }

  private int x,y,w,h,ww;
  private PApplet p;

}

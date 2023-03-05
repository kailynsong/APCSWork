import processing.core.*;

public class Ghost{
    
  private int x,y,d,vx;
  private PApplet p;
  PImage gh, gh1, gh2;
   
  public Ghost(PApplet p, int xIn, int yIn, int vxIn, int dIn, PImage gh1In, PImage gh2In){
    this.p = p;
    this.x = xIn;
    this.y = yIn;
    this.d = dIn;
    this.vx = vxIn;
    this.gh1 = gh1In;
    this.gh2 = gh2In;
    this.gh = gh;
      
    if(vx > 0){
        gh = gh1;
    }else if(vx < 0){
        gh = gh2;
     }
  }
    
    public void decreaseGhost(){
        //make the if statement to see if d > .1 and decrease the ghost 
    }
    
    
    public void changeImage(){
        if(vx > 0){
                gh = gh1;
            }else if(vx < 0){
                gh = gh2;
            }
    }

  public boolean ghostHit(int tempx, int tempy){
    if(tempx > x-d/2 && tempx < x+d+d/2 && tempy > y-d/2 && tempy < y+d+d/2){
      return true;
    }else{
      return false;
    }
}
  public void display(){
    p.ellipse(x,y,d,d);
    p.fill(229,204,255);
    p.pushMatrix();
    p.translate(x,y);
    p.image(gh, 0, 0);
    gh.resize(d,d);
    p.popMatrix();
  }

  /*if the character is hit by the ghost, make it that it gets smaller
  until the character disappears */

}

import processing.core.*;

public class Ghost{
    
  public int gx,gy;
  public int ghvx, ghvy;
  private PApplet p;
  PImage gh, gh1, gh2;
   
  public Ghost(PApplet p, int gxIn, int gyIn, int ghvx, int ghvy, PImage gh1In, PImage gh2In){
    this.p = p;
    this.gx = gxIn;
    this.gy = gyIn;
    this.ghvx = ghvx;
    this.ghvy = ghvy;
    this.gh1 = gh1In;
    this.gh2 = gh2In;
    this.gh = gh;
      
    if(ghvx > 0){
        gh = gh1;
    }else if(ghvx < 0){
        gh = gh2;
     }
  }
    
    public int getGhostX(){ return gx;}
    public int getGhostY(){ return gy;}
    public int getghvx(){ return ghvx;}
    
    public void bounce(){
    if (gx > 590 || gx < 0) {
        ghvx = -ghvx;
  }

  if (gy > 590 || gy < 0) {
        ghvy = -ghvy;
  }  
        gx += ghvx;
        gy += ghvy;
    }
    
    public void decreaseGhost(){
        //make the if statement to see if d > .1 and decrease the ghost 
        
    }
    //make ghost turn right if hits a wall
    
    public void changeImage(){
        if(ghvx > 0){
                gh = gh1;
            }else if(ghvx < 0){
                gh = gh2;
            }
    }

  public boolean ghostHit(int tempx, int tempy){
    if(tempx > gx-10 && tempx < gx+30 && tempy > gy-10 && tempy < gy+30){
      return true;
    }else{
      return false;
    }
}
    
    public boolean ghostWall(int tempx, int tempy){
    if(tempx > gx-10 && tempx < gx+30 && tempy > gy-10 && tempy < gy+30){
      return true;
    }else{
      return false;
    }
  }
    
  public void update(){
      gx+=ghvx;
  }
    
  public void display(){
    p.pushMatrix();
    p.translate(gx,gy);
    p.image(this.gh1,0,0);
    gh1.resize(20,20);
    p.popMatrix();
      
  }

  /*if the character is hit by the ghost, make it that it gets smaller
  until the character disappears */

}

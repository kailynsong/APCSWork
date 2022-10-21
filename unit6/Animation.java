import processing.core.*;

public class Animation extends PApplet
{

  int x = 180;
  int y = 180;

    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {

      if(this.x < 0){
        x = 400;
      }
      if(this.x > 400){
        x = 0;
      }
      if(this.y < 0){
        y = 400;
      }
      if(this.y > 400){
        y = 0;
      }

    }

    public void keyPressed(){
      if(key == CODED){
    if(keyCode == RIGHT){
      x+=10;
    }
    if(keyCode == LEFT){
      x-=10;
    }
    if(keyCode == UP){
      y-=10;
    }
    if(keyCode == DOWN){
      y+=10;
    }
  }
    }

    public void draw()
    {
      background(0);
      fill(235,255,147);
      rect(x,y,20,20);
    }

    public void display(){

    }

    public static void main(String[] args)
    {
        PApplet.main("Animation");
    }
}

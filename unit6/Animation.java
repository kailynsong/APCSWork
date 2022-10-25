import processing.core.*;
import java.util.*;

public class Animation extends PApplet
{

  String gameState;
  ArrayList<Obstacle> obstacle;
  int x, y, r;
  int vx, vy;
  int point, speed;

    public void settings()
    {
        size(400, 400);
    }

    public void setup()
    {
      size(400,400);

 x = width/2;
 y = height/2;
 r = 20;
 speed = 2;

 vx = 0;
 vy = 0;

 point = 0;

 gameState = "START";


 obstacle = new ArrayList<Obstacle>();
 Obstacle a;
 a = new Obstacle((int)random(0,400), (int)random(0, 400), 20, this);
 obstacle.add(a);

    }

    public void keyPressed(){
      if(keyCode == LEFT){
        vy = 0;
        vx =  0-speed;
}
    else if(keyCode ==RIGHT){
        vy = 0;
        vx = speed;
}

    if(keyCode == UP){
        vx = 0;
        vy =  0-speed;
}    else if(keyCode == DOWN){
        vx = 0;
        vy = speed;
}

 if (keyCode == ENTER) {
  if (gameState == "START") {
    gameState = "GAME";
  }else if (gameState == "END") {
    gameState = "START";
  }
}

    }

    public void draw()
    {
      background(0);
      if (gameState == "START") {
        drawStart();
      }else if (gameState == "GAME") {
        drawGame();
        }
      if (gameState == "END") {
        drawEnd();
}
    }

  public void drawStart(){
      text("google snake", 200.0f, 200.0f);
    }

  public void drawGame(){
      x+=vx;
      y+=vy;
      fill(255);
      ellipse(x,y,r,r);

   if(x > width || x < 0 || y > height || y < 0){
   gameState = "END";
 }
  if(dist(x, y, obstacle.get(obstacle.size()-1).x, obstacle.get(obstacle.size()-1).y) < r/2){
    point++;
    speed++;
    obstacle.get(obstacle.size()-1).x = width*10;
    obstacle.get(obstacle.size()-1).y = height * 10;
    Obstacle b;
    b = new Obstacle((int)random(0,400), (int)random(0, 400), 20, this);
    obstacle.add(b);
 }

  for (Obstacle a : obstacle) {
       a.display();
   }
    }

    public void drawEnd(){
      fill(255);
      textAlign(CENTER);
      text("game over!", 200.0f, 200.0f);
      text(point, 220.0f, 220.0f);
    }

    public static void main(String[] args)
    {
        PApplet.main("Animation");
    }
}

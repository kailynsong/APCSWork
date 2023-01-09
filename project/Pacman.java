import processing.core.*;
import java.util.*;

public class Pacman extends PApplet{
  //declaring variables
  String gameState;
  ArrayList<Point> point;
  PImage pacman;
  int x, y, d, gridsize, vx, vy;
  PImage ch, wall;
  PFont title;

  public void settings() {
  size(600, 600);
}

public void setup() {
  //initializing
  vx = 0;
  x = width/2;
  y = height/2;
  d = 20;
  gridsize = 600;
  gameState = "START";

  pacman = loadImage("pacman.png");

  point = new ArrayList<Point>();

  //title initialization
  title = createFont("upheavtt.ttf", 60);

  //adding an ArrayList for points
  /* for (int i = 0; i < gridsize/10; i++ ) {
    Point p;
    p = new Point();
    p.x = i;
    p.y = i;
    point.add(p);

  }
  */
}


public void draw() {
  background(0);

  if (gameState == "START") {
    drawStart();
  } else if (gameState == "GAME") {
    drawGame();
  } if (gameState == "END") {
    drawEnd();
  }
}

public void character(int x, int y, int angle){
  rotate(angle);
  image(pacman, x, y);
  pacman.resize(d,d);
  fill(255,255,0);

  }


public void drawStart() {
  //title
  textAlign(CENTER);
  textFont(title);
  fill(255);
  text("PACMAN", width/2, height/2);

}

public void drawGame() {
  //updating character movement
  x+=vx;
  y+=vy;

  character(x,y);

}

public void drawEnd() {
}

public void keyPressed(){
//gamestates
  if(keyCode == ENTER){
    if(gameState == "START"){
      gameState = "GAME";
    }else if(gameState == "GAME"){
      gameState = "END";
      x = width/2;
      y = height/2;
    }else if(gameState == "END"){
      gameState = "START";
    }
}
//character movement
    if(gameState == "GAME"){
      if(keyCode == RIGHT){
        //angle = ;
        vx = 2;
        vy = 0;
      }if (keyCode == LEFT){
        //angle = ;
        vy = 0;
        vx = -2;
      }if (keyCode == UP){
        //angle = ;
        vx = 0;
        vy = -2;
      }if (keyCode == DOWN){
        //angle = ;
        vx = 0;
        vy = 2;
      }
  }

}

public static void main(String[] args){
      PApplet.main("Pacman");
  }


}

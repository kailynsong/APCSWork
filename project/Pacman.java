import processing.core.*;
import java.util.*;

public class Pacman extends PApplet{
  //declaring variables
  String gameState;
//  ArrayList<Point> point;
  PImage pacman;
  float angle;
  int x, y, d, gridsize, vx, vy, points;
  PImage ch;
  ArrayList<Wall> walls;
  ArrayList<Point> dots;
  Wall top, bottom,right,left,a,b,c,e,f,g,h;
  PFont title;

  public void settings() {
    size(600,600);
  //fullScreen();
}

public void setup() {
  //initializing
  vx = 0;
  x = width/2;
  y = height/2+height/5;
  d = 20;
  gridsize = 600;
  gameState = "START";
  angle = 0;
  background(bgcolor);

  pacman = loadImage("pacman.png");

  dots = new ArrayList<Point>();

 Point p = new Point(this,300,200,10);
 dots.add(p);

 outsideWalls();
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

private int bgcolor = 0;

public void draw() {
  //background(bgcolor);

  if (gameState == "START") {
    drawStart();
  } else if (gameState == "GAME") {
    drawGame();
  } if (gameState == "END") {
    drawEnd();
  }

}

public void outsideWalls1(){
  //horizontal walls
    walls = new ArrayList<Wall>();
    for(int i = 0; i <= 30; i++){
      top = new Wall(this,0+20*i,0,20,20);
      walls.add(top);
  }
    for(int i = 0; i<=30; i++){
      bottom = new Wall(this,0+20*i,580,20,20);
      walls.add(bottom);
    }

  //vertical walls (outer)
    for(int i = 0; i < 10; i++){
      right = new Wall(this,580,0+20*i,20,20);
      walls.add(right);
    }

    for(int i = 0; i < 10; i++){
      left = new Wall(this,0,0+20*i,20,20);
      walls.add(left);
    }

  //outer horizontal walls
    //left
    for(int i = 0; i < 5; i++){
      a = new Wall(this,0+20*i,180,20,20);
      walls.add(a);
    }
    //right
    for(int i = 0; i < 5; i++){
      a = new Wall(this,580-20*i,180,20,20);
      walls.add(a);
    }
    //middleLEFT
    for(int i = 0; i < 5; i++){
    b = new Wall(this,80-20*i,240,20,20);
    walls.add(b);
  }
    //middle RIGHT
    for(int i = 0; i < 5; i++){
    b = new Wall(this,500+20*i,240,20,20);
    walls.add(b);
  }

    //bottom left
    for(int i = 0; i < 5; i++){
    c = new Wall(this,0+20*i,300,20,20);
    walls.add(c);
  }
    //bottom right
    for(int i = 0; i < 5; i++){
      c = new Wall(this,500+20*i,300,20,20);
      walls.add(c);
  }

    //bottomest left
    for(int i = 0; i < 5; i++){
      g = new Wall(this,80-20*i,360,20,20);
      walls.add(g);
    }
    //bottomest right
    for(int i = 0; i < 5; i++){
      g = new Wall(this,500+20*i,360,20,20);
      walls.add(g);
    }

  //outer vertical walls
    //top left
    for(int i = 0; i < 4; i++){
    e = new Wall(this,80,180+20*i,20,20);
    walls.add(e);
  }
    //top right
    for(int i = 0; i < 4; i++){
    e = new Wall(this,500,180+20*i,20,20);
    walls.add(e);
  }

    //middle left
    for(int i = 0; i < 4; i++){
    f = new Wall(this,80,300+20*i,20,20);
    walls.add(f);
  }

    //middle right
    for(int i = 0; i < 4; i++){
    f = new Wall(this,500,300+20*i,20,20);
    walls.add(f);
  }

    //bottom left
    for(int i = 0; i < 11; i++){
      right = new Wall(this,0,360+20*i,20,20);
      walls.add(right);
    }
    //bottom right
    for(int i = 0; i < 11; i++){
      right = new Wall(this,580,360+20*i,20,20);
      walls.add(right);
    }

    //ghost walls:
      //horizontal
    for(int i = 0; i < 8; i++){
      g = new Wall(this,220 + 20*i,320,20,20);
      walls.add(g);
    }

    for(int i = 0; i < 3; i++){
      g = new Wall(this,220 + 20*i, 270,20,20);
      walls.add(g);
    }

    for(int i = 0; i < 3; i++){
      g = new Wall(this,360 + 20*i, 270,20,20);
      walls.add(g);
    }

    //vertical ghost holder walls:
    for(int i = 0; i < 3; i++){
      g = new Wall(this,220,270+ 20*i,20,20);
      walls.add(g);
    }

    for(int i = 0; i < 4; i++){
      g = new Wall(this,400,260 + 20*i,20,20);
      walls.add(g);
    }
}


public void character(int x, int y, float angle){
  pushMatrix();
  translate(x,y);
  rotate(angle);
  imageMode(CENTER);
  image(pacman, 0, 0);
  pacman.resize(d,d);
  fill(255,255,0);
  popMatrix();
  }


public void drawStart() {
  //title
  textAlign(CENTER);
  textFont(title);
  fill(255);
  text("PACMAN", width/2, height/2);

  //maybe add ghosts circling around the title screen

}

public void drawGame() {

  background(bgcolor);
  //updating character movement
  x+=vx;
  y+=vy;

  //temporary x and y positions for collision detection
  //making sound effects for eating points or dying by ghost?
  int tempx = x+vx;
  int tempy = y+vy;

  character(x,y,angle);

  for(Wall w : walls){
    w.display();
    if(w.isInside(tempx,tempy) == true){
      vx = 0;
      vy = 0;
  }
}

  for(Point a : dots){
    a.display();
    if(a.addPoint(tempx,tempy) == true){
      a.x = 2000;
      a.y = 2000;
    }
  }
/*
point = 100;
for(Point p : points){
  p.display();
  if(p.addPoint(tempx,tempy) == true){
    point--;
    p.x = 800;
    p.y = 1000;
  }
}
*/

//end of the screen starting on the other side
  if(x > width + d/2){
    x = 0 - d/2;
  }else if(x < 0 - d/2){
    x = width + d/2;
  }

  if(y > height + d/2){
    y = 0-d/2;
  }else if(y < 0-d/2){
    y = height + d/2;
  }

  //collision detection with walls


}

public void drawEnd() {

  //game over ending
  textAlign(CENTER);
  textFont(title);
  fill(255);
  text("GAME OVER", width/2, height/2);

}

public void drawEnd2(){

  //congrats!
  textAlign(CENTER);
  textFont(title);
  fill(255);
  text("CONGRATS, YOU FINISHED THE GAME!", width/2, height/2);

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
    }else if(gameState == "END2"){
      gameState = "START";
        }
}

//character movement
    if(gameState == "GAME"){
      if(keyCode == RIGHT){
        angle = PI;
        vx = 3;
        vy = 0;
      }if (keyCode == LEFT){
        angle = 0;
        vy = 0;
        vx = -3;
      }if (keyCode == UP){
        angle = PI/2;
        vx = 0;
        vy = -3;
      }if (keyCode == DOWN){
        angle = 3*PI/2;
        vx = 0;
        vy = 3;
      }
  }

}

public static void main(String[] args){
      PApplet.main("Pacman");
  }


}

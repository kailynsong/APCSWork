import processing.core.*;
import java.util.*;

public class Pacman extends PApplet{
  //declaring variables
  String gameState;
//  ArrayList<Point> point;
  PImage pacman;
  float angle;
  int x, y, d, gridsize, vx, vy, points;
  PImage ch, pinkright, pinkleft, blueright, blueleft;
  ArrayList<Wall> walls;
  ArrayList<Point> dots;
  ArrayList<Ghost> ghosts;
  Wall top, bottom,right,left,a,b,c,e,f,g,h;
  PFont title;
    
  //level 1 grid
  int[][] grid = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},//1st row
                 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                 {1,0,1,1,1,1,1,0,1,1,0,1,0,1,1,1,1,1,0,1},
                 {1,0,0,0,0,0,1,0,1,0,0,1,0,1,0,0,0,0,0,1},
                 {1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1},
                 {0,0,0,0,1,0,1,1,1,0,1,1,0,1,0,1,0,0,0,0},
                 {1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,1,1,1,1,1},
                 {1,0,0,0,0,0,1,1,0,1,1,1,0,1,0,0,0,0,0,1},
                 {1,0,1,1,1,1,1,0,0,0,0,1,0,1,1,1,1,1,0,1},
                 {0,0,0,0,0,0,0,0,1,1,0,1,0,0,0,0,0,0,0,0}, //half way
                 {1,0,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,0,1},
                 {1,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,0,0,1},
                 {1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,1,1,1},
                 {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0},
                 {1,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1},
                 {1,0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,0,0,1},
                 {1,0,1,1,1,1,1,1,1,0,1,0,1,1,0,1,1,1,0,1},
                 {1,0,1,1,1,1,1,1,1,0,1,0,1,1,0,1,1,1,0,1},
                 {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                 {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}}; //last row

  
public void settings(){
    
    size(600,600);
}

public void setup() {
  //initializing
  vx = 0;
  x = width/2;
  y = height/3;
  d = 20;
  gridsize = 400;
  gameState = "START";
  angle = 0;
  background(bgcolor);

  pacman = loadImage("pacman.png");
  pinkright = loadImage("pinkright.png");
  pinkleft = loadImage("pinkleft.png");
  blueright = loadImage("blueright.png");
  blueleft = loadImage("blueleft.png");

  dots = new ArrayList<Point>();
  ghosts = new ArrayList<Ghost>();
createGhost(pinkright, pinkleft);

 Point p = new Point(this,300,200,10);
 dots.add(p);
    
createWalls();

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
    
public void createWalls(){
    walls = new ArrayList<Wall>();
    
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 1){
                    int wallWidth = width/20;
                    Wall w = new Wall(this, j*wallWidth, i*wallWidth, wallWidth, wallWidth);
                    walls.add(w);
                }
            }
        }
        
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
    
/*
public void outsideWalls1(){
  //horizontal walls
    walls = new ArrayList<Wall>();
    for(int i = 0; i <= width/20; i++){
      top = new Wall(this,0+20*i,0,20,20);
      walls.add(top);
  }
    for(int i = 0; i<=width/20; i++){
      bottom = new Wall(this,0+20*i,height-20,20,20);
      walls.add(bottom);
    }

  //vertical walls (outer)
    for(int i = 0; i < width/90; i++){
      right = new Wall(this,width-20,0+20*i,20,20);
      walls.add(right);
    }

    for(int i = 0; i < width/90; i++){
      left = new Wall(this,0,0+20*i,20,20);
      walls.add(left);
    }

  //outer horizontal walls
    //up left
    for(int i = 0; i < width/120; i++){
      a = new Wall(this,0+20*i,height/3,20,20);
      walls.add(a);
    }
    //up right
    for(int i = 0; i < width/120; i++){
      a = new Wall(this,(width-20)-20*i,height/3,20,20);
      walls.add(a);
    }
    //middleLEFT
    for(int i = 0; i < width/120; i++){
    b = new Wall(this,20*width/120-20*i,(height/3)+20*width/320,20,20);
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
    for(int i = 0; i < width/280; i++){
    e = new Wall(this,20*width/120,(height/3)+20*i,20,20);
    walls.add(e);
  }
    
    //USE THIS FOR STUCK QUESTION
    //top right
    for(int i = 0; i < width/280; i++){
    e = new Wall(this,500,height/2+20*i,20,20);
    walls.add(e);
  }

    //middle left
    for(int i = 0; i < 4; i++){
    f = new Wall(this,(width-20)-20*width/120,height/3+20*i,20,20);
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
*/

//maybe make a function that creates the for loops for my walls
    

public void createGhost(PImage gh1, PImage gh2){
    Ghost pinkgh = new Ghost(this,300,100, 2, 0, pinkleft, pinkright);
    ghosts.add(pinkgh);
    Ghost bluegh = new Ghost(this, 300, 140, -2, 0, blueleft, blueright);
    ghosts.add(bluegh);
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
  //outsideWalls1();

  background(bgcolor);
  //updating character movement
  x+=vx;
  y+=vy;

  //temporary x and y positions for collision detection
  //making sound effects for eating points or dying by ghost?
  int tempx = x+vx;
  int tempy = y+vy;

  character(x,y,angle);

  for(Ghost g : ghosts){
    for(Wall w : walls){
    w.display();
    if(w.isInside(tempx,tempy) == true){
      vx = 0;
      vy = 0;
  }
      if(w.ghostWall(g.gx,g.gy) == true){
          g.ghvx=0;
          pushMatrix();
          translate(g.gx,g.gy);
          rotate(PI/2);
          popMatrix();
          g.ghvy=-2;
      }
}
  }

  for(Point a : dots){
    a.display();
    if(a.addPoint(tempx,tempy) == true){
      a.x = 2000;
      a.y = 2000;
    }

  for(Ghost g : ghosts){
      g.display();
      g.update();
      g.ghostWall(tempx,tempy);
      if(g.ghostHit(tempx,tempy) == true){
        //put public function decrease ghost here
      }
      
  }
  

//add extra gamestate in between game and end to make animation
//keep playing and changes to gamestate end after its done

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

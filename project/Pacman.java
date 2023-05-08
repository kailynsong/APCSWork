import processing.core.*;
import java.util.*;

public class Pacman extends PApplet{
  //declaring variables
  String gameState;
//  ArrayList<Point> point;
  PImage pacman;
  float angle;
  int x, y, d, gridsize, vx, vy, points;
  PImage ch, pinkright, pinkleft, blueright, blueleft, redright,redleft;
  ArrayList<Wall> walls;
  ArrayList<Point> dots,beginp;
  ArrayList<Ghost> ghosts;
  Wall top, bottom,right,left,a,b,c,e,f,g,h;
  PFont title, big,small;
    boolean done;
    String direction;
    int tempx;
  int tempy;
    
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
    
 int[][] p = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},//first
                   {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                   {0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,0,1,0},
                   {0,1,1,1,1,1,0,1,0,1,1,0,1,0,1,1,1,1,1,0},
                   {0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0},
                   {0,0,0,0,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,0},
                   {0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0},
                   {0,1,1,1,1,1,0,0,1,0,0,0,1,0,1,1,1,1,1,0},
                   {0,1,0,0,0,0,0,1,1,1,1,0,1,0,0,0,0,0,1,0},
                   {1,1,1,1,1,1,1,1,0,0,1,0,1,1,1,1,1,1,1,1}, //half way
                   {0,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,0},
                   {0,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,0},
                   {0,0,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,0,0,0},
                   {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0},
                   {0,0,0,0,0,1,0,0,0,0,0,1,0,0,1,0,0,0,0,0},
                   {0,1,1,1,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1,0},
                   {0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0},
                   {0,1,0,0,0,0,0,0,0,1,0,1,0,0,1,0,0,0,1,0},
                   {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                   {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
                   
int[][] grid2 = {};
    
int[][] p2 = {};
    
    
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
  direction = "";
  tempx = x+3*vx;
  tempy = y+3*vy;

  pacman = loadImage("pacman.png");
  pinkright = loadImage("pinkright.png");
  pinkleft = loadImage("pinkleft.png");
  blueright = loadImage("blueright.png");
  blueleft = loadImage("blueleft.png");
  redright = loadImage("redright.png");
  redleft = loadImage("redleft.png");

  dots = new ArrayList<Point>();
  ghosts = new ArrayList<Ghost>();
  beginp = new ArrayList<Point>();
    
createWalls();
createPoints();
    
createGhost(blueright, blueleft);
createGhost(pinkright, pinkleft);
createGhost(redright, redleft);

 /*Point p = new Point(this,300,200,10);
 dots.add(p);
 */

  //title initialization
  title = createFont("upheavtt.ttf", 60);
    small = createFont("upheavtt.ttf",30);
    
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
    
/*public void createWalls2(){
     walls = new ArrayList<Wall>();
    
        for(int i = 0; i < grid2.length; i++){
            for(int j = 0; j < grid2[i].length; j++){
                if(grid2[i][j] == 1){
                    int wallWidth = width/20;
                    Wall w = new Wall(this, j*wallWidth, i*wallWidth, wallWidth, wallWidth);
                    walls.add(w);
                }
            }
        }
}*/
    
    //MAKE A CLEAR ENDING, when you press enter, clear the screen + when you finish points
public void createPoints(){
    dots = new ArrayList<Point>();
    
    for(int i = 0; i < p.length; i++){
        for(int j = 0; j < p[i].length; j++){
            if(p[i][j]==1){
                int r = 12;
                Point po = new Point(this, j*width/20 + 600/40,i*width/20 + 600/40, r);
                dots.add(po);
            }
        }
    }

}
    

    
   /* 
public void createPoints2(){
    dots = new ArrayList<Point>();
    
    for(int i = 0; i < p2.length; i++){
        for(int j = 0; j < p2[i].length; j++){
            if(p2[i][j]==1){
                int r = 10;
                Point po = new Point(this, j*width/20 + 600/40,i*width/20 + 600/40, r);
                dots.add(po);
            }
        }
    } 
}*/

private int bgcolor = 0;

public void draw() {
  //background(bgcolor);

  if (gameState == "START") {
    drawStart();
  } else if(gameState == "RULES"){
      drawRules();
  }
    else if (gameState == "GAME") {
    drawGame();
  } else if (gameState == "END") {
    drawEnd();
  }

}
    

public void createGhost(PImage gh1, PImage gh2){
    Ghost pinkgh = new Ghost(this,300,310, -1, 0, pinkleft, pinkright);
    ghosts.add(pinkgh);
    Ghost bluegh = new Ghost(this, 300, 140, 1, 0, blueleft, blueright);
    ghosts.add(bluegh);
    Ghost redgh = new Ghost(this, 300, 400, -1, 0, redleft, redright);
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
  textFont(small);
  for(int i =0; i < 40; i++){
  Point p = new Point(this, i*25+width/23,height/2+20, 15);
  Point p1 = new Point(this, i*25+width/23, height/2-50,15);
  beginp.add(p);
  beginp.add(p1);
             
  //lower pacman
  int velocity = 3;
  int xx=0;
  pushMatrix();
  translate(xx,height/2+20);
  rotate(PI);
  image(pacman, 0, 0);
  pacman.resize(d,d);
  fill(255,255,0);
  popMatrix();
  xx+=velocity;

  //upper pacman
  int xxx = 600;
  int nvelocity = -3;
  pushMatrix();
  translate(xxx, height/2-50);
  image(pacman, 0, 0);
  pacman.resize(d,d);
  fill(255,255,0);
  popMatrix();
  xxx+=nvelocity;
  //pacman eating points below the words
  }
    for(Point a : beginp){
    a.display();
    if(a.addPoint(tempx,tempy) == true){
      a.x = 2000;
      a.y = 2000;
    }
    if(!(a.x < 600) && a.x > 1900)
        gameState = "END";
}
}
    public void drawRules(){
        fill(255);
        textAlign(CENTER);
        textFont(title);
        text("HOW TO PLAY:", width/2, height/4-4);
        text("HOW TO PLAY:", width/2, height/4);
        textFont(small);
        text("USE THE ARROW KEYS TO MOVE PACMAN", width/2, height/2-35);
        text("IF YOU HIT THE GHOST, YOU DIE", width/2, height/2+10);
        text("PRESS ENTER TO BEGIN!", width/2, height/2+55);
        text("IT'S JUST LIKE NORMAL PACMAN!!", width/2, height/2+100);
    }

public void drawGame() {

  background(bgcolor);

  //temporary x and y positions for collision detection
  int tempx = x+5*vx;
  int tempy = y+5*vy;

  character(x,y,angle);

for(Wall w : walls){
    w.display();
    if(w.isInside(tempx,tempy) == true){
      vx = 0;
      vy = 0;
  }
}
//updating character movement
  x+=vx;
  y+=vy;

  for(Point a : dots){
    a.display();
    if(a.addPoint(tempx,tempy) == true){
      a.x = 2000;
      a.y = 2000;
    }
  }

  for(Ghost g : ghosts){
      g.display();
      g.update();
      if(g.ghostWall(tempx,tempy)){
          g.ghvx=0;
          g.ghvy=-g.ghvy;
      }
      if(g.ghostHit(tempx,tempy) == true){
        //put public function decrease ghost here
          gameState = "END";
      }
      g.bounce();
  }
  
//character going to the end of the screen, starts on the other side
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
}

public void drawEnd() {

  //game over ending
  textAlign(CENTER);
  textFont(title);
  fill(0);
  text("YOU'RE DONE!", width/2, height/2+4);
  fill(247, 255, 3);
  text("YOU'RE DONE!", width/2, height/2);
  textFont(small);
  fill(0);
  text("PRESS ENTER TO START AGAIN!", width/2, height/2+37);
  fill(247,255,3);
  text("PRESS ENTER TO START AGAIN!", width/2, height/2+35);
}

public void keyPressed(){
//gamestates
  if(keyCode == ENTER){
    if(gameState == "START"){
        background(0);
      gameState = "RULES";
    }else if(gameState == "RULES"){
        gameState = "GAME";
    }
      else if(gameState == "GAME"){
        gameState = "END";
          x = width/2;
        y = height/2;
          vx = 0;
    }if(gameState == "END"){ 
        background(0);
        gameState = "START";
    }
  }
//character movement
   if(gameState == "GAME"){
      if(keyCode == RIGHT){
        direction = "RIGHT";
      }if (keyCode == LEFT){
        direction = "LEFT";
      }if (keyCode == UP){
        direction = "UP";
      }if (keyCode == DOWN){
        direction = "DOWN";
      }
  }

    if(direction == "UP"){
        angle = PI/2;
        vx = 0;
        vy = -3;
    } else if(direction == "DOWN"){
        angle = 3*PI/2;
        vx = 0;
        vy = 3;
    } else if(direction == "LEFT"){
        angle = 0;
        vy = 0;
        vx = -3;
    } else if(direction == "RIGHT"){
        angle = PI;
        vx = 3;
        vy = 0;
    }

}

public static void main(String[] args){
      PApplet.main("Pacman");
  }


}

public class Vector{

  private double x;
  private double y;

  public Vector(double xIn, double yIn){
    x = xIn;
    y = yIn;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double magnitude(){
    return Math.sqrt(x*x + y*y);
  }

  public double direction(){
    int quadrant = 0;
    if(x > 0 && y > 0){
      quadrant = 1;
    }
    else if(x < 0 && y > 0){
      quadrant = 2;
    }
    else if(x < 0 && y < 0){
      quadrant = 3;
    }
    else if(x > 0 && y < 0){
      quadrant = 4;
    }
    double angle = Math.atan2(y,x);
      angle = angle*180/Math.PI;
      if(quadrant == 1){
        return angle;
      }else if(quadrant == 2){
        return angle + 180;
      }else if(quadrant == 3){
        return angle + 180;
      }else if(quadrant == 4){
        return angle + 360;
      }else if(x == 0 && y > 0){
        return 90;
      }else if(x == 0 && y < 0){
        return 270;
      }else if(y == 0 && x > 0){
        return 0;
      }else{
        return 180;
      }

  }

  public void add(Vector v){
    x+=v.getX();
    y+=v.getY();
  }

  public void scalarMultiply(double k){
    x = x*k;
    y = y*k;
  }

  public double dotProduct(Vector v){
    return x*v.getX()+y*v.getY();
  }

  public double angle(Vector v){
    return Math.abs(this.direction()-v.direction());
  }

}

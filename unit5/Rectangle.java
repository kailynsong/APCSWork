
public class Rectangle{

  private double base;
  private double height;

  public Rectangle(double baseIn, double heightIn){
    base = baseIn;
    height = heightIn;
  }

  public double getBase(){
    return base;
  }

  public double getHeight(){
    return height; 
  }

  public double area(){
    return base*height;
  }

  public double perimeter(){
    return ((2*base)+(2*height));
  }

  public double diagonal(){
    return Math.sqrt(base*base + height*height);
  }

}

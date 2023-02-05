
public class Rectangle{
  public Rectangle(String nameIn, double widthIn, double heightIn){
    name = nameIn;
    width = widthIn;
    height = heightIn;
  }

  public String name(){return name;}
  public double width(){return width;}
  public double height(){return height;}

  public double perimeter(){
    return 2*width+2*height;
  }

  public double area(){
    return width*height;
  }


  private String name;
  private double width;
  private double height;

}

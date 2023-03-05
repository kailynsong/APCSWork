import java.util.*;

public class ShapeCollection{

  public ShapeCollection(){
    shapes = new ArrayList<Shape>();
  }

  public void add(String name, int numside){
    Shape sh = new Shape(name, numside);
    shapes.add(sh);
  }

  public int numberOfSides(String shapeName){
    int num = 0;
    for(Shape s : shapes)
      if(shapeName.equals(s.getName())){
        num = s.getNumSide();
      }
    return num;
  }

  public double average(){
    double number = 0;
    for(Shape s : shapes){
      number += s.getNumSide();
    }
    return number/shapes.size();
  }

  public ArrayList<Shape> evenSides(){
    ArrayList<Shape> evens = new ArrayList<Shape>();

    for(Shape s : shapes){
      if(s.getNumSide()%2==0){
        evens.add(s);
      }
    }
    return evens;
  }

  public static void main(String[] args)
    {
        ShapeCollection c = new ShapeCollection();

        c.add("triangle", 3);
        c.add("square", 4);
        c.add("pentagon", 5);
        c.add("hexagon", 6);

        System.out.println("avg # of sides: " + c.average());
        System.out.println("evens : " + c.evenSides());
    }

  private ArrayList<Shape> shapes;

}

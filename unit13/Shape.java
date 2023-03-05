
public class Shape{

  public Shape(String name, int numside){
    this.name = name;
    this.numside = numside;
  }

  public String getName(){return name;}
  public int getNumSide(){return numside;}
  public String toString(){return name;}

  private String name;
  private int numside;

}

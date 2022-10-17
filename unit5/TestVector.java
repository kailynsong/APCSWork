
public class TestVector{

  public static void main(String[] args){
    Vector a = new Vector(1,-1);
    System.out.println(a.magnitude());
    System.out.println(a.direction());
    System.out.println();
    Vector v = new Vector(3,4);
    a.add(v);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println();
    double k = 2.5;
    a.scalarMultiply(k);
    System.out.println(a.getX());
    System.out.println(a.getY());
    System.out.println();
    System.out.println(a.dotProduct(v));
    System.out.println();
    System.out.println(a.angle(v));
  
  }

}

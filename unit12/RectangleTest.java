
public class RectangleTest{

  public static double averageP(Rectangle[][] r){
    double average = 0.0;
    for(int i = 0; i < r.length; i++){
      for(int j = 0; j < r[i].length; j++){
        average+=r[i][j].perimeter();
      }
    }
    return average/(r.length*r[0].length);
  }

  public static double biggestArea(Rectangle[][] r){
    double area = 0.0;
    for(int i = 0; i < r.length; i++){
      for(int j = 0; j <r[i].length; j++){
        if(r[i][j].area() > area){
          area = r[i][j].area();
        }
      }
    }
    return area;
  }

  public static void main(String[] args){
    Rectangle[][] r = new Rectangle[2][2];
    r[0][0] = new Rectangle("a", 2.3,4.1);
    r[0][1] = new Rectangle("b",6.8,3.8);
    r[1][0] = new Rectangle("c", 5.2, 1.3);
    r[1][1] = new Rectangle("d", 2.9,4.6);

    System.out.println("averageP: " + averageP(r));
    System.out.println();
    System.out.println("the biggest area is: " + biggestArea(r));
  }

}

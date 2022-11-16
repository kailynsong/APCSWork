import java.util.Arrays;

public class Count{

  public static void testCountLucky(int[] a, int expected){
    System.out.println("expected: " + expected);
    if(countLucky(a) == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static int countLucky(int[] a){
    int total = 0;

    for(int i = 0; i < a.length; i++){
      if(a[i]%7 == 0 || a[i]%10 == 7){
        total+=1;
      }
  }
  return total;
  }

  public static void main(String[] args){
    int[] a = {1,4,7,17};
    int[] b = {7,13,17};
    System.out.println("Lucky #s array a: " + countLucky(a));
    System.out.println("Lucky #s array b: " + countLucky(b));

    testCountLucky(a, 2);
    testCountLucky(b, 2);
  }

}


public class unit4P3{

  public static void testSum(int n, int expected){

    System.out.println("#: " + n + ", " + "expected: " + expected);

    if(sumOfSquares(n) == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static int sumOfSquares(int n){
    int sum = 0;
    for(int i = 0; i <= n; i ++){
      sum = sum + (i*i);
    }
    return sum;
  }

  public static void main(String[] args){
    testSum(3, 14);
    testSum(2, 5);
    testSum(4, 30);
  }

}

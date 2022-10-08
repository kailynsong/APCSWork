
public class unit4P4{

  public static void testFactorial(int n, int expected){

    System.out.println("#: " + n + ", " + "expected: " + expected);

    if(factorial(n)==expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static int factorial(int n){
    int product = 1;
    for(int i = 1; i <= n; i++){
      product = product*i;
    }
    return product;
  }

  public static void main(String[] args){
    testFactorial(3, 6);
    testFactorial(5, 120);
    testFactorial(2, 2);
    testFactorial(0, 1);
  }

}

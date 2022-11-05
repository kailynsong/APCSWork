
public class Sum{

  public static double sumOfSquares(double[] a){
    int total = 0;
    for(int i = 0; i < a.length; i++){
      total += a[i]*a[i];
    }
    return total;
  }

  public static void main(String[] args){
    double[] a = {1.0,2.0,3.0};
    System.out.println("Sum of squares: " + sumOfSquares(a));
  }

}

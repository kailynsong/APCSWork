
import java.util.*;

public class Sum{

  public static double sumOfSquares(ArrayList<Double> nums){
    double total = 0;
    for(double numbers: nums){
      total+=numbers*numbers;
    }
    return total;
  }

  public static void main(String[] args){
    ArrayList<Double> nums = new ArrayList<Double>();
    nums.add(1.0);
    nums.add(2.0);
    nums.add(3.0);

    System.out.println("Sum of squares is: " + sumOfSquares(nums));
  }

}

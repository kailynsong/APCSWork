
import java.util.*;

public class Sum{

  public static void testSumOfSquares(ArrayList<Double> nums, double expected){
    System.out.println("ArrayList: " + nums + " expected #: " + expected);

    if(sumOfSquares(nums) == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

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

    ArrayList<Double> nums1 = new ArrayList<Double>();
    nums1.add(2.0);
    nums1.add(2.0);
    nums1.add(3.0);

    ArrayList<Double> nums2 = new ArrayList<Double>();
    nums2.add(0);

    System.out.println("Sum of squares is: " + sumOfSquares(nums));

    testSumOfSquares(nums, 14.0);
    testSumOfSquares(nums1, 12.0);
    testSumOfSquares(nums2, 0.0);
  }

}

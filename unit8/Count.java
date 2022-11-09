
import java.util.*;

public class Count{

  public static void testCountLucky(ArrayList<Integer> nums, int expected){
    System.out.println("ArrayList: " + nums + " expected: " + expected);
    if(countLucky(nums) == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static int countLucky(ArrayList<Integer> nums){
    int total = 0;

    for(int i = 0; i < nums.size(); i++){
      if(nums.get(i)%7 == 0 || nums.get(i)%10 == 7){
        total+=1;
      }
    }
    return total;
  }

    public static void main(String[] args){

      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(7);
      nums.add(13);
      nums.add(17);

      ArrayList<Integer> nums1 = new ArrayList<Integer>();
      nums1.add(27);
      nums1.add(7);
      nums1.add(17);

      ArrayList<Integer> nums2 = new ArrayList<Integer>();
      nums2.add(1);
      nums2.add(18);
      nums2.add(7);

      System.out.println("lucky nums: " + countLucky(nums));

      testCountLucky(nums, 2);
      testCountLucky(nums1, 3);
      testCountLucky(nums2, 1);
    }

}

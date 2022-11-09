
import java.util.*;

public class Count{

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

      System.out.println("lucky nums: " + countLucky(nums));
    }

}

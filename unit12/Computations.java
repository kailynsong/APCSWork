
public class Computations{

//PART A
  public static int smallestInt(int[][] numbers){
    int smallest = numbers[0][0];
    for(int i = 0; i < numbers.length; i++){
      for(int j = 0; j < numbers[i].length; j++){
        if(numbers[i][j] < smallest){
          smallest = numbers[i][j];
        }
      }
    }
    return smallest;
  }

//PART B
  public static double sum(double[][] nums){
    double sum = 0;
    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        sum += nums[i][j];
      }
    }
    return sum;
  }

  //PART C
    public static int letterA(String[][] words){
      int count = 0;
      for(int i = 0; i < words.length; i++){
        for(int j=0; j < words[i].length; j++){
          if(words[i][j].substring(0,1).equals("A") ||
            words[i][j].substring(0,1).equals("a")){
              count++;
            }
        }
      }
      return count;
    }

  public static void main(String[] args){
    int[][] numbers = new int[2][2];
    numbers[0][0] = 2;
    numbers[0][1] = 5;
    numbers[1][0] = 1;
    numbers[1][1] = 4;

    double[][] nums = new double[2][2];
    nums[0][0] = 1.7;
    nums[0][1] = 7.2;
    nums[1][0] = 2.3;
    nums[1][1] = 4.8;

    String[][] words = new String[2][2];
    words[0][0] = "apple";
    words[0][1] = "banana";
    words[1][0] = "Amy";
    words[1][1] = "Kailyn";

    System.out.println("the smallest int is: " + smallestInt(numbers));
    System.out.println();
    System.out.println("the sum is: " + sum(nums));
    System.out.println();
    System.out.println("letters with a: " + letterA(words));
  }

}

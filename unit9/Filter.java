import java.util.*;

public class Filter{

  public static ArrayList<Integer> findMax(ArrayList<Integer> input){

    ArrayList<Integer> scores = new ArrayList<Integer>();

    for(int inputs: input){
      if(inputs >= 90)
      scores.add(inputs);
    }
    return scores;
  }

  public static void main(String[] args){

    ArrayList<Integer> input = new ArrayList<Integer>();
    input.add(51);
    input.add(52);
    input.add(53);
    input.add(100);

    System.out.println("scores over 90 for input: " + findMax(input));

    ArrayList<Integer> input1 = new ArrayList<Integer>();
    input1.add(92);
    input1.add(89);
    input1.add(90);
    input1.add(99);

    System.out.println("scores over 90 for input1: " + findMax(input1));
  }

}

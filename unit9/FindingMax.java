import java.util.*;

public class FindingMax{

  public static void testFindMax(ArrayList<Double> input, double expected){
    System.out.println("ArrayList: " + input + " expected: " + expected);
    if(findMax(input) == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static double findMax(ArrayList<Double> input){

    double result = input.get(0);

    for(Double inputs: input){
      if(inputs > result)
        result = inputs;
    }
    return result;
  }


  public static void main(String[] args){
    ArrayList<Double> input = new ArrayList<Double>();
    input.add(1.0);
    input.add(2.1);
    input.add(5.3);

    System.out.println("max #: of input: " + findMax(input));

    ArrayList<Double> input1 = new ArrayList<Double>();
    input1.add(0.0);
    input1.add(-35.0);
    input1.add(90.1);

    System.out.println("max # of input1: " + findMax(input1));

    //unit test
    testFindMax(input, 5.3);
    testFindMax(input1, 90.1);
  }

}

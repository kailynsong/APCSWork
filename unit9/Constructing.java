import java.util.*;

public class Constructing{

  public static ArrayList<Integer> fibonacci(int n){
    ArrayList<Integer> result = new ArrayList<Integer>();
    int a = 1;
    int b = 1;
    result.add(a);
    result.add(b);

    for(int i = 1; i < n-1; i ++){
      result.add(a+b);
      b = a+b;
      a = b-a;
    }
    
    return result;
  }

  public static void main(String[] args){

    System.out.println(fibonacci(2));
    System.out.println(fibonacci(5));

  }
}

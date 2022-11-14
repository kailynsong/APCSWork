import java.util.*;

public class Transforming{

  public static String reverse(String s){
    String empty = "";
    for(int i = s.length(); i > 0; i--){
      empty += s.substring(i-1,i);
    }
    return empty;
  }

  public static ArrayList<String> reverseAll(ArrayList<String> words){
    ArrayList<String> result = new ArrayList<String>();

    for(String word: words){
        String empty = "";
      for(int i = word.length(); i > 0; i--){
        empty += word.substring(i-1,i);
      }
      result.add(empty);
    }
    return result; 
  }

  public static void main(String[] args){
    System.out.println(reverse("jojo"));

    ArrayList<String> words = new ArrayList<String>();
    words.add("abcd");
    words.add("xyz");

    System.out.println("reversed: " + reverseAll(words));
  }

}

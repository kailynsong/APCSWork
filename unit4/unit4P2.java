
public class unit4P2{

  public static void testStringTimes(String str, int n, String expected){

    System.out.println("String: " + str + " # of times: " + n +
                        " expected: " + expected);

    if(stringTimes(str, n).equals(expected)){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static String stringTimes(String str, int n) {
  String empty = "";
  for(int i = 0; i < n; i++){
    empty += str;
  }
  return empty;
}

  public static void main(String[] args){
    testStringTimes("Hi", 2, "HiHi");
    testStringTimes("Bye", 4, "ByeByeByeBye");
    testStringTimes("Hola", 3, "HolaHolaHola");
    testStringTimes("Hello", 1, "Hello");
  }

}

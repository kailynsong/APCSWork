public class unit4{

  public static void testStringSplosion(String str, String expected){
    System.out.println("String: " + str + " expected: " + expected);
    if(stringSplosion(str).equals(expected)){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static String stringSplosion(String str) {
  String empty = "";
  for(int i = 1; i <= str.length(); i++){
    empty = empty + str.substring(0,i);
  }
  return empty;
}

  public static void main(String[] args){
    testStringSplosion("Code", "CCoCodCode");
    testStringSplosion("abc", "aababc");
    testStringSplosion("ab", "aab");
    testStringSplosion("Kailyn", "KKaKaiKailKailyKailyn");
  }

}

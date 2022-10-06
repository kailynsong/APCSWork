
public class gooddeal{
  public static void testDeal(double originalPrice, double salePrice,
  boolean expected, boolean goodDeal){

    goodDeal = goodDeal(originalPrice, salePrice);

    System.out.println("Original Price: " + originalPrice +
    " Sale Price: " + salePrice + " expected: " + expected +
    " result: " + goodDeal);

    if(goodDeal == expected){
      System.out.println("Woohoo!");
    }else{
      System.out.println("Boohoo!");
    }
  }

  public static boolean goodDeal(double originalPrice, double salePrice){
    if(originalPrice*.75 >= salePrice)
    return true;
    else
    return false;
  }
  public static void main(String[] args){
    testDeal(100, 50, true, true);
    testDeal(50, 2, true, true);
    testDeal(200, 400, false, false);
    testDeal(100, 140, true, false);
  }
}

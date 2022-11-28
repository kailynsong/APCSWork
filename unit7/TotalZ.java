
public class TotalZ{

public static void testCountZNames(String[] a, int expected){
  System.out.println("expected outcome: " + expected);
  if(countZNames(a) == expected){
    System.out.println("Woohoo!");
  }else{
    System.out.println("Boohoo!");
  }
}

public static int countZNames(String[] a){
  int total = 0;
  for(int i = 0; i < a.length; i++){
    if(a[i].substring(0,1).equals("z") || a[i].substring(0,1).equals("Z")){
      total+=a[i].length();
  }
}
  return total;
}

public static void main(String[] args){
  String[] a = {"Zorro", "zero", "zippy"};
  String[] b = {"Zuri", "hi", "zoo"};

//naming arrays
  System.out.println("Array a: ");
  for(int i = 0; i < a.length; i++){
    System.out.println(a[i]);
  }

  System.out.println();

  System.out.println("Array b: ");
  for(int i = 0; i < b.length; i ++){
    System.out.println(b[i]);
  }

  System.out.println();
  
  //printing out results
  System.out.println("Sum of Z names of array a: " + countZNames(a));
  System.out.println("Sum of Z names of array b: " + countZNames(b));

//unit tests
  testCountZNames(a, 14);
  testCountZNames(b, 7);
}

}

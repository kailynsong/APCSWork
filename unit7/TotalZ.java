
public class TotalZ{

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
  System.out.println("Sum of Z names: " + countZNames(a));
}

}

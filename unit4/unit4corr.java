

public class unit4corr{

public static int sumOfEvens(int n){

int total = 0;

  for(int i = 0; i < 2*n; i++){
    if(i%2==0){
      total+=i;
    }
  }
  return total;
}

public static String mirror(String str){
  String empty = "";
  for(int i = str.length()-1; i >=0; i--){
    empty += str.substring(i,i+1);
  }
  return(str+empty);
}

public static void main(String[] args){
  System.out.println(sumOfEvens(0));
  System.out.println(sumOfEvens(4));
  System.out.println(sumOfEvens(10));
  System.out.println(mirror("hello"));
}

}

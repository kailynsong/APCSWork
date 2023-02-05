
public class ArrayInit{

  public static void main(String[] args){

    //PART A
      int c = 10;
      int[][] cells = new int[c][c];

      for(int i = 0; i < c; i++){
        for(int j = 0; j < c; j++){
          if(i == j){
            cells[i][j] = 1;
          }else{
            cells[i][j] = 0;
          }
        }
      }

    for(int[] row : cells){
      for(int value : row){
        System.out.print(value + " ");
      }
      System.out.println();
    }

    System.out.println();

    //PART B
    int a = 2;
    String[][] names = new String[a][a];
    names[0][0] = "Kailyn";
    names[0][1] = "Riley";
    names[1][0] = "Chase";
    names[1][1] = "Dr. Kessner";

    System.out.println("names:");
    for(String[] row: names){
      for(String name : row)
        System.out.print(name + " ");
        System.out.println();
    }

    System.out.println();

    //PART C
    int b = 5;
    double[][] nums = new double[b][b];

    for(int i = 0; i < b; i++){
      for(int j = 0; j < b; j++){
          nums[i][j] = i*10+11+j;
      }
    }

    for(double[] row : nums){
      for(double num : row){
        System.out.print(num + " ");
      }
      System.out.println();
    }

    System.out.println();

    //PART D
    double[][] n = new double[6][5];
    for(int i = 0; i < 6; i ++){
      for(int j = 0; j < 5; j ++){
        n[i][j] = i+1;
      }
    }

    for(double[] row : n){
      for(double number : row){
        System.out.print(number + " ");
      }
      System.out.println();
    }

}
}


public class ArrayInit{

  public static void main(String[] args){

    //PART A
      int n = 10;
      int[][] cells = new int[n][n];

      for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
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

    //PART C
    int b = 5;
    double[][] nums = new double[b][b];

    for(int i = 0; i < b; i++){
      for(int j = 0; i < b; j++){
        if(i == j){
          nums[i][j] = i*11;
        }
      }
    }

    for(double[] row : nums){
      for(double num : row){
        System.out.print(num + " ");
        System.out.println();
      }
    }

}
}

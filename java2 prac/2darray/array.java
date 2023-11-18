import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
         System.out.println(" enter the number of rows: ");
         int rows= s.nextInt();

         System.out.println(" enter the number of cols: ");
         int cols= s.nextInt();

         int[][]matrix= new int[rows][cols];
         System.out.println("enter the elements of matrix: ");
          for(int i=0; i< rows; i++){
            for(int j=0; i<cols; j++){
                matrix[i][j] = s.nextInt();
            }
          }
          System.out.println("the matrix in matrix form: ");
          for(int i=0; i<rows; i++){
            for(int j=0; i<cols; j++){
             System.out.print(matrix[i][j]+ " ");

    }
    System.out.println();
    
}
    }
}

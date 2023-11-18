public class array_11 {


    private static boolean checkIdentityMatrix(int[][] matrix){
        for(int i=0; i<matrix.length;i++)
            for(int j=0; j<matrix[i].length;j++){
                if((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) return false;
            }
        return true;
    }

    public static void main(String[] args){
        int[][] matrix = {{1,0,0},
                {0,1,9},
                {0,0,1}};
        if(checkIdentityMatrix(matrix)) System.out.println("The matrix is an identity matrix");
        else System.out.println("The matrix is not an identity matrix");
    }
}
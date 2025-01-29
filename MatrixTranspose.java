class MatrixOperations 
{
    void printMatrix(int[][] matrix) 
    {
        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printTranspose(int[][] matrix) 
    {
        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < matrix[0].length; i++) 
        { 
            for (int j = 0; j < matrix.length; j++) 
            { 
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}


public class MatrixTranspose extends MatrixOperations 
{
    public static void main(String[] args) 
    {
        int[][] matrix = 
        { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        MatrixTranspose obj = new MatrixTranspose(); 
        obj.printMatrix(matrix); 
        obj.printTranspose(matrix);
    }
}
import java.util.*;
class Matrixaddition{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int rows = s.nextInt();
        System.out.println("Enter the no of columns :");
        int cols = s.nextInt();
        int [][] matrix1 = new int[rows][cols];
        int [][] matrix2 = new int[rows][cols];
        int [][] resultmatrix = new int [rows][cols];
        System.out.println("Enter elements for the first matrix :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Element ["+i+"]["+j+"]:");
                matrix1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements for 2nd matrix :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("Element ["+i+"]["+j+"]:");
                matrix2[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                resultmatrix[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Resultant matrix after addition :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(resultmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
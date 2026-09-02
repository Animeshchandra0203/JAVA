import java.util.*;

public class TwoDimensionalSum {
    
    public static void main(String[] args) {
         int[][] matrix = new int[3][4];
         int sum=0;
         System.out.println("Sum of 2-d array");

         System.out.println("enter Array Elements: ");
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
               matrix[i][j] = sc.nextInt();
               sum += matrix[i][j];
            }
        }
        
        System.out.println("\narray given:");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
              System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("the sum of two day array = " + sum);
    }
}

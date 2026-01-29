
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
         System.out.println("enter number of coloums");
         int cols = sc.nextInt();

         int[][] A = new int[rows][cols];
         int[][] B = new int[rows][cols];
         int[][] sum = new int[rows][cols];

         System.out.println("enter elemets of matrix a");
         for (int i= 0;i < rows;i++){
            for(int j=0;j< cols;j++){
                A[i][j] = sc.nextInt();

            }
         }
         System.out.println("enter elements for matrix B");
         for (int i =0; i < rows; i++) {
            for(int j = 0 ;j < cols; j++){
                B[i][j] =sc.nextInt();

            }
                
            }

             for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum [i][j]=A[i][j]+B[i][j];
                    
                }
                 
             }
             System.out.println("sum of the matrices");
             for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.println(sum[i][j] +" ");
                    
                }
                System.out.println();
                 
             }
             if(rows != cols){
                System.out.println("matrix is not symmetric");
             }
             else{
                boolean symmetric =true;
                 for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        if (sum[i][j]!=sum[j][i]){
                            symmetric = false;
                            break;
                        }
                        
                    }
                     
                 }
                 if (symmetric){
                    System.out.println("the result  matrix is symmetric.");
                 }else{
                    System.out.println("the result matrix is not symmetrix");
                 }
             }
             sc.close();
         }



    }


// Reema Ali Al-Khalifah
package lab22;
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
      System.out.println("Array2D"); 
      System.out.println("Enter the numbers of rows:");
        int[][] Array2D ;
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        System.out.println("Enter the numbers of columns:");
        int col =input.nextInt();
        Array2D =new int[row][col] ;
    ReadArray(Array2D);
    PrintArray(Array2D);
    sumArray(Array2D);
    sumArrayRows(Array2D);
    sumArrayCol(Array2D);
   
    //  
       System.out.println("Array1"); 
    int[][] A ;
    
    System.out.println("Enter the numbers of rows:");
        int a = input.nextInt();
        System.out.println("Enter the numbers of cols:");
        int b = input.nextInt();
        A = new int[a][b];
        ReadArray(A);
        System.out.println("the first Array");
        PrintArray(A);
        System.out.println("Array2");
       int[][] B;
       System.out.println("Enter the numbers of rows:");
        int a1 = input.nextInt();
        System.out.println("Enter the numbers of cols:");
        int b1 = input.nextInt();
        B = new int[a1][b1];  
        ReadArray(B);
        System.out.println("the second Array");
        PrintArray(B);
        int[][]S = sumTwoArrays(A,B);
        System.out.println("total of the first and second Arrays:");
        PrintArray(S);

                }
    public static void ReadArray(int[][] Array2D){
       
        java.util.Scanner input = new Scanner(System.in);
        for (int row = 0; row < Array2D.length; row++){      
            for (int col = 0; col < Array2D[0].length; col++){
            Array2D[row][col]=input.nextInt();
            
            }
            }
    }
    
    public static void PrintArray(int[][] Arraytoprint){
        for (int row = 0; row < Arraytoprint.length; row++){      
            for (int col = 0; col < Arraytoprint[0].length; col++){
                System.out.print(Arraytoprint[row][col] + "  ");
            }
            System.out.println();
            }
    }

    public static int[][] sumTwoArrays(int A [][], int B[][]){
       int[][]C= new int [A.length][B[0].length];
        for (int row= 0; row < A.length; row++){      
            for (int col = 0; col <A[0].length; col++){
                C[row][col]=A[row][col]+B[row][col];
               
            }
            
    }
              return C;
}
    public static void sumArray(int[][] ArrayTosum){
        int total=0;
        for (int row = 0; row <  ArrayTosum.length; row++){
            for (int col = 0; col < ArrayTosum[0].length; col++){
           System.out.print(ArrayTosum[row][col] + "  ");
            total+= ArrayTosum[row][col]; 
        }
            System.out.println();
        }
    }
       
   public static void sumArrayRows(int[][] ArrayTosumRows){
       int total =0;
         for (int row = 0; row < ArrayTosumRows.length; row++){
        
          for (int col = 0; col <ArrayTosumRows[0].length; col++){       
            total+=ArrayTosumRows[row][col]; 
            System.out.println("sum for rows"+row+":"+total);
        }
       }
    }
    public static void sumArrayCol(int[][] ArrayTosumcols){
        for (int col = 0; col <ArrayTosumcols[0].length; col++){
        int total =0;
        for (int row = 0; row < ArrayTosumcols.length; row++){
            total+=ArrayTosumcols[row][col]; 
            System.out.println("sum for cols"+col+":"+total);
        }
 
        }
    }   
}

// Reema Ali Al-Khalifah






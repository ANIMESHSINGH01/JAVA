package Array;

import java.util.Scanner;

public class FindNumbers {

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers of rows and columns: ");
      int rows = sc.nextInt();
      int cols = sc.nextInt();

      int[][] numbers = new int[rows][cols];

      // input
      // row
      System.out.println("Enter the value of rows and columns: ");
      for(int i=0;i<rows;i++){
        // cols
        for(int j=0;j<cols;j++){
          // enter the value of rows and columns
          
          numbers[i][j] = sc.nextInt();
        }
      }
      // taking input for the number for which we're searching for
      System.out.println("Enter the value you're searching for: ");
      int x = sc.nextInt();

      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(numbers[i][j] == x){
            System.out.println("x found at locations (" + i + ", "+ j + ")");
          }
        }
      }

  }
  
}

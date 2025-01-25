package Loops;

import java.util.Scanner;

public class Table {
  public static void main(String[] args) {
    System.out.print("Enter the number for which you're finding a table: ");
    Scanner sc = new Scanner(System.in);
    
      int n = sc.nextInt();
      int mul;
      
      for(int i=1;i<=10;i++){
        mul = n*i;
        System.out.println(mul);
      }
  }
  
}

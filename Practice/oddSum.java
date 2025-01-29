package Practice;

import java.util.Scanner;

public class oddSum {
  public static int calculateOddSum(int n){

    int sum = 0;
    for(int i=1;i<=n;i+=2){
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the values: ");
    int n = sc.nextInt();
      
      int sum =calculateOddSum(n);
      System.out.println("The sum of odd numbers is: "+sum);
  }
  
}

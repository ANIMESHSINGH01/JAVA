package Practice;

import java.util.*;
public class Average {
  public static int calculateAvg(int a,int b,int c){
    int Average = ( a +  b + c)/3;
    return Average;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int Average = calculateAvg(a, b, c);
      System.out.println("The average of the numbers are: "+ Average);
  }
}

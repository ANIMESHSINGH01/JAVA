package Funcn;

import java.util.Scanner;

public class mulFunction {
  public static int calculateMul(int a,int b){
    int mul = a*b;
    return mul;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values of a and b: ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int mul = calculateMul(a, b);

      System.out.println("The product of a and b is: "+mul);
  }

  
}


package Practice;

import java.util.Scanner;

public class greaterNum {
  public static int calGreaterNumber(int a,int b){
      if(a>b){
      return a;
    }else{
      return b;
    }
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the values of a and b: ");
      int a = sc.nextInt();
      int b = sc.nextInt();

      int greater = calGreaterNumber(a, b);
      System.out.println("The greater number is "+greater);


  }
  
}

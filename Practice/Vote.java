package Practice;

import java.util.Scanner;

public class Vote {
  public static void isEligible(int age){
    if(age>=18){
      System.out.println("you are eligible to vote");
    }else{
      System.out.println("Not eligible to vote");
    }
  
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int age = sc.nextInt();

      isEligible(age);
      
  }
  
}

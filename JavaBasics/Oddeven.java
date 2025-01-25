import java.util.*;

public class Oddeven {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = sc.nextInt();
      
      if(number%2 == 0){
        System.out.println("even");
      }
      else{
        System.out.println("odd");
      }
  }  
}

import java.util.*;

public class Greater {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter two numbers: ");
      int a = sc.nextInt();
      int b = sc.nextInt();

      if(a>b){
        System.out.println("a is greater");
      }
      else if (a==b){
        System.out.println("a is equal to b");
      }
      else{
        System.out.println("b is greater");
      }
  }  
}

package Practice;

import java.util.Scanner;

public class Circumference {
  public static double calCircumference(double r){
    double circumference = (2*3.14)*r;
    return circumference;
  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of r: ");
      double r = sc.nextDouble();

      double circumference = calCircumference(r);
      System.out.println("The circumference of circle is: "+circumference);
  }
  
}

package String;

import java.util.*;
public class Strings{
  public static void main(String[] args) {
      // String name = "Tony";
      // String fullName = "Tony Stark";
      // String sentence = "My name is Tony Stark.";

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your full name: ");
      String name = sc.nextLine();
      System.out.println("Your name is: "+ name);
  }
}
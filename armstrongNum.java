import java.util.Scanner;


public class armstrongNum {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number: ");
      int number = scanner.nextInt();

      if(isArmstrong(number)){
        System.out.println(number + " is armstrong num");
      }
      else{
        System.out.println(number+ " isn't armstrong num");
      }
  }
  public static boolean isArmstrong(int num){
    int originalNum = num;
    int sum=0;

    int digits = String.valueOf(num).length();

    while(num>0){
      int digit = num%10;
      sum += Math.pow(digit,digits);
      num /= 10;
    }
    return sum == originalNum;
  }
}
// 153

// 1^1+5^1+3^1 = 1+

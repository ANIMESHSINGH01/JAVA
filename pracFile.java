// [22,32,45,223,54,21,2]
 

public class pracFile {
  public static void main(String[] args) {
      int[] numbers = {22,32,45,223,54,21,2};

      System.out.println("Number starting with 2: ");
      for(int num:numbers){
        if(String.valueOf(num).startsWith("2")){
          System.out.println(num);
        }
      }
  }
  
}

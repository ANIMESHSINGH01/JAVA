// [32,37,88,32,53,24,12]
public class sortArray{
  public static void main(String[] args) {
      int[] numbers = {32,37,88,32,53,24,12};
      for(int i=0;i<numbers.length-1;i++){
        for(int j=0;j<numbers.length-1-i;j++){
          if(numbers[j]>numbers[j+1]){
            int temp =numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = temp;
          }
        }
      }
      System.out.println("Sorted array: ");
      for(int num:numbers){
        System.out.print(num + " ");
      }
  }
}
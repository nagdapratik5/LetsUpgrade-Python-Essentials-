import java.util.Arrays;
import java.util.Scanner;
public class assig4problem3{
   public static void main(String args[]){
     
      Scanner s = new Scanner(System.in);
    
      int myArray[] = new int [5];
      int sum = 0;
      System.out.println("Enter the  5 elements of the array one by one ");

      for(int i=0; i<size; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }

      System.out.println("Sum of the  5 elements of the array ::"+sum);
   }
}
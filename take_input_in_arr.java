package array;
import java.util.Scanner;
public class take_input_in_arr {
     public static void main(String []args){
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int [] arr = new int[n];

          for(int i=0;i<n;i++){
               arr[i]= s.nextInt();
          }
          s.close();
          for(int i=0;i<n;i++){
               System.out.print(arr[i] + " ");
          }
     }
}

package array;
import java.util.Scanner;
public class array_average{
     public static void main (String[]args){
          //HERE WE ARE TAKING INPUT OF 'n' FROM THE USER WHICH TELLS THE SIZE OF AN ARRAY
          //AND 'int[]a' WILL AS THE VALUE INPUT OF THE ARRAY.
          Scanner s = new Scanner (System.in);
          int n = s.nextInt();
          int[]a = new int[n];
          for(int i = 0; i<n; i++){
               a[i]=s.nextInt();
          }
          s.close();
     System.out.print(average(a));
     }
     public static int average(int[] a){
          int sum = 0;
          for (int i = 0; i < a.length; i++ ){
               sum += a[i];
          }
          int avg = sum/a.length;
          return avg;
     }
} 
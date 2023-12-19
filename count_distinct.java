package array;

import java.util.Scanner;

public class count_distinct {
     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          int n = s.nextInt();
          int[] a = new int[n];
          for (int i = 0; i < n; i++) {
               a[i] = s.nextInt();
          }
          s.close();
          System.out.print(countDigits(a, n));
     }

     public static int countDigits(int[] a, int n) {
          int count = 0;
          boolean isDistinct = true;
          for (int x = 0; x < n; x++) {
               for (int y = x - 1; y >= 0; y--) {
                    if (a[x] == a[y]) {
                         isDistinct = false;
                         break;
                    }

               }
               if (isDistinct == true) {
                    count++;
               }
               isDistinct = true;
          }
          return count;
     }
}

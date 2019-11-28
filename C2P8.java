import java.util.Scanner;

public class C2P8 {
      public static void main(String[] args) {
             int i = 3, j = 5, k = 7, resEntero;
             double x = 3.5, y = 5.5, resReal;
             resEntero = ((j%k) /2) + 5;
             resEntero -= i;
             resEntero %= --k;
             System.out.println("\nPrimer resultado: " + resEntero);
             resReal = ((double) (i%k)/2);
             resReal++;
             y *= ++x;
             System.out.println("\nSegundo resultado: " + resReal);
             resReal -= --y;
             System.out.println("\nSegundo resultado: " + resReal);
      }
}

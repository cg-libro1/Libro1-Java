import java.util.Scanner;

public class C3P19 {
    public static void main(String[] args){
        int a, b, c;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese los tres números enteros: ");
        a = lee.nextInt();
        b = lee.nextInt();
        c = lee.nextInt();
        if (a > b)
              if (a > c)
                    System.out.printf("\nA es el mayor"); 
              else if (a == c)
                    System.out.printf ("\nA y C son los mayores");
              else 
                    System.out.printf ("\nC es el mayor");
        else if (a == b)
              if (a > c)
                    System.out.printf ("\nA y B son los mayores");
              else if (a == c)
                    System.out.printf("\nA, B y C son los mayores");
              else
                    System.out.printf("\nC es el mayor");
        else if (b > c)
              System.out.printf ("\nB es el mayor");
        else if (b == c)
              System.out.printf ("\nB y C son los mayores");
        else
              System.out.printf ("\nC es el mayor");
    }
}

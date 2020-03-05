import java.util.Scanner;

public class C4P6 {
    public static void main(String[] args){
        int i, n;
        double suma = 0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++)
              suma += (double) 1 / i;
        System.out.printf("Resultado de la serie= %.2f", suma);
    }
}


import java.util.Scanner;

public class C4P8 {
    public static void main(String[] args){
        int i, n, suma = 0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++)
              suma += Math.pow(i, i); 
        System.out.println("Resultado= " + suma);
    }
}


import java.util.Scanner;

public class C4P3 {
    public static void main(String[] args){
        int i, n, suma= 0, numero;
        double promedio;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números: ");
        n = lee.nextInt();
        for (i= 0; i < n; i++){
               System.out.print("Ingresa el número " + (i+1) + ": ");
               numero = lee.nextInt();
               suma += numero;
        }
        promedio = (double) suma / n;
        System.out.print("Suma = " + suma + "\t");
        System.out.printf("Promedio= %.2f", promedio);
    }
}

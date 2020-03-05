import java.util.Scanner;

public class C4P4 {
    public static void main(String[] args){
        int i, n, cuentaI= 0, numero, sumaP= 0, sumaI= 0;
        double promedio;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números: ");
        n = lee.nextInt();
        for (i= 0; i < n; i++){
              System.out.print("Ingresa el número " + (i+1) + ": ");
              numero = lee.nextInt();
              if (Math.pow(-1,numero)>0)
                     sumaP = sumaP + numero;
              else{
                     sumaI = sumaI + numero;
                     cuentaI = cuentaI + 1;
              }
        }
        promedio = (double) sumaI / cuentaI;
        System.out.print("Suma de pares: " + sumaP + "\t");
        System.out.printf("Promedio de impares: %.2f", promedio);
    }
}


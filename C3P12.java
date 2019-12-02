import java.util.Scanner;

public class C3P12 {
    public static void main(String[] args){
        int k;
        double x, resultado;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el valor de k: ");
        k = lee.nextInt();
        System.out.print("Ingresa el valor de x: ");
        x = lee.nextDouble();
        switch (k){
               case 1: resultado = x / 5; 
                     break;
               case 2: 
               case 3: resultado = Math.pow(x, 2);
                     break;
               case 4: resultado = Math.pow(x, 3) + 5;
                     break;
               default: resultado = Math.sqrt(x);
        }
        System.out.printf("\nF(x) =  %.2f", resultado);           
     }
}


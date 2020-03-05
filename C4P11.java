import java.util.Scanner;

public class C4P11 {
    public static void main(String[] args){
        int numero, digito, denominador = 1000, i;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el número de 4 dígitos: ");
        numero  = lee.nextInt();
        for (i= 1; i <= 4; i++){
              digito = numero / denominador;
              numero = numero - digito * denominador;
              denominador = denominador / 10;
              System.out.print(digito + "\t");
        }     
    }
}


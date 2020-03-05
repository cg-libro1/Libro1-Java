import java.util.Scanner;

public class C4P12 {
    public static void main(String[] args){
        int numero, nuevoN= 0, cifra = 10000, digito, i;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el número de 5 dígitos: ");
        numero  = lee.nextInt();
        for (i= 1; i <= 5; i++){
             digito = numero % 10;
             numero = numero / 10;
             nuevoN = nuevoN + digito * cifra;
             cifra = cifra / 10;
        }
        System.out.print("\nNuevo número= "+ nuevoN);
    }
}

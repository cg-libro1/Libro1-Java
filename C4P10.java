import java.util.Scanner;
public class C4P10 {
    
    
    public static void main(String[] args){
        int numero, digito, i;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el número de 4 dígitos: ");
        numero  = lee.nextInt();
        for (i= 1; i <= 4; i++){
                digito = numero % 10;
                numero = numero / 10;
                System.out.print(digito + "\t");
        }      
    }
}

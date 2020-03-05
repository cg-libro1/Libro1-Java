import java.util.Scanner;

public class C4P7 {
    public static void main(String[] args){
        int i, n, productoria = 1;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el valor de n: ");
        n = lee.nextInt();
        for (i= 2; i <= n; i++)
               productoria *= i; 
        System.out.println("Productoria= " + productoria);
    }
}

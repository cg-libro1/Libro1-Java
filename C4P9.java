import java.util.Scanner;

public class C4P9 {
    public static void main(String[] args){
        int i, primero = 0, segundo = 1, suma = primero + segundo, siguiente= 0;
        for (i= 3; i <= 22; i++){
              siguiente = primero + segundo;
              suma += siguiente;
              primero = segundo;
              segundo = siguiente;
        }    
        System.out.println("Término 22 de la serie= " + siguiente);
        System.out.println("Suma de la serie= " + suma);    
    }
}


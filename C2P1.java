import java.util.Scanner;
//Debes incorporar esta librería para poder utilizar la clase Scanner.

public class C2P1 {
      public static void main(String[] args) {
             int entero1, entero2;
             double resultado; 
             Scanner lee = new Scanner(System.in);
             //Así declaras e instancias el objeto lee que te permitirá leer los datos
             System.out.println("Ingresa dos números enteros: ");
             entero1 = lee.nextInt();        //Así puedes leer un dato entero: nextInt()
             entero2 = lee.nextInt();
             resultado = (double)(entero1+entero2)/2;     
             //Debes realizar un casting porque de otra forma se truncará el resultado
             System.out.println ("\nResultado: " + resultado);
      }
}


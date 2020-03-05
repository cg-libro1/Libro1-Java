import java.util.Scanner;

public class C4P13 {
    public static void main(String[] args){
        int entero, sumaD= 0, i; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa el número correspondiente: ");
        entero  = lee.nextInt();
        for(i= 1; i <= entero / 2; i++)
              if(entero % i == 0)
                     sumaD += i;
        if(sumaD == entero)
              System.out.println(entero + " es un número perfecto");
        else
            System.out.println(entero + " no es un número perfecto");
    }
}

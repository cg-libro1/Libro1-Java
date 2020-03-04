import java.util.Scanner;

public class C3P16 {
    public static void main(String[] args){
        int n1, n2, n3;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese tres números enteros distintos: ");
        n1 = lee.nextInt();
        n2 = lee.nextInt();
        n3 = lee.nextInt();
        if (n1 > n2)
              if (n1 > n3)
                    if (n2 > n3)
                          System.out.printf("\n" + n1 + "\t" + n2 + "\t" + n3);
                    else
                          System.out.printf("\n" + n1 + "\t" + n3 + "\t" + n2);
              else
                    System.out.printf("\n" + n3 + "\t" + n1 + "\t" + n2);
        else if (n2 > n3)     //Observa la forma de escribir el else if
              if (n1 > n3)
                    System.out.printf("\n" + n2 + "\t" + n1 + "\t" + n3);
              else
                    System.out.printf("\n" + n2 + "\t" + n3 + "\t" + n1);
        else
              System.out.printf("\n" + n3 + "\t" + n2 + "\t" + n1);
    }
}


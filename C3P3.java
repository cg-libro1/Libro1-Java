import java.util.Scanner;

public class C3P3 { 
    public static void main(String[] args) {
        int numeroSonidos;
        double temperatura;
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingrese el número de sonidos del grillo: ");
        numeroSonidos = lee.nextInt();
        if (numeroSonidos >= 0){
              temperatura = 10 + (numeroSonidos - 40) / 7;
              System.out.printf("\nLa temperatura en grados Celsius: %.2f", temperatura);
        }
        /*Observa nuevamente que, si dentro del if hay más de una instrucción, 
          entonces éstas se colocan entre llaves*/                 
    }
}

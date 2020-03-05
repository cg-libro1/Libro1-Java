import java.util.Scanner;

public class C4P5 {
    public static void main(String[] args){
        int i, n, matricula, mayorM= 0, menorM= 0;
        double promedioA, promedioG= 0, mayorC= 0, menorC= 10;
        /* Para encontrar el promedio mayor la variable se debe inicializar con un valor    
        muy bajo, cero, por ejemplo. Por otra parte, para obtener el promedio menor la 
        variable se debe inicializar con un valor muy alto (10). */
        Scanner lee = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de alumnos: ");
        n = lee.nextInt();
        for (i= 0; i < n; i++){
            System.out.print("Ingresa la matrícula y promedio del alumno "+(i+1)+": ");
            matricula = lee.nextInt();
            promedioA = lee.nextDouble();
            if(promedioA > mayorC){
                  mayorC = promedioA;
                  mayorM = matricula;
            }
            if(promedioA < menorC){
                  menorC = promedioA;
                  menorM = matricula;
            }
            promedioG += promedioA;
        }
        promedioG = promedioG / n;
        System.out.printf("Promedio grupo: %.2f", promedioG);
        System.out.println("\nMatrícula y mayor calificación: " + mayorM + " " + 
                 mayorC);
        System.out.println("Matrícula y menor calificación: " + menorM + " " + 
                 menorC);
    }
}


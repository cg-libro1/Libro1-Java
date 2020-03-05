import java.util.Scanner;
public class C3P23 {
    public static void main(String[] args){
        int clave, categoria, antigüedad; 
        boolean respuesta; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Clave del empleado: ");
        clave = lee.nextInt();
        System.out.print("Categoría: ");
        categoria = lee.nextInt ();
        System.out.print("Antigüedad: ");
        antigüedad = lee.nextInt ();
        respuesta = false;
        switch (categoria) {
               case 3:
               case 5: if (antigüedad >= 5)
                                respuesta = true;
                    break;
            case 2: if (antigüedad >= 10)
                               respuesta = true;
        }
        if (!respuesta)
               System.out.printf("\nEl empleado con clave " + clave + " no reúne las"
                    + " características para el puesto");
        else 
               System.out.printf("\nEl empleado con clave " + clave + " reúne las"
                    + " características para el puesto");
    }
}


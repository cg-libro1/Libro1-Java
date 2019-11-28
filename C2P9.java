import java.util.Scanner;

public class C2P9 {
    public static void main(String[] args) {
        double ha, yarda2, rod2, acre, homestead, milla2;
        Scanner lee = new Scanner(System.in);
        System.out.print("\nIngrese el número de hectáreas de la estancia: ");
        ha = lee.nextDouble();
        yarda2 = ha * 10000 / 0.83612736;
        rod2 = yarda2 / 30.25;
        acre = rod2 / 160;
        homestead = acre / 160;
        milla2 = homestead / 4;
        System.out.println("\nLa estancia tiene: \n");
        System.out.printf("%.2f yardas cuadradas \n", yarda2);
        System.out.printf("%.2f rods cuadrado \n", rod2);
        System.out.printf("%.2f acres \n", acre);
        System.out.printf("%.2f homesteads \n" , homestead);
        System.out.printf("%.2f millas cuadradas \n", milla2);
    }
}


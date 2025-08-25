package practica02;
import java.util.Scanner;

public class p010_HipotenusaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado: ");
        double longitudLado1 = scanner.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado: ");
        double longitudLado2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(longitudLado1 * longitudLado1 + longitudLado2 * longitudLado2);

        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }
}
package practica02;
import java.util.Scanner;

public class p013_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();

        double volumen = Math.PI * radio * radio * altura;

        System.out.printf("El volumen del cilindro es: %.2f%n", volumen);

        scanner.close();
    }
}
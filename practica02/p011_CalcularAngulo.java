package practica02;
import java.util.Scanner;

public class p011_CalcularAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer ángulo del triángulo: ");
        double angulo1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo ángulo del triángulo: ");
        double angulo2 = scanner.nextDouble();

        double angulo3 = 180 - (angulo1 + angulo2);

        System.out.println("El tercer ángulo del triángulo es: " + angulo3);

        scanner.close();
    }
}
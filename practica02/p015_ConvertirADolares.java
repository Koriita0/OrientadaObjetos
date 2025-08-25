package practica02;
import java.util.Scanner;

public class p015_ConvertirADolares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en pesos: ");
        double pesos = scanner.nextDouble();

        System.out.print("Ingrese la cotización del dólar: ");
        double cotizacionDolar = scanner.nextDouble();

        if (cotizacionDolar <= 0) {
            System.out.println("La cotización del dólar debe ser mayor a cero.");
        } else {
            double dolares = pesos / cotizacionDolar;
            System.out.printf("Equivalente en dólares: %.2f\n", dolares);
        }

        scanner.close();
    }
}
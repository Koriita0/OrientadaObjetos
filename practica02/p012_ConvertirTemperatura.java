package practica02;
import java.util.Scanner;

public class p012_ConvertirTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
    }
}
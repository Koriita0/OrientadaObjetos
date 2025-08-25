package practica02;
import java.util.Scanner;

public class p014_CalculoTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas: ");
        int horas = scanner.nextInt();

        int dias = horas / 24;
        int horasRestantes = horas % 24;
        int minutos = horas * 60;
        int segundos = minutos * 60;

        System.out.println("Equivalente:");
        System.out.println("Días: " + dias);
        System.out.println("Horas restantes: " + horasRestantes);
        System.out.println("Minutos: " + minutos);
        System.out.println("Segundos: " + segundos);

        scanner.close();
    }
}
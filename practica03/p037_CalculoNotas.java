package practica03;

import java.util.Scanner;

public class p037_CalculoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int cantidad = 5;

        System.out.println("Introduce 5 calificaciones:");

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Calificación " + i + ": ");
            double calificacion = scanner.nextDouble();
            suma += calificacion;
        }

        double promedio = suma / cantidad;
        System.out.printf("Promedio: %.2f\n", promedio);

        if (promedio > 0 && promedio <= 6) {
            System.out.println("Quedas reprobado");
        } else if (promedio > 6 && promedio <= 7) {
            System.out.println("Pasas de panzazo");
        } else if (promedio > 7 && promedio <= 8) {
            System.out.println("Muy bien, puedes mejorar");
        } else if (promedio > 8 && promedio <= 9) {
            System.out.println("Excelente, sigue así");
        } else if (promedio > 9 && promedio <= 10) {
            System.out.println("Perfecto, tu esfuerzo valió la pena");
        } else {
            System.out.println("Promedio fuera de rango");
        }

        scanner.close();
    }
}
package practica08;

import java.util.Scanner;

public class p091_MayoresPromedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántas calificaciones desea capturar? ");
        int n = sc.nextInt();

        float[] calificaciones = new float[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextFloat();
        }

        System.out.print("Calificaciones capturadas: ");
        for (float cal : calificaciones) {
            System.out.print(cal + " ");
        }
        System.out.println();

        float suma = 0;
        for (float cal : calificaciones) {
            suma += cal;
        }
        float promedio = suma / n;
        System.out.println("Suma de calificaciones: " + suma);
        System.out.println("Promedio: " + promedio);

        int contador = 0;
        System.out.print("Calificaciones mayores al promedio: ");
        for (float cal : calificaciones) {
            if (cal > promedio) {
                System.out.print(cal + " ");
                contador++;
            }
        }
        System.out.println();
        System.out.println("Cantidad de calificaciones mayores al promedio: " + contador);

        sc.close();
    }
}

package actividad7;

import java.util.Scanner;

public class p041_ProcesaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Procesa n calificaciones, calcula la suma y el promedio");
        System.out.print("¿Cuántas calificaciones? ");
        int cantidad = scanner.nextInt();
        float suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.printf("Calificación %d? ", i);
            float calificacion = scanner.nextFloat();
            suma += calificacion;
        }

        float promedio = suma / cantidad;
        System.out.printf("La suma es : %.2f\n", suma);
        System.out.printf("El promedio es : %.2f\n", promedio);
    }
}
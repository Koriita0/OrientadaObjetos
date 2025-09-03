package practica03;

import java.util.Scanner;

public class p038_AceptarEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Sexo (h/m): ");
        char sexo = sc.next().toLowerCase().charAt(0);

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Calificación 1: ");
        double cal1 = sc.nextDouble();
        System.out.print("Calificación 2: ");
        double cal2 = sc.nextDouble();
        System.out.print("Calificación 3: ");
        double cal3 = sc.nextDouble();
        double promedio = (cal1 + cal2 + cal3) / 3.0;
        boolean aceptada = sexo == 'm' && edad > 21 && promedio >= 8 && promedio <= 9.5;

        if (aceptada) {
            System.out.println("Estudiante aceptada: " + nombre);
        } else {
            System.out.println("Estudiante NO aceptada: " + nombre);
        }

        sc.close();
    }
}
import java.util.Scanner;

public class p006_PromedioCalificaciones {
    public static void main(String[] args) {
        float calificacionUno, calificacionDos, calificacionTres;
        float sumaCalificaciones, promedioCalificaciones;
        float calificacionMinima, calificacionMaxima;

        calificacionUno = calificacionDos = calificacionTres = 0;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println("Calculando el promedio de tres calificaciones, así como la mayor y la menor:\n");

        System.out.print("Dame la calificación 1: ");
        calificacionUno = entradaUsuario.nextFloat();

        System.out.print("Dame la calificación 2: ");
        calificacionDos = entradaUsuario.nextFloat();

        System.out.print("Dame la calificación 3: ");
        calificacionTres = entradaUsuario.nextFloat();

        sumaCalificaciones = calificacionUno + calificacionDos + calificacionTres;
        promedioCalificaciones = sumaCalificaciones / 3;

        calificacionMinima = Math.min(Math.min(calificacionUno, calificacionDos), calificacionTres);
        calificacionMaxima = Math.max(Math.max(calificacionUno, calificacionDos), calificacionTres);

        System.out.printf("\nLas calificaciones introducidas son: %.2f, %.2f, %.2f\n", calificacionUno, calificacionDos, calificacionTres);
        System.out.printf("Suma de calificaciones: %.2f\n", sumaCalificaciones);
        System.out.printf("Promedio: %.2f\n", promedioCalificaciones);
        System.out.printf("Calificación menor: %.2f\n", calificacionMinima);
        System.out.printf("Calificación mayor: %.2f\n", calificacionMaxima);
    }
}

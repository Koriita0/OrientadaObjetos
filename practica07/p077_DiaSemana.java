package practica07;

import java.util.Scanner;

public class p077_DiaSemana {

    public static String obtenerDiaSemana() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduce un número entre 1 y 7: ");
            num = sc.nextInt();
            if (num < 1 || num > 7) {
                System.out.println("Número fuera de rango. Intenta de nuevo.");
            }
        } while (num < 1 || num > 7);

        String[] dias = {
            "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        };
        return dias[num - 1];
    }

    public static void main(String[] args) {
        String dia = obtenerDiaSemana();
        System.out.println("El día de la semana es: " + dia);
    }
}

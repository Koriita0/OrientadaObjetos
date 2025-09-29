package practica07;

import java.util.Scanner;

public class p080_Angulo {

    public static String tipoAngulo(int angulo) {
        if (angulo < 90) {
            return "agudo";
        } else if (angulo == 90) {
            return "recto";
        } else if (angulo > 90 && angulo < 180) {
            return "obtuso";
        } else if (angulo == 180) {
            return "llano";
        } else if (angulo > 180 && angulo < 360) {
            return "concavo";
        } else {
            return "desconocido";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un ángulo entre 0 y 360 grados: ");
        int angulo = sc.nextInt();

        if (angulo < 0 || angulo > 360) {
            System.out.println("Ángulo fuera de rango.");
            return;
        }

        String tipo = tipoAngulo(angulo);
        System.out.println("El ángulo es: " + tipo);
    }
}

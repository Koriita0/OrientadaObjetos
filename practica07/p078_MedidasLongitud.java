package practica07;

import java.util.Scanner;

public class p078_MedidasLongitud {
    public static double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public static double metrosAPies(double metros) {
        return metros * 3.281;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de conversión:");
            System.out.println("1. Convertir pulgadas a centímetros");
            System.out.println("2. Convertir metros a pies");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese las pulgadas: ");
                    double pulgadas = sc.nextDouble();
                    double centimetros = pulgadasACentimetros(pulgadas);
                    System.out.println(pulgadas + " pulgadas = " + centimetros + " centímetros");
                    break;
                case 2:
                    System.out.print("Ingrese los metros: ");
                    double metros = sc.nextDouble();
                    double pies = metrosAPies(metros);
                    System.out.println(metros + " metros = " + pies + " pies");
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 3);
        sc.close();
    }
}

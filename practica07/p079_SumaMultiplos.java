package practica07;

import java.util.Scanner;

public class p079_SumaMultiplos {

    public static int sumaMultiplos(int ini, int fin, int multiplo) {
        int suma = 0;
        for (int i = ini; i <= fin; i++) {
            if (i % multiplo == 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ini, fin, opcion, multiplo;

        System.out.println("Menú de suma de múltiplos:");
        System.out.println("1. Sumar múltiplos de 3");
        System.out.println("2. Sumar múltiplos de 4");
        System.out.print("Elige una opción (1 o 2): ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            multiplo = 3;
        } else if (opcion == 2) {
            multiplo = 4;
        } else {
            System.out.println("Opción inválida.");
            return;
        }

        System.out.print("Introduce el número inicial del rango: ");
        ini = sc.nextInt();
        System.out.print("Introduce el número final del rango: ");
        fin = sc.nextInt();

        if (ini >= fin) {
            System.out.println("El rango no es válido (ini debe ser menor que fin).");
            return;
        }

        int suma = sumaMultiplos(ini, fin, multiplo);
        System.out.println("La suma de los múltiplos de " + multiplo + " entre " + ini + " y " + fin + " es: " + suma);
    }
}

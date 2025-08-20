package actividad1;

import java.util.Scanner;

public class p004_PagaTrabajador {
    public static void main(String[] args) {
        String nombreTrabajador;
        int horas;
        Double pagaHora, impuesto, impuestoR, pagaBruta, pagaNeta;

        Scanner obj = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        nombreTrabajador = obj.nextLine();

        System.out.println("Cuantas horas trabajas? ");
        horas = obj.nextInt();

        System.out.println("Cuanto ganas por hora? ");
        pagaHora = obj.nextDouble();

        impuesto = 0.05;

        pagaBruta = horas * pagaHora;

        impuestoR = pagaBruta * impuesto;

        pagaNeta = pagaBruta - impuestoR;

        System.out.println("Resumen de pagos:");
        System.out.println(String.format(
                "El trabajador %s, trabajó %d horas, a una paga de %.2f por hora, con una tasa de impuesto de %.2f",
                nombreTrabajador, horas, pagaHora, impuesto));
        System.out.println(String.format("Pago bruto: %.2f", pagaBruta));
        System.out.println(String.format("Impuesto: %.2f", impuestoR));
        System.out.println(String.format("Pago neto: %.2f", pagaNeta));

    }
}

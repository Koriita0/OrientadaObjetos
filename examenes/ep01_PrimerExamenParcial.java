package examenes;

import java.util.Scanner;

public class ep01_PrimerExamenParcial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalEstudiantes = 0, totalAdultos = 0, totalTerceraEdad = 0;
        int totalHombres = 0, totalMujeres = 0;
        int totalAsistentes = 0, sumaEdades = 0, rechazados = 0;
        int recaudadoEstudiantes = 0, recaudadoAdultos = 0, recaudadoTerceraEdad = 0;

        final int PRECIO_ESTUDIANTE = 50;
        final int PRECIO_ADULTO = 90;
        final int PRECIO_TERCERA_EDAD = 60;

        String otraVenta;
        do {
            System.out.print("Edad del comprador: ");
            int edad = sc.nextInt();
            sc.nextLine();

            if (edad < 14) {
                System.out.println("Acceso denegado. La película es clasificación B (mayores de 13 años).");
                rechazados++;
            } else {
                System.out.print("Tipo de comprador (Estudiante, Adulto, Tercera Edad): ");
                String tipo = sc.nextLine().trim().toLowerCase();

                System.out.print("Sexo (Hombre, Mujer): ");
                String sexo = sc.nextLine().trim().toLowerCase();

        
                if (tipo.startsWith("e")) {
                    totalEstudiantes++;
                    recaudadoEstudiantes += PRECIO_ESTUDIANTE;
                } else if (tipo.startsWith("a")) {
                    totalAdultos++;
                    recaudadoAdultos += PRECIO_ADULTO;
                } else if (tipo.startsWith("t")) {
                    totalTerceraEdad++;
                    recaudadoTerceraEdad += PRECIO_TERCERA_EDAD;
                }

                if (sexo.startsWith("h")) {
                    totalHombres++;
                } else if (sexo.startsWith("m")) {
                    totalMujeres++;
                }

                totalAsistentes++;
                sumaEdades += edad;

                System.out.println("¡Bienvenido! Edad: " + edad + ", Sexo: " + sexo + ", Tipo: " + tipo);
            }

            System.out.print("¿Registrar otra venta? (S/N): ");
            otraVenta = sc.nextLine().trim().toUpperCase();
        } while (otraVenta.equals("S"));

        int totalRecaudado = recaudadoEstudiantes + recaudadoAdultos + recaudadoTerceraEdad;
        double promedioEdad = totalAsistentes > 0 ? (double) sumaEdades / totalAsistentes : 0;

        System.out.println("\n--- Estadísticas del público ---");
        System.out.println("Total de Estudiantes: " + totalEstudiantes);
        System.out.println("Total de Adultos: " + totalAdultos);
        System.out.println("Total de personas de la Tercera Edad: " + totalTerceraEdad);
        System.out.println("Total de Hombres: " + totalHombres);
        System.out.println("Total de Mujeres: " + totalMujeres);
        System.out.println("Total de asistentes: " + totalAsistentes);
        System.out.printf("Promedio de edad de asistentes: %.2f\n", promedioEdad);
        System.out.println("Total de personas rechazadas por la edad: " + rechazados);

        System.out.println("\n--- Ingresos ---");
        System.out.println("Recaudado por Estudiantes: $" + recaudadoEstudiantes);
        System.out.println("Recaudado por Adultos: $" + recaudadoAdultos);
        System.out.println("Recaudado por Tercera Edad: $" + recaudadoTerceraEdad);
        System.out.println("Total recaudado: $" + totalRecaudado);

        System.out.println("\n--- Rentabilidad de la función ---");
        if (totalRecaudado < 1500) {
            System.out.println("La función generó BAJAS ganancias.");
        } else if (totalRecaudado <= 3500) {
            System.out.println("La función generó ganancias MODERADAS.");
        } else {
            System.out.println("La función generó BUENAS ganancias.");
        }

        sc.close();
    }
}

/* Preguntas teoricas, contesta con tus propias palabras, aqui mismo:

1. ¿ Qué estructura utilizaste para determinar el tipo de comprador y por que no otra estructura?
   R: Utilicé una serie de condicionales if-else para determinar el tipo de comprador, y para evular la respuesta de la persona utilize el prefix de la primera letra.

2. ¿ Qué tipo de dato elegiste para las variables que cuentan el tipo de público que asiste a la función y por qué fue la mejor opción?
   R: Elegí el tipo de dato entero (int) para contar el número de personas en cada categoría, ya que es un valor que se incrementa y se puede representar de manera eficiente con este tipo.

3. ¿ Qué tipo de dato elegiste para las variables que almacenan el dinero recaudado y por qué esa fue la mejor opción?
   R: Elegí el tipo de dato doble (double) para las variables que almacenan el dinero recaudado, ya que puede manejar decimales y es adecuado para representar cantidades monetarias.

4. Si tuvieras que añadir un nuevo tipo de comprador, 'Socio del Cine', ¿Qué partes exactas de tu código necesitarías modificar?"
    R: Necesitaría añadir una nueva condición en la sección donde se determina el tipo de comprador, así como una nueva variable para contar el número de socios y otra para almacenar el dinero recaudado por ellos. También tendría que definir el precio especial para los socios.
 
 */
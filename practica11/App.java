package practica11;

public class App {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[4];
        flota[0] = new Compacto("CP0100010122", "Ford", 2023, 125345.22, 4, 2);
        flota[1] = new Compacto("CP1000145555", "Nissan", 2010, 54500.33, 6, 4);
        flota[2] = new Camioneta("CA104014544", "Dina", 2008, 234567.15, 450.0, 4);
        flota[3] = new Camioneta("CA774814599", "Hongyan", 2023, 934577.98, 1200.0, 6);

        System.out.println("Datos de los Vehiculos de la flota");
        double suma = 0.0;
        for (Vehiculo v : flota) {
            System.out.println(v);
            suma += v.getPrecio();
        }
        System.out.println("Calculando el total de precio de todos los vehículos ...");
        for (Vehiculo v : flota) {
            System.out.println(v.getPrecio());
        }
        System.out.println("La suma de precios es: " + suma);
    }
}
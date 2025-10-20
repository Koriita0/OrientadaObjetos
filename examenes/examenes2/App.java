package examenes.examenes2;

public class App {
    public static void main(String[] args) {
        
        Flota miFlota = new Flota("División Norte", "Monterrey");
        
        System.out.println("--- Reporte Inicial ---\n");
        System.out.println(miFlota.toString());
        System.out.println();
        
        miFlota.agregarVehiculo(new CamionCarga("Volvo", "FMX", 30000, 2500.0, 4, 5000.0));
        miFlota.agregarVehiculo(new CamionCarga("Kenworth", "T680", 25000, 1800.0, 3, 4200.0));
        
        miFlota.agregarVehiculo(new AutobusPasajeros("Mercedes", "O500", 50, 1200.0, 5, 8500));
        miFlota.agregarVehiculo(new AutobusPasajeros("Irizar", "i6", 40, 1500.0, 8, 12000));
        miFlota.agregarVehiculo(new AutobusPasajeros("Scania", "K360", 45, 950.0, 4, 6200));
        
        System.out.println("--- Reporte Final con Datos de Prueba ---\n");
        miFlota.reporte();
    }
}

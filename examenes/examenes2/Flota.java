package examenes.examenes2;

import java.util.ArrayList;
import java.text.DecimalFormat;


public class Flota {
    private String Nombre;
    private String Ciudad;
    private ArrayList<Vehiculo> Vehiculos; 
    private static final DecimalFormat DF = new DecimalFormat("0.0");


    public Flota(String Nombre, String Ciudad) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        Vehiculos.add(vehiculo);
    }

    public double getTotalBono() {
        double totalBono = 0.0;
        for (Vehiculo v : Vehiculos) {
            totalBono += v.getBonoConductor(); 
        }
        return totalBono;
    }


    public double getTotalCosto() {
        double totalCosto = 0.0;
        for (Vehiculo v : Vehiculos) {
            totalCosto += v.getCostoTotal();
        }
        return totalCosto;
    }


    public int getNumCamiones() {
        int count = 0;
        for (Vehiculo v : Vehiculos) {
            if (v instanceof CamionCarga) {
                count++;
            }
        }
        return count;
    }

    public int getNumAutobuses() {
        int count = 0;
        for (Vehiculo v : Vehiculos) {
            if (v instanceof AutobusPasajeros) {
                count++;
            }
        }
        return count;
    }


    public void reporte() {
        System.out.println(">> Reporte Detallado de la Flota <<");
        for (Vehiculo v : Vehiculos) {
            
            System.out.println(v.toString());
        }

        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Flota [Nombre=" + Nombre 
             + ", Ciudad=" + Ciudad 
             + ", Vehiculos=" + Vehiculos.size()
             + ", BonoTotal=" + DF.format(getTotalBono())
             + ", CostoTotal=" + DF.format(getTotalCosto())
             + ", Camiones=" + getNumCamiones()
             + ", Autobuses=" + getNumAutobuses() + "]";
    }
}
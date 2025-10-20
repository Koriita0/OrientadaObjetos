package examenes.examenes2;

import java.text.DecimalFormat;

public abstract class Vehiculo {
    protected String Marca;
    protected String Modelo;
    protected int Capacidad;
    protected double CostoBase;
    protected double CostoTotal;

    protected static final DecimalFormat DF = new DecimalFormat("0.00");

    public Vehiculo(String Marca, String Modelo, int Capacidad, double CostoBase) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Capacidad = Capacidad;
        this.CostoBase = CostoBase;

        this.CostoTotal = 0.0;
    }
    
    public abstract double getBonoConductor();
    
    public double getCostoTotal() { return CostoTotal; }
    public double getCostoBase() { return CostoBase; }
    
    @Override
    public String toString() {
        return "Vehiculo [Marca=" + Marca + ", Modelo=" + Modelo + ", Capacidad=" + Capacidad 
             + ", CostoBase=" + DF.format(CostoBase) + "]";
    }
}

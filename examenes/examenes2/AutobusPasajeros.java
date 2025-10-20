package examenes.examenes2;

public class AutobusPasajeros extends Vehiculo {
    private int Rutas;
    private int PasajerosTransportados;
    private double bonoCalculado; 

    public AutobusPasajeros(String Marca, String Modelo, int Capacidad, double CostoBase, int Rutas, int PasajerosTransportados) {
        super(Marca, Modelo, Capacidad, CostoBase);
        this.Rutas = Rutas;
        this.PasajerosTransportados = PasajerosTransportados;
        
        this.bonoCalculado = calcularBonoEspecifico();
        this.CostoTotal = this.CostoBase + this.bonoCalculado;
    }

    private double calcularBonoEspecifico() {
        return (this.CostoBase * 0.15) + (this.Rutas * 120) + (this.PasajerosTransportados * 0.1);
    }
    
    @Override
    public double getBonoConductor() {
        return this.bonoCalculado;
    }

    @Override
    public String toString() {
        return "AutobusPasajeros [" + super.toString() 
             + ", Rutas=" + Rutas 
             + ", PasajerosTransportados=" + PasajerosTransportados 
             + ", Bono=" + DF.format(bonoCalculado) 
             + ", CostoTotal=" + DF.format(CostoTotal) + "]";
    }
}

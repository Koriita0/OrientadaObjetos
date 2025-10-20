package examenes.examenes2;

public class CamionCarga extends Vehiculo {
    private int Ejes;
    private double Kilometraje;
    private double bonoCalculado; 

    public CamionCarga(String Marca, String Modelo, int Capacidad, double CostoBase, int Ejes, double Kilometraje) {
        super(Marca, Modelo, Capacidad, CostoBase);
        this.Ejes = Ejes;
        this.Kilometraje = Kilometraje;
        
        this.bonoCalculado = calcularBonoEspecifico(); 
        this.CostoTotal = this.CostoBase + this.bonoCalculado;
    }

    private double calcularBonoEspecifico() {
        return (this.CostoBase * 0.10) + (this.Ejes * 50) + (this.Kilometraje * 0.5);
    }


    @Override
    public double getBonoConductor() {
        return this.bonoCalculado;
    }

    @Override
    public String toString() {
        return "CamionCarga [" + super.toString() 
             + ", Ejes=" + Ejes 
             + ", Kilometraje=" + DF.format(Kilometraje) 
             + ", Bono=" + DF.format(bonoCalculado) 
             + ", CostoTotal=" + DF.format(CostoTotal) + "]";
    }
}

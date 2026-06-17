public class DepositoAgua {

    private double       capacidad;
    private double       volumenActual;
    private DepositoAgua depositoDesborde;

    
    public DepositoAgua() {}

   
    public DepositoAgua(double capacidad) {
        this.capacidad        = capacidad;
        this.volumenActual    = 0;
        this.depositoDesborde = null;
    }

   
    public DepositoAgua(double capacidad, double volumenActual) {
        this.capacidad        = capacidad;
        this.volumenActual    = volumenActual;
        this.depositoDesborde = null;
    }

    public double getCapacidad()                    { return capacidad; }
    public void   setCapacidad(double c)            { this.capacidad = c; }
    public double getVolumenActual()                { return volumenActual; }
    public void   setVolumenActual(double v)        { this.volumenActual = v; }
    public DepositoAgua getDepositoDesborde()       { return depositoDesborde; }
    public void setDepositoDesborde(DepositoAgua d) { this.depositoDesborde = d; }

    public void mostrarInfo() {
        System.out.println("Capacidad     : " + capacidad + " L");
        System.out.println("Volumen actual: " + volumenActual + " L");
        System.out.println("Desborde      : " +
            (depositoDesborde != null ? "Sí (cap. " + depositoDesborde.getCapacidad() + " L)" : "Ninguno"));
     
    }

    public void agregar(double litros) {
        double espacio = capacidad - volumenActual;
        if (litros <= espacio) {
            volumenActual += litros;
            System.out.println("Se agregaron " + litros + " L. Volumen: " + volumenActual + " L");
        } else {
            volumenActual = capacidad;
            double excedente = litros - espacio;
            System.out.println("Depósito lleno. Excedente: " + excedente + " L");
            if (depositoDesborde != null) {
                System.out.println("Enviando excedente al depósito de desborde...");
                depositoDesborde.agregar(excedente);
            } else {
                System.out.println("Sin desborde. Se pierden " + excedente + " L.");
            }
        }
    }

    public void vaciar(double litros) {
        if (litros <= volumenActual) {
            volumenActual -= litros;
            System.out.println("Se vaciaron " + litros + " L. Volumen: " + volumenActual + " L");
        } else {
            System.out.println("No hay suficiente agua. Solo quedan " + volumenActual + " L.");
        }
    }
}
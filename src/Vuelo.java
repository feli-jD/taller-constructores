public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int    ocupacion;
    private int    capacidadMaxima;

    // Constructor vacío
    public Vuelo() {}

    // Constructor de ruta
    public Vuelo(String numero, String origen, String destino) {
        this.numero    = numero;
        this.origen    = origen;
        this.destino   = destino;
        this.ocupacion = 0;
    }

    // Constructor completo
    public Vuelo(String numero, String origen, String destino,
                 int ocupacion, int capacidadMaxima) {
        this.numero          = numero;
        this.origen          = origen;
        this.destino         = destino;
        this.ocupacion       = ocupacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getNumero()             { return numero; }
    public void   setNumero(String n)     { this.numero = n; }
    public String getOrigen()             { return origen; }
    public void   setOrigen(String o)     { this.origen = o; }
    public String getDestino()            { return destino; }
    public void   setDestino(String d)    { this.destino = d; }
    public int    getOcupacion()          { return ocupacion; }
    public void   setOcupacion(int o)     { this.ocupacion = o; }
    public int    getCapacidadMaxima()    { return capacidadMaxima; }
    public void   setCapacidadMaxima(int c) { this.capacidadMaxima = c; }

    public void mostrarInfo() {
        System.out.println("Vuelo     : " + numero);
        System.out.println("Ruta      : " + origen + " → " + destino);
        System.out.println("Ocupación : " + ocupacion + "/" + capacidadMaxima);
    
    }

    public void embarcar() {
        if (ocupacion < capacidadMaxima) {
            ocupacion++;
            System.out.println("Pasajero embarcado. Ocupación: " + ocupacion);
        } else {
            System.out.println("Vuelo lleno. No se puede embarcar.");
        }
    }

    public void desembarcar() {
        if (ocupacion > 0) {
            ocupacion--;
            System.out.println("Pasajero desembarcado. Ocupación: " + ocupacion);
        } else {
            System.out.println("No hay pasajeros para desembarcar.");
        }
    }
}
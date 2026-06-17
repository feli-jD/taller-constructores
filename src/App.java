public class App {
    public static void main(String[] args) {



        Libro libro1 = new Libro();
        libro1.setTitulo("Sin título");
        libro1.setAutor("Desconocido");
        libro1.mostrarInfo();

        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        libro2.mostrarInfo();

        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", false);
        libro3.mostrarInfo();

        libro2.prestar();
        libro2.prestar();   // ya prestado
        libro2.devolver();



        Vuelo vuelo1 = new Vuelo();
        vuelo1.setNumero("XX000");
        vuelo1.setOrigen("---");
        vuelo1.setDestino("---");
        vuelo1.setCapacidadMaxima(0);
        vuelo1.mostrarInfo();

        Vuelo vuelo2 = new Vuelo("AV204", "Bogotá", "Medellín");
        vuelo2.setCapacidadMaxima(120);
        vuelo2.mostrarInfo();

        Vuelo vuelo3 = new Vuelo("LA510", "Bogotá", "Lima", 3, 5);
        vuelo3.mostrarInfo();
        vuelo3.embarcar();
        vuelo3.embarcar();
        vuelo3.embarcar();   // lleno
        vuelo3.desembarcar();
        vuelo3.embarcar();

     

        DepositoAgua principal = new DepositoAgua(100);
        DepositoAgua desborde  = new DepositoAgua(50, 10);
        principal.setDepositoDesborde(desborde);

        principal.mostrarInfo();
        desborde.mostrarInfo();

        System.out.println(" Agregando 90 L ");
        principal.agregar(90);
        principal.mostrarInfo();

        System.out.println(" Agregando 20 L más (desborde) ");
        principal.agregar(20);
        principal.mostrarInfo();
        desborde.mostrarInfo();
    }
}
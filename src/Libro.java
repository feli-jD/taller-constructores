public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    
    public Libro() {
        this.disponible = true;
    }

    
    public Libro(String titulo, String autor) {
        this.titulo    = titulo;
        this.autor     = autor;
        this.disponible = true;
    }

    
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo     = titulo;
        this.autor      = autor;
        this.disponible = disponible;
    }

    public String getTitulo()               { return titulo; }
    public void   setTitulo(String t)       { this.titulo = t; }
    public String getAutor()                { return autor; }
    public void   setAutor(String a)        { this.autor = a; }
    public boolean isDisponible()           { return disponible; }
    public void    setDisponible(boolean d) { this.disponible = d; }

    public void mostrarInfo() {
        System.out.println("Título    : " + titulo);
        System.out.println("Autor     : " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Libro \"" + titulo + "\" prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro \"" + titulo + "\" devuelto.");
    }
}
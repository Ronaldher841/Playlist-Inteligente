package src;
public class Cancion {
    String nombre;
    String artista;
    int duracion; // Duración en segundos

    public Cancion(String nombre, String artista, int duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre + " - " + artista + " (" + duracion + "s)";
    }
}
package src;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// Se agrego una lista donde se almacenaran las canciones
public class Playlist {
    LinkedList<Cancion> canciones = new LinkedList<>();

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void eliminarCancion(String nombre) {
        canciones.removeIf(cancion -> cancion.nombre.equals(nombre));
    }

    public Cancion reproducirSiguiente() {
        if (canciones.isEmpty()) {
            return null;
        }
        Cancion cancion = canciones.removeFirst();
        canciones.addLast(cancion); // Mueve la canción al final
        return cancion;
    }

    public void ordenarPorDuracion() {
        canciones.sort(Comparator.comparingInt(cancion -> cancion.duracion));
    }

    public void ordenarPorArtista() {
        canciones.sort(Comparator.comparing(cancion -> cancion.artista));
    }

        public void reproducirAleatorio() {
        Collections.shuffle(canciones);
    }

    public void mostrarPlaylist() {
        for (Cancion cancion : canciones) {
            System.out.println(cancion);
        }
    }
}
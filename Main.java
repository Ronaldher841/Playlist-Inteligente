//Universidad Da Vinci De Guatemala
//Estructura de Datos
//Ingenierio: Brandon Chitay
//Ronald Isaias Godinez Hernández
//Carné: 202402155

import java.util.Scanner;
import src.Playlist;
import src.Cancion;


public class Main {
    //Se crea la nueva PlayList
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        int opcion;
            //Menu Interactivo
        do {
            System.out.println("\n--- Reproductor de Música ---");
            System.out.println("1. Agregar canción");
            System.out.println("2. Eliminar canción");
            System.out.println("3. Reproducir siguiente");
            System.out.println("4. Ordenar por duración");
            System.out.println("5. Ordenar por artista");
            System.out.println("6. Reproducir aleatorio");
            System.out.println("7. Mostrar playlist");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la canción: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Duración (segundos): ");
                    int duracion = scanner.nextInt();
                    playlist.agregarCancion(new Cancion(nombre, artista, duracion));
                    break;
                case 2:
                    System.out.print("Nombre de la canción a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    playlist.eliminarCancion(nombreEliminar);
                    break;
                case 3:
                    Cancion siguiente = playlist.reproducirSiguiente();
                    if (siguiente != null) 
                        // Hacer algo con la canción que se está reproduciendo
                    
                    break;
                case 4:
                    playlist.ordenarPorDuracion();
                    System.out.println("Playlist ordenada por duración.");
                    break;
                case 5:
                    playlist.ordenarPorArtista();
                    System.out.println("Playlist ordenada por artista.");
                    break;
                case 6:
                    playlist.reproducirAleatorio();
                    System.out.println("Playlist en modo aleatorio.");
                    break;
                case 7:
                    playlist.mostrarPlaylist();
                    break;
                case 0:
                    System.out.println("Saliendo del reproductor.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}
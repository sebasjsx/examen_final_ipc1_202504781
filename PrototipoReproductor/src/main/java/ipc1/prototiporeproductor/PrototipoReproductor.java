/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ipc1.prototiporeproductor;

/**
 *
 * @author abads
 */
public class PrototipoReproductor {

    public static void main(String[] args) {
        Cancion c1 = new Cancion("FEAR", "Kendrick Lamar", 200);
        Cancion c2 = new Cancion("PRIDE", "Kendrick Lamar", 200);
        Cancion c3 = new Cancion("Swimming Pool", "Kendrick Lamar", 200);

        Playlist listaPlayList = new Playlist();
        listaPlayList.agregarCancion(c1);
        listaPlayList.agregarCancion(c2);
        listaPlayList.agregarCancion(c3);
        System.out.println("Lista de canciones: ");
        listaPlayList.mostrarPlaylist();

        System.out.println("---------------------------------------------------");
        System.out.println("NAVEGACION:");
        listaPlayList.siguiente();
        listaPlayList.siguiente();
        listaPlayList.anterior();
        listaPlayList.eliminarActual();
        System.out.println("Lista dspues de eliminar la segunda:");
        listaPlayList.mostrarPlaylist();
    }
}

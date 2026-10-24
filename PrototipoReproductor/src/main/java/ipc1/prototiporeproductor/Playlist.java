/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipc1.prototiporeproductor;

/**
 *
 * @author abads
 */
public class Playlist {

    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;

    public void agregarCancion(Cancion cancion) {
        NodoDoble nuevo = new NodoDoble(cancion);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            actual = nuevo;
        } else {
            cola.setSiguiente(nuevo);
            nuevo.setAnterior(cola);
            cola = nuevo;
        }

        tamanio++;
    }

    public void mostrarPlaylist() {
        NodoDoble nodo = cabeza;
        int cont = 1;

        while (nodo != null) {
            System.out.println(cont + ". " + nodo.getCancion().getTitulo() + " - " + nodo.getCancion().getArtista());
            nodo = nodo.getSiguiente();
            cont++;
        }
    }

}

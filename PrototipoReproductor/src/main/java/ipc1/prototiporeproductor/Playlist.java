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

    public Cancion siguiente() {
        if (actual == null || actual.getSiguiente() == null) {
            return null;
        }
        actual = actual.getSiguiente();
        actual.getCancion().reproducir();
        return actual.getCancion();
    }

    public Cancion anterior() {
        if (actual == null || actual.getAnterior() == null) {
            return null;
        }
        actual = actual.getAnterior();
        actual.getCancion().reproducir();
        return actual.getCancion();
    }

    public void eliminarActual() {
        if (actual == null) {
            return;
        }

        NodoDoble eliminado = actual;
        NodoDoble anterior = eliminado.getAnterior();
        NodoDoble siguiente = eliminado.getSiguiente();

        if (anterior == null && siguiente == null) {
            cabeza = null;
            cola = null;
            actual = null;
        } else if (anterior == null) {
            cabeza = siguiente;
            cabeza.setAnterior(null);
            actual = cabeza;
        } else if (siguiente == null) {
            cola = anterior;
            cola.setSiguiente(null);
            actual = cola;
        } else {
            anterior.setSiguiente(siguiente);
            siguiente.setAnterior(anterior);
            actual = siguiente;
        }

        eliminado.setAnterior(null);
        eliminado.setSiguiente(null);
        tamanio--;
    }
}

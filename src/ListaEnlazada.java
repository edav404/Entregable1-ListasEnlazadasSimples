/*
 * Clase ListaEnlazada que contiene los métodos para agregar un nodo al final de la lista,
 * buscar un elemento en la lista y obtener la lista en formato de texto.
 */

public class ListaEnlazada {
    Nodo cabeza; //Refiere al primer nodo de la lista

    //Constructor que inicia la lista vacía
    public ListaEnlazada() {
        this.cabeza = null;
    }

    //Método para agregar un nodo al final de la lista
    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato); //Creamos un nuevo nodo con el valor de dato

        //Si la lista está vacía, el nuevo nodo será la cabeza
        if (cabeza == null){
            cabeza = nuevo;
        } else {

            //Si no, recorremos la lista hasta llegar al último nodo
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            //Agregamos el nuevo nodo al final de la lista
            actual.siguiente = nuevo;
        }
    }

    //Método para buscar un elemento en la lista
    public boolean buscar(int dato) {
        Nodo actual = cabeza; //Empezamos desde la cabeza
        while (actual != null) { //Recorremos la lista
            if (actual.dato == dato) { //Si encontramos el dato, regresamos true
                return true;
            }
            actual = actual.siguiente; //Pasamos al siguiente nodo
        }
        return false; //Si no encontramos el dato, regresamos false
    }

    //Método para obtener la lista en formato de texto
    public String obtenerLista() {
        StringBuilder resultado = new StringBuilder(); 
        Nodo actual = cabeza;

        //Recorremos la lista y agregamos cada nodo al resultado
        while (actual != null) {
            resultado.append(actual.dato).append(" -> ");
            actual = actual.siguiente;
        }

        resultado.append("null"); //Agregamos null al final de la lista
        return resultado.toString(); //Regresamos el resultado como un String
    }
}

import javax.swing.*; //Importamos la biblioteca de Java Swing ya que quiero que tenga una interfáz gráfica

//Clase principal que ejecuta el programa
public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada(); //Creamos una lista enlazada

        //Agregar números a la lista
        lista.agregar(5);
        lista.agregar(10);
        lista.agregar(12);
        lista.agregar(20);
        lista.agregar(15);
        lista.agregar(18);
        lista.agregar(8);
        lista.agregar(3);
        lista.agregar(12);

        //Pedir número a buscar mediante un cuadro de diálogo
        String inputNumero = JOptionPane.showInputDialog("Ingresa un número a buscar:");

        //Si el usuario cancela o cierra el cuadro de diálogo, terminar el programa
        if (inputNumero == null) {
            System.exit(0); // Cierra el programa inmediatamente
        }

        try {
            int numeroBuscar = Integer.parseInt(inputNumero); //Convertir el texto a un número entero
            boolean encontrado = lista.buscar(numeroBuscar); //Buscar el número en la lista
            String listaTexto = lista.obtenerLista(); //Obtener la lista en formato de texto
            String mensaje;

            if (encontrado == true) { 
                mensaje = "El número " + numeroBuscar + " está en la lista.";
            } else {
                mensaje = "El número " + numeroBuscar + " NO está en la lista.";
            }

            // Mostrar la lista y el resultado de la búsqueda
            JOptionPane.showMessageDialog(null, "Lista actual:\n" + listaTexto + "\n\n" + mensaje);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
        }
    }
}

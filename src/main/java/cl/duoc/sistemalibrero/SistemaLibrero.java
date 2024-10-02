/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cl.duoc.sistemalibrero;

/**
 *
 * @author camil
 */
public class SistemaLibrero {

    public static void main(String[] args) {
          // Crear algunos libros
        Libro libro1 = new Libro("1984", "George Orwell", "978-0451524935");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "978-0156012195");

        // Crear un librero
        Librero miLibrero = new Librero();

        // Agregar libros al librero
        miLibrero.agregarLibro(libro1);
        miLibrero.agregarLibro(libro2);
        miLibrero.agregarLibro(libro3);

        // Mostrar los libros en el librero
        System.out.println("Libros en el librero:");
        miLibrero.mostrarLibros();
    }
}

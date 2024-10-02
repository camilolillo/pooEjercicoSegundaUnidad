/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.sistemalibrero;

import java.util.ArrayList;

/**
 *
 * @author camil
 */
class Librero {
    private ArrayList<Libro> libros;

    public Librero() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro al librero
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para mostrar todos los libros en el librero
    public void mostrarLibros() {
        if (libros.isEmpty()) {
            System.out.println("El librero está vacío.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}


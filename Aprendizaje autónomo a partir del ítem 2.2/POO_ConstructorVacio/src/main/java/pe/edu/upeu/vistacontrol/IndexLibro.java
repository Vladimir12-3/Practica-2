package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Libro;
import pe.edu.upeu.utils.Lectura;

public class IndexLibro {
    public static void inicio() {
        Lectura leer = new Lectura();
        Libro libro = new Libro(); // CONSTRUCTOR VACÍO

        System.out.println("=== LIBRO (CONSTRUCTOR VACÍO) ===");

        System.out.print("Título: ");
        libro.setTitulo(leer.cadena());

        System.out.print("Autor: ");
        libro.setAutor(leer.cadena());

        System.out.print("ISBN: ");
        libro.setIsbn(leer.cadena());

        System.out.print("Año publicación: ");
        libro.setAñoPublicacion(leer.entero());

        System.out.print("Precio: ");
        libro.setPrecio(leer.decimal());

        System.out.print("Páginas: ");
        libro.setPaginas(leer.entero());

        System.out.print("Editorial: ");
        libro.setEditorial(leer.cadena());


        System.out.println("\n=== DATOS DEL LIBRO ===");
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("ISBN: " + libro.getIsbn());
        System.out.println("Año: " + libro.getAñoPublicacion());
        System.out.println("Precio: S/ " + libro.getPrecio());
        System.out.println("Páginas: " + libro.getPaginas());
        System.out.println("Editorial: " + libro.getEditorial());

        leer.cerrar();
    }

    public static void main(String[] args) {
        inicio();
    }
}
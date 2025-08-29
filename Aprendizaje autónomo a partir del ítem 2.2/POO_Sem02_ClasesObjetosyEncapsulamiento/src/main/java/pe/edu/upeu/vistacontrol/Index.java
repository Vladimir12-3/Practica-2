package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Persona;
import pe.edu.upeu.utils.Lectura;

public class Index {
    public static void inicio() {
        Lectura leer = new Lectura();
        Persona persona = new Persona();

        System.out.print("> Nombre: ");
        persona.setNombre(leer.cadena());

        System.out.print("> Edad: ");
        persona.setEdad(leer.entero());

        System.out.print("> Talla: ");
        persona.setTalla(leer.decimal());

        System.out.println("\nDATOS INGRESADOS");
        System.out.println("* Nombre: " + persona.getNombre());
        System.out.println("* Edad: " + persona.getEdad());
        System.out.println("* Talla: " + persona.getTalla());

        leer.cerrar();
    }

    public static void main(String[] args) {
        inicio();
    }
}
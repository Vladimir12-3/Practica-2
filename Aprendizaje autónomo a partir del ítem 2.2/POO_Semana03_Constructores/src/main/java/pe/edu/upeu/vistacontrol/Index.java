package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Persona;

public class Index {
    public static void inicio(){

        Persona persona = new Persona("Pablito", 16, 1.73);


        System.out.println("DATOS INGRESADOS");
        System.out.println("* Nombre: " + persona.getNombre());
        System.out.println("* Edad: " + persona.getEdad());
        System.out.println("* Talla: " + persona.getTalla());


        System.out.println("\n=== SOBRECARGA DE CONSTRUCTORES ===");


        Persona persona2 = new Persona("Juan");
        System.out.println("Persona 2 - Solo nombre: " + persona2.getNombre());


        Persona persona3 = new Persona("Maria", 25);
        System.out.println("Persona 3 - Nombre: " + persona3.getNombre() + ", Edad: " + persona3.getEdad());


        Persona persona4 = new Persona();
        persona4.setNombre("Carlos");
        persona4.setEdad(30);
        persona4.setTalla(1.80);
        System.out.println("Persona 4 - Por defecto: " + persona4.getNombre() + ", " + persona4.getEdad() + " años");
    }

    public static void main(String[] args) {
        inicio();
    }
}
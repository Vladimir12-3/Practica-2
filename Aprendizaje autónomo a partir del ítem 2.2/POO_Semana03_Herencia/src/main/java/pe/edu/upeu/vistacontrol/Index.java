package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Trabajador;

public class Index {
    public static void inicio(){

        Trabajador trabajador = new Trabajador(4500, "EsSalud", "Ventas", "Vendedor",
                1, "Juan", "Perez", "12345678", "10/10/2001");


        System.out.println("Datos del Trabajador");
        System.out.println("* ID: " + trabajador.getIdpersona());
        System.out.println("* Nombre: " + trabajador.getNombre());
        System.out.println("* Apellidos: " + trabajador.getApellido());
        System.out.println("* DNI: " + trabajador.getDni());
        System.out.println("* Fecha de Nacimiento: " + trabajador.getFechaNacimiento());
        System.out.println("* Salario: " + trabajador.getSalario());
        System.out.println("* Seguro: " + trabajador.getSeguro());
        System.out.println("* Area de trabajo: " + trabajador.getAreaTrabajo());
        System.out.println("* Cargo: " + trabajador.getCargo());
        System.out.println("---");
    }

    public static void main(String[] args) {
        inicio();
    }
}
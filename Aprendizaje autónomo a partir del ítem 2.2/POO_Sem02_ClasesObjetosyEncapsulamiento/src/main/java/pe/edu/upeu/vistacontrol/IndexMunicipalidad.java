package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Municipalidad;
import pe.edu.upeu.utils.Lectura;

public class IndexMunicipalidad {
    public static void inicio() {
        Lectura leer = new Lectura();
        Municipalidad muni = new Municipalidad();

        System.out.println("=== DATOS DE LA MUNICIPALIDAD ===");

        System.out.print("Nombre: ");
        muni.setNombre(leer.cadena());

        System.out.print("Distrito: ");
        muni.setDistrito(leer.cadena());

        System.out.print("Provincia: ");
        muni.setProvincia(leer.cadena());

        System.out.print("Departamento: ");
        muni.setDepartamento(leer.cadena());

        System.out.print("Alcalde: ");
        muni.setAlcalde(leer.cadena());

        System.out.print("Año de fundación: ");
        muni.setAñoFundacion(leer.entero());

        System.out.print("Presupuesto anual: ");
        muni.setPresupuesto(leer.decimal());

        System.out.print("Número de trabajadores: ");
        muni.setNumeroTrabajadores(leer.entero());

        System.out.print("¿Tiene parque? (si/no): ");
        muni.setTieneParque(leer.cadena().equalsIgnoreCase("si"));


        System.out.println("\n=== INFORMACIÓN REGISTRADA ===");
        System.out.println("Nombre: " + muni.getNombre());
        System.out.println("Distrito: " + muni.getDistrito());
        System.out.println("Provincia: " + muni.getProvincia());
        System.out.println("Departamento: " + muni.getDepartamento());
        System.out.println("Alcalde: " + muni.getAlcalde());
        System.out.println("Año fundación: " + muni.getAñoFundacion());
        System.out.println("Presupuesto: S/ " + muni.getPresupuesto());
        System.out.println("Trabajadores: " + muni.getNumeroTrabajadores());
        System.out.println("Tiene parque: " + (muni.isTieneParque() ? "Sí" : "No"));

        leer.cerrar();
    }

    public static void main(String[] args) {
        inicio();
    }
}
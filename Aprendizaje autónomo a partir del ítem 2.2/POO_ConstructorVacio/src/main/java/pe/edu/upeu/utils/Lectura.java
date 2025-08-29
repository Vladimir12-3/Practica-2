package pe.edu.upeu.utils;

import java.util.Scanner;

public class Lectura {
    private static final Scanner teclado = new Scanner(System.in);

    public String cadena() {
        return teclado.nextLine();
    }

    public int entero() {
        while (true) {
            try {
                return Integer.parseInt(cadena());
            } catch (NumberFormatException e) {
                System.out.print("Error: Debe ingresar un número entero. Intente nuevamente: ");
            }
        }
    }

    public double decimal() {
        while (true) {
            try {
                return Double.parseDouble(cadena());
            } catch (NumberFormatException e) {
                System.out.print("Error: Debe ingresar un número decimal. Intente nuevamente: ");
            }
        }
    }

    public void cerrar() {
        teclado.close();
    }
}
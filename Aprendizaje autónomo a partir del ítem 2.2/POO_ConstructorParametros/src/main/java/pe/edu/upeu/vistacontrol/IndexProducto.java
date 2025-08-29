package pe.edu.upeu.vistacontrol;

import pe.edu.upeu.modelo.Producto;

public class IndexProducto {
    public static void inicio() {

        Producto producto = new Producto(
                "Laptop HP Pavilion",
                "PROD-2024-001",
                "Tecnología",
                2899.99,
                25,
                "HP",
                "TecnoImport SAC"
        );

        System.out.println("=== PRODUCTO (CONSTRUCTOR CON PARÁMETROS) ===");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Código: " + producto.getCodigo());
        System.out.println("Categoría: " + producto.getCategoria());
        System.out.println("Precio: S/ " + producto.getPrecio());
        System.out.println("Stock: " + producto.getStock());
        System.out.println("Marca: " + producto.getMarca());
        System.out.println("Proveedor: " + producto.getProveedor());
    }

    public static void main(String[] args) {
        inicio();
    }
}
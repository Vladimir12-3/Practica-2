package pe.edu.upeu.modelo;

public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;
    private double precio;
    private int stock;
    private String marca;
    private String proveedor;


    public Producto(String nombre, String codigo, String categoria,
                    double precio, int stock, String marca, String proveedor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
        this.marca = marca;
        this.proveedor = proveedor;
    }


    public String getNombre() { return nombre; }
    public String getCodigo() { return codigo; }
    public String getCategoria() { return categoria; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public String getMarca() { return marca; }
    public String getProveedor() { return proveedor; }
}
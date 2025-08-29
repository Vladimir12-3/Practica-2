package pe.edu.upeu.modelo;

public class Municipalidad {
    private String nombre;
    private String distrito;
    private String provincia;
    private String departamento;
    private String alcalde;
    private int añoFundacion;
    private double presupuesto;
    private int numeroTrabajadores;
    private boolean tieneParque;


    public Municipalidad() {
    }


    public Municipalidad(String nombre, String distrito, String provincia,
                         String departamento, String alcalde, int añoFundacion,
                         double presupuesto, int numeroTrabajadores, boolean tieneParque) {
        this.nombre = nombre;
        this.distrito = distrito;
        this.provincia = provincia;
        this.departamento = departamento;
        this.alcalde = alcalde;
        this.añoFundacion = añoFundacion;
        this.presupuesto = presupuesto;
        this.numeroTrabajadores = numeroTrabajadores;
        this.tieneParque = tieneParque;
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDistrito() { return distrito; }
    public void setDistrito(String distrito) { this.distrito = distrito; }

    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getAlcalde() { return alcalde; }
    public void setAlcalde(String alcalde) { this.alcalde = alcalde; }

    public int getAñoFundacion() { return añoFundacion; }
    public void setAñoFundacion(int añoFundacion) { this.añoFundacion = añoFundacion; }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) { this.presupuesto = presupuesto; }

    public int getNumeroTrabajadores() { return numeroTrabajadores; }
    public void setNumeroTrabajadores(int numeroTrabajadores) { this.numeroTrabajadores = numeroTrabajadores; }

    public boolean isTieneParque() { return tieneParque; }
    public void setTieneParque(boolean tieneParque) { this.tieneParque = tieneParque; }
}
package pe.edu.upeu.modelo;

public class Trabajador extends Persona {
    private double salario;
    private String areaTrabajo;
    private String cargo;

    public Trabajador() {
    }

    public Trabajador(int idpersona, String nombre, String dni) {
        super(idpersona, nombre, dni);
    }

    public Trabajador(double salario, String areaTrabajo, String cargo,
                      int idpersona, String nombre, String dni) {
        super(idpersona, nombre, dni);
        this.salario = salario;
        this.areaTrabajo = areaTrabajo;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
}
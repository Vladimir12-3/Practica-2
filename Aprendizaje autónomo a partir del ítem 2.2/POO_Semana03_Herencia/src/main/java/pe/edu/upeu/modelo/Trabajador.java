package pe.edu.upeu.modelo;


public class Trabajador extends Persona {
    private double salario;
    private String seguro;
    private String areaTrabajo;
    private String cargo;


    public Trabajador() {
    }

    public Trabajador(int idpersona, String nombre, String apellido, String dni, String fechaNacimiento) {

        super(idpersona, nombre, apellido, dni, fechaNacimiento);
    }


    public Trabajador(double salario, String seguro, String areaTrabajo, String cargo,
                      int idpersona, String nombre, String apellido, String dni, String fechaNacimiento) {
        super(idpersona, nombre, apellido, dni, fechaNacimiento);
        this.salario = salario;
        this.seguro = seguro;
        this.areaTrabajo = areaTrabajo;
        this.cargo = cargo;
    }


    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) { this.salario = salario;
    }

    public String getSeguro() {
        return seguro;
    }
    public void setSeguro(String seguro) { this.seguro = seguro;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }
    public void setAreaTrabajo(String areaTrabajo) { this.areaTrabajo = areaTrabajo;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) { this.cargo = cargo; }
}
package pe.edu.upeu.modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private String apellido;
    private String dni;
    private String fechaNacimiento;


    public Persona() {
    }
    public Persona(int idpersona, String nombre, String apellido, String dni, String fechaNacimiento) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }


    public int getIdpersona() {
        return idpersona;
    }
    public void setIdpersona(int idpersona) { this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) { this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) { this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) { this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento;
    }
}
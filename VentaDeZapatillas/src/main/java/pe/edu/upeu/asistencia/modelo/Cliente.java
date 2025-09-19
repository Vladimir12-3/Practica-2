package pe.edu.upeu.asistencia.modelo;

import javafx.beans.property.*;
import pe.edu.upeu.asistencia.enums.TipoZapatilla;

public class Cliente {

    private final StringProperty dni = new SimpleStringProperty();
    private final StringProperty nombres = new SimpleStringProperty();
    private final StringProperty apellidos = new SimpleStringProperty();
    private final StringProperty telefono = new SimpleStringProperty();
    private final StringProperty email = new SimpleStringProperty();
    private final ObjectProperty<TipoZapatilla> tipoZapatilla = new SimpleObjectProperty<>();

    public Cliente() {}

    public Cliente(String dni, String nombres, String apellidos,
                   String telefono, String email, TipoZapatilla tipoZapatilla) {
        this.dni.set(dni);
        this.nombres.set(nombres);
        this.apellidos.set(apellidos);
        this.telefono.set(telefono);
        this.email.set(email);
        this.tipoZapatilla.set(tipoZapatilla);
    }


    public String getDni() { return dni.get(); }
    public void setDni(String value) { dni.set(value); }
    public StringProperty dniProperty() { return dni; }

    public String getNombres() { return nombres.get(); }
    public void setNombres(String value) { nombres.set(value); }
    public StringProperty nombresProperty() { return nombres; }

    public String getApellidos() { return apellidos.get(); }
    public void setApellidos(String value) { apellidos.set(value); }
    public StringProperty apellidosProperty() { return apellidos; }

    public String getTelefono() { return telefono.get(); }
    public void setTelefono(String value) { telefono.set(value); }
    public StringProperty telefonoProperty() { return telefono; }

    public String getEmail() { return email.get(); }
    public void setEmail(String value) { email.set(value); }
    public StringProperty emailProperty() { return email; }

    public TipoZapatilla getTipoZapatilla() { return tipoZapatilla.get(); }
    public void setTipoZapatilla(TipoZapatilla value) { tipoZapatilla.set(value); }
    public ObjectProperty<TipoZapatilla> tipoZapatillaProperty() { return tipoZapatilla; }
}

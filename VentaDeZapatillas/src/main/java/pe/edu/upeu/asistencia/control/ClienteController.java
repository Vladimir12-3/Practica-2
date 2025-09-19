package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.TipoZapatilla;
import pe.edu.upeu.asistencia.modelo.Cliente;
import pe.edu.upeu.asistencia.servicio.ClienteServicioI;

@Controller
public class ClienteController {

    @FXML private TextField txtDNI;
    @FXML private TextField txtNombres;
    @FXML private TextField txtApellidos;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtEmail;
    @FXML private ComboBox<TipoZapatilla> cbxTipoZapatilla;

    @FXML private TableView<Cliente> tableView;
    @FXML private TableColumn<Cliente, String> dniCol;
    @FXML private TableColumn<Cliente, String> nombresCol;
    @FXML private TableColumn<Cliente, String> apellidosCol;
    @FXML private TableColumn<Cliente, String> telefonoCol;
    @FXML private TableColumn<Cliente, String> emailCol;
    @FXML private TableColumn<Cliente, TipoZapatilla> tipoCol;

    @Autowired
    private ClienteServicioI clienteServicio;

    @FXML
    public void initialize() {
        cbxTipoZapatilla.getItems().setAll(TipoZapatilla.values());

        dniCol.setCellValueFactory(c -> c.getValue().dniProperty());
        nombresCol.setCellValueFactory(c -> c.getValue().nombresProperty());
        apellidosCol.setCellValueFactory(c -> c.getValue().apellidosProperty());
        telefonoCol.setCellValueFactory(c -> c.getValue().telefonoProperty());
        emailCol.setCellValueFactory(c -> c.getValue().emailProperty());
        tipoCol.setCellValueFactory(c -> c.getValue().tipoZapatillaProperty());

        listarClientes();
    }

    @FXML
    public void crearCliente() {
        if (cbxTipoZapatilla.getValue() == null) {
            mostrarAlerta("Error", "Debe seleccionar un tipo de zapatilla.");
            return;
        }

        Cliente cliente = new Cliente(
                txtDNI.getText(),
                txtNombres.getText(),
                txtApellidos.getText(),
                txtTelefono.getText(),
                txtEmail.getText(),
                cbxTipoZapatilla.getValue()
        );

        clienteServicio.save(cliente);
        listarClientes();
        limpiarFormulario();
    }

    private void listarClientes() {
        tableView.getItems().setAll(clienteServicio.findAll());
    }

    private void limpiarFormulario() {
        txtDNI.clear();
        txtNombres.clear();
        txtApellidos.clear();
        txtTelefono.clear();
        txtEmail.clear();
        cbxTipoZapatilla.setValue(null);
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}

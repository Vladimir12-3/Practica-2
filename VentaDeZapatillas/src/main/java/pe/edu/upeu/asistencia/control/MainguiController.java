package pe.edu.upeu.asistencia.control;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.layout.BorderPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;

@Controller
public class MainguiController {

    @FXML
    private BorderPane bp;

    @Autowired
    private ApplicationContext context;


    @FXML
    private void abrirClientes(ActionEvent event) {
        cargarVista("/fxml/main_Cliente.fxml", "Gestión de Clientes");
    }


    @FXML
    private void cerrarAplicacion(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }


    private void cargarVista(String rutaFXML, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(rutaFXML));
            loader.setControllerFactory(context::getBean);
            Parent root = loader.load();
            bp.setCenter(root);
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error al cargar " + titulo, e.getMessage());
        }
    }


    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}

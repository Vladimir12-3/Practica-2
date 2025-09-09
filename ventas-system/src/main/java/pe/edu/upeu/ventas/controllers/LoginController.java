package pe.edu.upeu.ventas.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;
import pe.edu.upeu.ventas.models.Usuario;
import pe.edu.upeu.ventas.services.UsuarioService;

@Controller
public class LoginController {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button registerButton;

    @FXML
    private Label messageLabel;

    private final UsuarioService usuarioService;
    private final Stage primaryStage;

    public LoginController(UsuarioService usuarioService, Stage primaryStage) {
        this.usuarioService = usuarioService;
        this.primaryStage = primaryStage;
    }

    @FXML
    public void initialize() {
        loginButton.setOnAction(e -> login());
        registerButton.setOnAction(e -> goToRegister());
    }

    private void login() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Por favor, complete todos los campos");
            return;
        }

        try {
            Usuario usuario = usuarioService.autenticar(username, password);
            if (usuario != null) {
                messageLabel.setText("Login exitoso!");
                // Aquí iría la navegación a la pantalla principal
            } else {
                messageLabel.setText("Credenciales incorrectas");
            }
        } catch (Exception e) {
            messageLabel.setText("Error: " + e.getMessage());
        }
    }

    private void goToRegister() {
        messageLabel.setText("Funcionalidad de registro en desarrollo...");
    }
}
package pe.edu.upeu.asistencia.control;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
<<<<<<< HEAD
=======
import org.springframework.stereotype.Component;
>>>>>>> 571ebc7796919db55b6871d400835867e7addbbe
import org.springframework.stereotype.Controller;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;

@Controller
public class ParticipanteController {

    @FXML
    private ComboBox<Carrera> cbxCarrera;

    @FXML
    private ComboBox<TipoParticipante> cbxTipoParticipante;

    @FXML
<<<<<<< HEAD
    public void initialize() {
=======
    public void initialize(){
>>>>>>> 571ebc7796919db55b6871d400835867e7addbbe
        cbxCarrera.getItems().setAll(Carrera.values());
        cbxTipoParticipante.getItems().setAll(TipoParticipante.values());
    }

<<<<<<< HEAD
=======

>>>>>>> 571ebc7796919db55b6871d400835867e7addbbe
}

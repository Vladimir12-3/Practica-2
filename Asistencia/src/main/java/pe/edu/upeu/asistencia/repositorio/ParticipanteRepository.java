package pe.edu.upeu.asistencia.repositorio;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import pe.edu.upeu.asistencia.enums.Carrera;
import pe.edu.upeu.asistencia.enums.TipoParticipante;
import pe.edu.upeu.asistencia.modelo.Participante;

import java.util.ArrayList;
import java.util.List;

public class ParticipanteRepository {
    public List<Participante> participantes =new ArrayList<>();

    public List<Participante> findAll(){
        participantes.add(new Participante(
                        new SimpleStringProperty("75518473"),
                        new SimpleStringProperty("Vladimir"),
                        new SimpleStringProperty("Apaza"),
                        Carrera.SISTEMAS,
                        TipoParticipante.ASISTENCIA,
                        new SimpleBooleanProperty(true)
                )
        );
        return participantes;
    }
}
package pe.edu.upeu.asistencia.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum TipoParticipante {
    ASISTENCIA("Asistencia"),
    ORGANIZADOR("Organizador"),
    PONENTE("Ponente"),;

    private String descripcion;
}

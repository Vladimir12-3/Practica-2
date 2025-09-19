package pe.edu.upeu.asistencia.servicio;

import pe.edu.upeu.asistencia.modelo.Cliente;
import java.util.List;

public interface ClienteServicioI {
    List<Cliente> findAll();
    void save(Cliente cliente);
    Cliente update(Cliente cliente, int index);
    void delete(int index);
}

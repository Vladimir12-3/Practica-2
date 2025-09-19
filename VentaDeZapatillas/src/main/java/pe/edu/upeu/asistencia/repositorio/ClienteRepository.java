package pe.edu.upeu.asistencia.repositorio;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.asistencia.enums.TipoZapatilla;
import pe.edu.upeu.asistencia.modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ClienteRepository {
    private final List<Cliente> clientes = new ArrayList<>();

    public ClienteRepository() {

        Cliente c = new Cliente();
        c.setDni("75518473");
        c.setNombres("VLADIMIR RONALD");
        c.setApellidos("APAZA HILAITA");
        c.setTelefono("999888777");
        c.setEmail("vrah7769@gmail.com");
        c.setTipoZapatilla(TipoZapatilla.RUNNING);

        clientes.add(c);
    }

    public List<Cliente> findAll() {
        return clientes;
    }

    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente update(Cliente cliente, int index) {
        return clientes.set(index, cliente);
    }

    public void delete(int index) {
        if (index >= 0 && index < clientes.size()) {
            clientes.remove(index);
        }
    }
}

package pe.edu.upeu.asistencia.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.asistencia.modelo.Cliente;
import pe.edu.upeu.asistencia.repositorio.ClienteRepository;

import java.util.List;

@Service
public class ClienteServicioImp implements ClienteServicioI {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente, int index) {
        return clienteRepository.update(cliente, index);
    }

    @Override
    public void delete(int index) {
        clienteRepository.delete(index);
    }
}

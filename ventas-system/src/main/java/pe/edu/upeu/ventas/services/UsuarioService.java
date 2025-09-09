package pe.edu.upeu.ventas.services;

import org.springframework.stereotype.Service;
import pe.edu.upeu.ventas.models.Usuario;
import pe.edu.upeu.ventas.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario autenticar(String username, String password) {
        return usuarioRepository.findByUsernameAndPassword(username, password);
    }

    public Usuario registrar(Usuario usuario) {
        if (usuarioRepository.findByUsername(usuario.getUsername()) != null) {
            throw new RuntimeException("El usuario ya existe");
        }
        return usuarioRepository.save(usuario);
    }
}
package mx.edu.utez.examenunidad.services.user;

import mx.edu.utez.examenunidad.models.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserService userService;
//
//    public User crearUsuario(User usuario) {
//        return userService.save(usuario);
//    }
//
//    public User obtenerUsuarioPorId(Long id) {
//        return userService.findById(id).orElse(null);
//    }
//
//    public void eliminarUsuarioPorId(Long id) {
//        userService.deleteById(id);
//    }
}

package service;

import dao.UsuarioDAOImpl;
import java.sql.SQLException;
import model.Usuario;

public class UsuarioService {
    
    public void insertarUsuario(Usuario usuario) throws SQLException {
        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
        usuarioDAO.insertarUsuario(usuario);
    }
    
}
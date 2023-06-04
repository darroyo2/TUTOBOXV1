package dao;

import java.sql.SQLException;
import java.util.List;
import model.Usuario;

public interface UsuarioDAO {
    void insertarUsuario(Usuario usuario) throws SQLException;
    void updateUsuario(Usuario usuario) throws SQLException;
    void deleteUsuario(Usuario usuario) throws SQLException;
    List<Usuario> listar() throws SQLException;
}

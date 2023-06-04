package dao;

import java.sql.SQLException;
import model.Usuario;

public interface UsuarioDAO {
    void insertarUsuario(Usuario usuario) throws SQLException;
    void updateUsuario(Usuario usuario) throws SQLException;
}

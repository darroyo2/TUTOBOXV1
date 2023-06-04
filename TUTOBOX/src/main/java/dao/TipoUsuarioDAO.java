package dao;

import java.sql.SQLException;
import java.util.List;
import model.TipoUsuario;

public interface TipoUsuarioDAO {
    List<TipoUsuario> obtenerTiposUsuario() throws SQLException;
}
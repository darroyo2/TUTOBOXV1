package dao;

import java.sql.SQLException;
import java.util.List;
import model.TipoUsuario;

public interface TipoUsuarioDAO {
    
    void insertar(TipoUsuario tipoUsuario) throws SQLException;
    void update(TipoUsuario tipoUsuario) throws SQLException;
    void delete(TipoUsuario tipoUsuario) throws SQLException;
    List<TipoUsuario> obtenerTiposUsuario() throws SQLException;
}
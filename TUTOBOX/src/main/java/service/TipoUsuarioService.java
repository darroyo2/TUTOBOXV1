package service;

import dao.TipoUsuarioDAOImpl;
import java.sql.SQLException;
import java.util.List;
import model.TipoUsuario;


public class TipoUsuarioService {
    
    public List<TipoUsuario> obtenerTiposUsuario() throws SQLException {
        TipoUsuarioDAOImpl tipoUsuarioDAO = new TipoUsuarioDAOImpl();
        return tipoUsuarioDAO.obtenerTiposUsuario();
    }
    
}

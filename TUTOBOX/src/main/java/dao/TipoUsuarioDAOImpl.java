package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.TipoUsuario;
import util.ConexionUtil;

public class TipoUsuarioDAOImpl implements TipoUsuarioDAO {
    
    private Connection conexion;
    
    public TipoUsuarioDAOImpl() {
        conexion = ConexionUtil.obtenerConexion();
    }
    
    @Override
    public List<TipoUsuario> obtenerTiposUsuario() throws SQLException {
        List<TipoUsuario> tiposUsuario = new ArrayList<>();
        String query = "SELECT id_tipo_usuario, descripcion FROM tipo_usuairo";
        try (PreparedStatement statement = conexion.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                TipoUsuario tipoUsuario = new TipoUsuario();
                tipoUsuario.setCodigo(resultSet.getString("id_tipo_usuario"));
                tipoUsuario.setDescripcion(resultSet.getString("descripcion"));
                tiposUsuario.add(tipoUsuario);
            }
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
            throw e;
        }
        return tiposUsuario;
    }

    @Override
    public void insertar(TipoUsuario tipoUsuario) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(TipoUsuario tipoUsuario) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(TipoUsuario tipoUsuario) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

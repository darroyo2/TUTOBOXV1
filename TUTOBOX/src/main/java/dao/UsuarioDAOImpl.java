package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import util.ConexionUtil;

public class UsuarioDAOImpl implements UsuarioDAO {
    private Connection conexion;

    public UsuarioDAOImpl() {
        conexion = ConexionUtil.obtenerConexion();
    }

    @Override
    public void insertarUsuario(Usuario usuario) throws SQLException {
        String query = "INSERT INTO `tutobox`.`usuario` (`nombre`, `apellidos`, `correo`, `contrasena`, `idTipo`) VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getApellidos());
            statement.setString(3, usuario.getCorreo());
            statement.setString(4, usuario.getContrasena());
            statement.setInt(5, usuario.getIdTipo());
            statement.executeUpdate();
        }
    }

    @Override
    public void updateUsuario(Usuario usuario) throws SQLException {
        String query = "UPDATE `tutobox`.`usuario` SET `nombre` = ?, `apellidos` = ?, `correo` = ?, `contrasena` = ?, `idTipo` = ? WHERE (`idUsuario` = ?);";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, usuario.getNombre());
            statement.setString(2, usuario.getApellidos());
            statement.setString(3, usuario.getCorreo());
            statement.setString(4, usuario.getContrasena());
            statement.setInt(5, usuario.getIdTipo());
            statement.setInt(6, usuario.getIdUsuario());
            statement.executeUpdate();
        }
    }

    @Override
    public void deleteUsuario(Usuario usuario) throws SQLException {
         String query = "DELETE FROM `tutobox`.`usuario` WHERE (`idUsuario` = ?);";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setInt(1, usuario.getIdUsuario());
            statement.executeUpdate();
        }   
    }

    @Override
    public List<Usuario> listar() throws SQLException {
        List<Usuario> listaUsuario = new ArrayList<>();
        String query = "SELECT * FROM tutobox.usuario;";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                int id=rs.getInt(1);
                String nombre=rs.getString(2);
                String apellidos=rs.getString(3);
                String correo=rs.getString(4);
                String password=rs.getString(5);
                int idTipo = rs.getInt(6);
                Usuario usu=new Usuario(id, nombre, apellidos, password, correo, idTipo);
                listaUsuario.add(usu);
            }
        } 
        return listaUsuario;
    }


}

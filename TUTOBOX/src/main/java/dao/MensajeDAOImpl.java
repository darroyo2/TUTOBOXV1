/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Mensaje;
import model.Usuario;
import util.ConexionUtil;

/**
 *
 * @author HP
 */
public class MensajeDAOImpl implements MensajeDAO {
    private Connection conexion;
    
    @Override
    public void insertar(Mensaje mensaje) throws SQLException {
        conexion = ConexionUtil.obtenerConexion();
        String query = "INSERT INTO `tutobox`.`mensaje` (`asunto`, `fechaEnvio`, `cuerpo`, `idUsuarioEmisor`, `idUsuarioReceptor`) VALUES (?, ?, ?, ?, ?);";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, mensaje.getAsunto());
            java.util.Date utilDate = mensaje.getFechaEnvio();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            statement.setDate(2, sqlDate);
            statement.setString(3, mensaje.getCuerpo());
            statement.setInt(4, mensaje.getUsuarioEmisor());
            statement.setInt(5, mensaje.getUsuarioReceptor());
            statement.executeUpdate();
        }
    }

    @Override
    public void update(Mensaje mensaje) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Mensaje mensaje) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Mensaje> listar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Mensaje> listarRecibidos(Usuario usuario) throws SQLException {
        conexion = ConexionUtil.obtenerConexion();
        List<Mensaje> listaMensaje = new ArrayList<>();
        String query = "SELECT * FROM tutobox.mensaje WHERE (`idUsuarioReceptor` = ?);";
       try (PreparedStatement statement = conexion.prepareStatement(query)) {
           statement.setInt(1, usuario.getIdUsuario());
           ResultSet rs = statement.executeQuery();
           while(rs.next()){
                int idMensaje=rs.getInt(1);
                String asunto=rs.getString(2);
                Date fecha= rs.getDate(3);
                String cuerpo=rs.getString(4);
                int emisor=rs.getInt(5);
                int receptor = rs.getInt(6);
                Mensaje mens=new Mensaje(idMensaje, asunto, fecha, cuerpo,emisor , receptor);
                listaMensaje.add(mens);
       }
        return listaMensaje;
             
    }
}
}

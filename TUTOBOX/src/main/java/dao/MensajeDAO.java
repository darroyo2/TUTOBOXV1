/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Mensaje;
import model.Usuario;

/**
 *
 * @author HP
 */
public interface MensajeDAO {
    void insertar(Mensaje mensaje) throws SQLException;
    void update(Mensaje mensaje) throws SQLException;
    void delete(Mensaje mensaje) throws SQLException;
    List<Mensaje> listar() throws SQLException;
    List<Mensaje> listarRecibidos(Usuario usuario) throws SQLException;
}

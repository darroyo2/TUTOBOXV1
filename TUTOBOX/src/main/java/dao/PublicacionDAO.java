/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Publicacion;

/**
 *
 * @author HP
 */
public interface PublicacionDAO {
    void insertar(Publicacion publicacion) throws SQLException;
    void update(Publicacion publicacion) throws SQLException;
    void delete(Publicacion publicacion) throws SQLException;
    List<Publicacion> listar() throws SQLException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Tutoria;

/**
 *
 * @author Brayan
 */
public interface TutoriaDAO {
    
    void insertar(Tutoria tutoria) throws SQLException;
    void update(Tutoria tutoria) throws SQLException;
    void delete(Tutoria tutoria) throws SQLException;
    List<Tutoria> listar() throws SQLException;
    
}

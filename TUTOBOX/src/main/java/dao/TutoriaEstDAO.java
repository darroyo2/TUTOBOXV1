/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import model.TutoriaEst;

/**
 *
 * @author Brayan
 */
public interface TutoriaEstDAO {
    
    void insertar(TutoriaEst usuario) throws SQLException;
    void update(TutoriaEst tutoriaEst) throws SQLException;
    void delete(TutoriaEst usuario) throws SQLException;
    List<TutoriaEst> listar() throws SQLException;
    
}

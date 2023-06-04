/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Curso;

/**
 *
 * @author HP
 */
public interface CursoDAO {
    void insertar(Curso curso) throws SQLException;
    void update(Curso curso) throws SQLException;
    void delete(Curso curso) throws SQLException;
    List<Curso> listar() throws SQLException;
}

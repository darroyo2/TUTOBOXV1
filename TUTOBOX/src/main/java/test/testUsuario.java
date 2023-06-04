/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.UsuarioDAOImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

/**
 *
 * @author Brayan
 */
public class testUsuario {
    
    public static void main (String [] args){
        
//        //test para insersion
//        Usuario usuario = new Usuario(0,"pierina", "bustamante", "123456", "brayan@gmail.com", 2);
//        UsuarioDAOImpl usudao = new UsuarioDAOImpl();
//        try {
//            usudao.insertarUsuario(usuario);
//        } catch (SQLException ex) {
//            System.out.println("erro al insertar "+ex);
//        }
        

        //test modificar
//        Usuario usuario = new Usuario(12,"p", "b", "1", "b", 1);
//        UsuarioDAOImpl usudao = new UsuarioDAOImpl();
//        try {
//            usudao.updateUsuario(usuario);
//        } catch (SQLException ex) {
//            System.out.println("erro al insertar "+ex);
//        }
        
    
        //test eliminar usuario
//        Usuario usuario = new Usuario(12,"p", "b", "1", "b", 1);
//        UsuarioDAOImpl usudao = new UsuarioDAOImpl();
//        try {
//            usudao.deleteUsuario(usuario);
//        } catch (SQLException ex) {
//            System.out.println("erro al insertar "+ex);
//        }
        
        UsuarioDAOImpl usudao = new UsuarioDAOImpl();
        List<Usuario> listaUsuarios = new ArrayList<>();
        try {
            listaUsuarios=usudao.listar();
            for (Usuario u : listaUsuarios) {
                System.out.println("ID : "+u.getIdUsuario());
                System.out.println("Nombre : "+u.getNombre());
                System.out.println("Apellido : "+u.getApellidos());
                System.out.println("Correo : "+u.getCorreo());
                System.out.println("Contraseña : "+u.getContrasena());
                System.out.println("IDTipo : "+u.getIdTipo());
            }
        } catch (SQLException ex) {
            System.out.println("erro al listar "+ex);
        }
    }
    
}

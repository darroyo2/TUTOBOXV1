/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.MensajeDAOImpl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mensaje;
import model.Usuario;

/**
 *
 * @author HP
 */
public class testMensaje {
    //        //test para insersion
    public static void main (String [] args){
//        Date utilDate = new Date();
//        Mensaje mensaje = new Mensaje(0,"tutoria mate", utilDate, "hola buenas tardes", 1, 2);
//        MensajeDAOImpl mensdao = new MensajeDAOImpl();
//        try {
//            mensdao.insertar(mensaje);
//        } catch (SQLException ex) {
//            System.out.println("error al insertar mensaje"+ex);
//        }
        MensajeDAOImpl mensdao = new MensajeDAOImpl();
        List<Mensaje> listaMensaje = new ArrayList<>();
        Usuario usu = new Usuario(2,"p", "b", "1", "b", 1);
        try {
            listaMensaje=mensdao.listarRecibidos(usu);
            for (Mensaje m : listaMensaje) {
                System.out.println("ID : "+m.getIdMensaje());
                System.out.println("Asunto : "+m.getAsunto());
                System.out.println("Fecha : "+m.getFechaEnvio());
                System.out.println("Cuerpo : "+m.getCuerpo());
                System.out.println("Emisor : "+m.getUsuarioEmisor());
                System.out.println("Receptor : "+m.getUsuarioReceptor());
            }
        } catch (SQLException ex) {
            System.out.println("erro al listar "+ex);
        }
    }
        
}


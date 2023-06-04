/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Brayan
 */
public class Mensaje {
    
    private int idMensaje;
    private String asunto;
    private Date fechaEnvio;
    private String cuerpo;
    private int usuarioEmisor;
    private int usuarioReceptor;

    public Mensaje() {
    }

    public Mensaje(int idMensaje, String asunto, Date fechaEnvio, String cuerpo, int usuarioEmisor, int usuarioReceptor) {
        this.idMensaje = idMensaje;
        this.asunto = asunto;
        this.fechaEnvio = fechaEnvio;
        this.cuerpo = cuerpo;
        this.usuarioEmisor = usuarioEmisor;
        this.usuarioReceptor = usuarioReceptor;
    }

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getUsuarioEmisor() {
        return usuarioEmisor;
    }

    public void setUsuarioEmisor(int usuarioEmisor) {
        this.usuarioEmisor = usuarioEmisor;
    }

    public int getUsuarioReceptor() {
        return usuarioReceptor;
    }

    public void setUsuarioReceptor(int usuarioReceptor) {
        this.usuarioReceptor = usuarioReceptor;
    }
    
    
}

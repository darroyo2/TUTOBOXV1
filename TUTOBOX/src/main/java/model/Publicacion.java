/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Publicacion {
    private int idPublicacion;
    private Date fecha;
    private String titulo;
    private String cuerpo;
    private int idCurso;
    private int idUsuario;

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Publicacion() {
    }
    
    public Publicacion(int idPublicacion, Date fecha, String titulo, String cuerpo, int idCurso, int idUsuario) {
        this.idPublicacion = idPublicacion;
        this.fecha = fecha;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.idCurso = idCurso;
        this.idUsuario = idUsuario;
    }
    
}



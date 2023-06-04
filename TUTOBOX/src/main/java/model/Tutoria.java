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
public class Tutoria {
    
    private int idTutoria;
    private String tema;
    private Date fecha;
    private Date horaIni;
    private Date horaFin;
    private String estado;
    private int idUsuario;
    private int idCurso;

    public Tutoria() {
    }

    public Tutoria(int idTutoria, String tema, Date fecha, Date horaIni, Date horaFin, String estado, int idUsuario, int idCurso) {
        this.idTutoria = idTutoria;
        this.tema = tema;
        this.fecha = fecha;
        this.horaIni = horaIni;
        this.horaFin = horaFin;
        this.estado = estado;
        this.idUsuario = idUsuario;
        this.idCurso = idCurso;
    }

    public int getIdTutoria() {
        return idTutoria;
    }

    public void setIdTutoria(int idTutoria) {
        this.idTutoria = idTutoria;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(Date horaIni) {
        this.horaIni = horaIni;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class TutoriaEst {
    
    private int idTutoriaEst;
    private boolean estadoPago;
    private int puntuacion;
    private String comentario;
    private int idTutoria;
    private int idUsuario;

    public int getIdTutoriaEst() {
        return idTutoriaEst;
    }

    public void setIdTutoriaEst(int idTutoriaEst) {
        this.idTutoriaEst = idTutoriaEst;
    }

    public boolean isEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(boolean estadoPago) {
        this.estadoPago = estadoPago;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdTutoria() {
        return idTutoria;
    }

    public void setIdTutoria(int idTutoria) {
        this.idTutoria = idTutoria;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public TutoriaEst() {
    }

    public TutoriaEst(int idTutoriaEst, boolean estadoPago, int puntuacion, String comentario, int idTutoria, int idUsuario) {
        this.idTutoriaEst = idTutoriaEst;
        this.estadoPago = estadoPago;
        this.puntuacion = puntuacion;
        this.comentario = comentario;
        this.idTutoria = idTutoria;
        this.idUsuario = idUsuario;
    }
    
}

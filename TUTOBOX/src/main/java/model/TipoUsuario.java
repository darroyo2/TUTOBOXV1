package model;

public class TipoUsuario {
    
    private String codigo;
    private String descripcion;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoUsuario() {
    }

    public TipoUsuario(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Detalle {
    private int iddetalle;
    private String descripcion;
    private String fecha;
    private String rol;
    private String area;
    private String estado;
    
    public Detalle(){
    }

    public Detalle(int iddetalle, String descripcion, String fecha, String rol, String area, String estado) {
        this.iddetalle = iddetalle;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.rol = rol;
        this.area = area;
        this.estado = estado;
    }

    public int getIddetalle() {
        return iddetalle;
    }
    
    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getArea() {
        return area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}

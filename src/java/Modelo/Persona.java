/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Persona {
    private int idpersona;
    private String nombre;
    private String email;
    private int telefono;
    private String domicilio;
    private String estado;
    
    public Persona(){
    }

    public Persona(int idpersona, String nombre, String email, int telefono, String domicilio, String estado) {
        this.idpersona = idpersona;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.estado = estado;
    }

    public int getIdpersona() {
        return idpersona;
    }
    
    public void setIdpersona(int idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
}

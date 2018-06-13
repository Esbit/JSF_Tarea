/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alejandro Sura
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {
    private String saludo;
    private String nombre;
    private String apellidos;
    private String edad;
    private String correo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }
    
}

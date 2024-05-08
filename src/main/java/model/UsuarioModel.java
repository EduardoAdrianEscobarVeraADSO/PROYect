/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Propietario
 */
public class UsuarioModel {
    
    private int ID_usuario;
    private String nombre;
    private String correo;
    private String contraseña;

    // Constructor
    public UsuarioModel(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    // Getters y setters
    public int getId() {
        return ID_usuario;
    }

    public void setId(int id) {
        this.ID_usuario = id;
    }

    public String getNombreUsuario() {
        return nombre;
    }

    public void setNombreUsuario(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correo;
    }

    public void setCorreoElectronico(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contraseña;
    }

    public void setContrasena(String contraseña) {
        this.contraseña = contraseña;
    }
}
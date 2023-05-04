package com.mycompany.entity;

/*
 * @author JJAB
 */
public class EmpleadoEntity {

    int idempleado;
    String cedula;
    String nombres;
    String apellidos;
    String usuario;
    String contrasena;
    int rol_idrol;

    public EmpleadoEntity() {
    }

    public EmpleadoEntity(int idempleado, String cedula, String nombres, String apellidos, String usuario, String contrasena, int rol_idrol) {
        this.idempleado = idempleado;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol_idrol = rol_idrol;
    }

    public EmpleadoEntity(String cedula, String nombres, String apellidos, String usuario, String contrasena, int rol_idrol) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol_idrol = rol_idrol;
    }

    public EmpleadoEntity(String cedula, String nombres, String apellidos, String usuario, String contrasena) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRol_idrol() {
        return rol_idrol;
    }

    public void setRol_idrol(int rol_idrol) {
        this.rol_idrol = rol_idrol;
    }

}

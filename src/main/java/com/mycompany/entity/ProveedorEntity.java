package com.mycompany.entity;

/**
 *
 * @author JJAB
 */
public class ProveedorEntity {

    int idproveedor;
    int idtipodocumento;
    String documento;
    String nombreproveedor;
    String telefono;
    String correo;

    public ProveedorEntity() {
    }

    public ProveedorEntity(int idproveedor, int idtipodocumento, String documento, String nombreproveedor, String telefono, String correo) {
        this.idproveedor = idproveedor;
        this.idtipodocumento = idtipodocumento;
        this.documento = documento;
        this.nombreproveedor = nombreproveedor;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}

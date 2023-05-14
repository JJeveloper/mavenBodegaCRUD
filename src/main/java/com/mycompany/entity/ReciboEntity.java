package com.mycompany.entity;

import java.sql.Date;

/**
 *
 * @author JJAB
 */
public class ReciboEntity {

    int idRecibo;
    String codigoRecibo;
    Date fechaRecibo;
    int proveedor_idproveedor;
    int empleado_idempleado;

    public ReciboEntity() {
    }

    public ReciboEntity(int idRecibo, String codigoRecibo, Date fechaRecibo, int proveedor_idproveedor, int empleado_idempleado) {
        this.idRecibo = idRecibo;
        this.codigoRecibo = codigoRecibo;
        this.fechaRecibo = fechaRecibo;
        this.proveedor_idproveedor = proveedor_idproveedor;
        this.empleado_idempleado = empleado_idempleado;
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public String getcodigoRecibo() {
        return codigoRecibo;
    }

    public void setcodigoRecibo(String codigoRecibo) {
        this.codigoRecibo = codigoRecibo;
    }

    public Date getFechaRecibo() {
        return fechaRecibo;
    }

    public void setFechaRecibo(Date fechaRecibo) {
        this.fechaRecibo = fechaRecibo;
    }

    public int getProveedor_idproveedor() {
        return proveedor_idproveedor;
    }

    public void setProveedor_idproveedor(int proveedor_idproveedor) {
        this.proveedor_idproveedor = proveedor_idproveedor;
    }

    public int getEmpleado_idempleado() {
        return empleado_idempleado;
    }

    public void setEmpleado_idempleado(int empleado_idempleado) {
        this.empleado_idempleado = empleado_idempleado;
    }

}

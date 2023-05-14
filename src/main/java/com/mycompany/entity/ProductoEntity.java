package com.mycompany.entity;

import java.sql.Date;

/**
 *
 * @author JJAB
 */
public class ProductoEntity {

    int idProducto;
    int idTipoProducto;
    String codigo;
    String nombre;
    int cantidad;
    Date fechaElaboracion;
    Date fechaCaducidad;
    double precio;

    public ProductoEntity() {
    }

    public ProductoEntity(int idProducto, int idTipoProducto, String codigo, String nombre, int cantidad, Date fechaElaboracion, Date fechaCaducidad, double precio) {
        this.idProducto = idProducto;
        this.idTipoProducto = idTipoProducto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.fechaElaboracion = fechaElaboracion;
        this.fechaCaducidad = fechaCaducidad;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdTipoProducto() {
        return idTipoProducto;
    }

    public void setIdTipoProducto(int idTipoProducto) {
        this.idTipoProducto = idTipoProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(Date fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}

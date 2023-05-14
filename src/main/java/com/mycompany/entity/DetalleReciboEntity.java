package com.mycompany.entity;

/**
 *
 * @author JJAB
 */
public class DetalleReciboEntity {

    int idDetalleRecibo;
    int productoIdProducto;
    int reciboIdRecibo;

    public DetalleReciboEntity() {
    }

    public DetalleReciboEntity(int idDetalleRecibo, int productoIdProducto, int reciboIdRecibo) {
        this.idDetalleRecibo = idDetalleRecibo;
        this.productoIdProducto = productoIdProducto;
        this.reciboIdRecibo = reciboIdRecibo;
    }

    public int getIdDetalleRecibo() {
        return idDetalleRecibo;
    }

    public void setIdDetalleRecibo(int idDetalleRecibo) {
        this.idDetalleRecibo = idDetalleRecibo;
    }

    public int getProductoIdProducto() {
        return productoIdProducto;
    }

    public void setProductoIdProducto(int productoIdProducto) {
        this.productoIdProducto = productoIdProducto;
    }

    public int getReciboIdRecibo() {
        return reciboIdRecibo;
    }

    public void setReciboIdRecibo(int reciboIdRecibo) {
        this.reciboIdRecibo = reciboIdRecibo;
    }

}

package com.mycompany.entity;

/**
 *
 * @author JJAB
 */
public class TipoDocumentoEntity {

    int idtipoDocumento;
    String tipoDocumento;

    public TipoDocumentoEntity() {
    }

    public TipoDocumentoEntity(int idtipoDocumento, String tipoDocumento) {
        this.idtipoDocumento = idtipoDocumento;
        this.tipoDocumento = tipoDocumento;
    }

    public int getIdtipoDocumento() {
        return idtipoDocumento;
    }

    public void setIdtipoDocumento(int idtipoDocumento) {
        this.idtipoDocumento = idtipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String toString() {
        return tipoDocumento;
    }

}

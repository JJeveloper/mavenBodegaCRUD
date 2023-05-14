
package com.mycompany.entity;

/**
 *
 * @author JJAB
 */
public class TipoProductoEntity {
    
    int idtipoproducto;
    String tipoproducto;

    public TipoProductoEntity() {
    }

    public TipoProductoEntity(int idtipoproducto, String tipoproducto) {
        this.idtipoproducto = idtipoproducto;
        this.tipoproducto = tipoproducto;
    }

    public int getIdtipoproducto() {
        return idtipoproducto;
    }

    public void setIdtipoproducto(int idtipoproducto) {
        this.idtipoproducto = idtipoproducto;
    }

    public String getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(String tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    @Override
    public String toString() {
        return tipoproducto;
    }
    
    
    
    
}

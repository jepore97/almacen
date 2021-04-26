/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author H-P
 */
public class Factura {
    private int cdgoFactura;
    private int total;
    private Usuario usuario;

    public Factura(int cdgoFactura, int total, Usuario usuario) {
        this.cdgoFactura = cdgoFactura;
        this.total = total;
        this.usuario = usuario;
    }

    public int getCdgoFactura() {
        return cdgoFactura;
    }

    public void setCdgoFactura(int cdgoFactura) {
        this.cdgoFactura = cdgoFactura;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}

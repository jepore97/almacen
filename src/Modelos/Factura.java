package Modelos;

public class Factura {
    
    private int cdgoFactura;
    private int total;
    private Usuario usuario;
    private Detalle detalle[];

    public Factura() {
    }

    public Factura(int cdgoFactura) {
        this.cdgoFactura = cdgoFactura;
    }

    public Factura(int cdgoFactura, int total, Usuario usuario, Detalle[] detalle) {
        this.cdgoFactura = cdgoFactura;
        this.total = total;
        this.usuario = usuario;
        this.detalle = detalle;
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

    public Detalle[] getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle[] detalle) {
        this.detalle = detalle;
    }
}

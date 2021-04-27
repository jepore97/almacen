package Modelos;

public class Detalle {
    
    private int cdgoDetalle;
    private String producto;
    private int cantidad;
    private int precio;
    private Factura factura;

    public Detalle() {
    }

    public Detalle(String producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    
    public Detalle(int cdgoDetalle) {
        this.cdgoDetalle = cdgoDetalle;
    }

    public Detalle(int cdgoDetalle, String producto, int cantidad, int precio, Factura factura) {
        this.cdgoDetalle = cdgoDetalle;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.factura = factura;
    }

    public int getCdgoDetalle() {
        return cdgoDetalle;
    }

    public void setCdgoDetalle(int cdgoDetalle) {
        this.cdgoDetalle = cdgoDetalle;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}

package Modelos;

public class Usuario {
    
    private int cdgoUsuario;
    private String nombres;
    private String apellidos;
    private String correo;
    private String cedula;
    private String cargo;
    private String grado;
    private Factura factura[];

    public Usuario() {
    }

    public Usuario(int cdgoUsuario) {
        this.cdgoUsuario = cdgoUsuario;
    }

    public int getCdgoUsuario() {
        return cdgoUsuario;
    }

    public void setCdgoUsuario(int cdgoUsuario) {
        this.cdgoUsuario = cdgoUsuario;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Factura[] getFactura() {
        return factura;
    }

    public void setFactura(Factura[] factura) {
        this.factura = factura;
    }
}

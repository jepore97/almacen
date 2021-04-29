/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.awt.Color;

/**
 *
 * @author H-P
 */
public class Colores {
    private Color ColorPrimario;
    private Color ColorPrimarioOscuro;
    private Color ColorAcentuacion;

    public Colores() {
        this.ColorPrimario = Color.decode("#3F51B5");
        this.ColorPrimarioOscuro = Color.decode("#303F9F");
        this.ColorAcentuacion = Color.decode("#FF6D00");
    }
    
    

    public Colores(Color ColorPrimario, Color ColorPrimarioOscuro, Color ColorAcentuacion) {
        this.ColorPrimario = ColorPrimario;
        this.ColorPrimarioOscuro = ColorPrimarioOscuro;
        this.ColorAcentuacion = ColorAcentuacion;
    }

    public Color getColorPrimario() {
        return ColorPrimario;
    }

    public void setColorPrimario(Color ColorPrimario) {
        this.ColorPrimario = ColorPrimario;
    }

    public Color getColorPrimarioOscuro() {
        return ColorPrimarioOscuro;
    }

    public void setColorPrimarioOscuro(Color ColorPrimarioOscuro) {
        this.ColorPrimarioOscuro = ColorPrimarioOscuro;
    }

    public Color getColorAcentuacion() {
        return ColorAcentuacion;
    }

    public void setColorAcentuacion(Color ColorAcentuacion) {
        this.ColorAcentuacion = ColorAcentuacion;
    }
    
    
}

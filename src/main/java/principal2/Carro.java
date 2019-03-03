package principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Carro {

    public int codigoCarro;
    public String marca;
    public String referencia;
    public String color;
    public String tipoVehiculo;
    public int cantidad;
    
    
    
    
    public Carro(int codigoCarro, String marca, String referencia, String color, String tipoVehiculo, int cantidad) {
        this.codigoCarro = codigoCarro;
        this.marca = marca;
        this.referencia = referencia;
        this.color = color;
        this.tipoVehiculo = tipoVehiculo;
        this.cantidad = cantidad;
    }

    public int getCodigoCarro() {
        return codigoCarro;
    }

    public String getMarca() {
        return marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public String getColor() {
        return color;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCodigoCarro(int codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
   
    
    
    public void editarCarro(){}
    public void descontarCarro(){}
    public void aumentarCarro(){}
   
   
   
    
}

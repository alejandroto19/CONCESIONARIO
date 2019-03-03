package principal;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Cliente {
    public int codigoCliente;
    public int nombre;
        List Factura = new ArrayList() {};

    public Cliente(int codigoCliente, int nombre) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public int getNombre() {
        return nombre;
    }

    public List getFactura() {
        return Factura;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setFactura(List Factura) {
        this.Factura = Factura;
    }
        
        
        

}

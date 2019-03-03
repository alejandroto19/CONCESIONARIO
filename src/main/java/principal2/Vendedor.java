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
public class Vendedor {
   
    public int codigoVendedor;
    public String nombre;
    public int cedula;
    List comision = new ArrayList(){ };

    public Vendedor(int codigoVendedor, String nombre, int cedula) {
        this.codigoVendedor = codigoVendedor;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public List getComision() {
        return comision;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setComision(List comision) {
        this.comision = comision;
    }
    
    
    
    
}

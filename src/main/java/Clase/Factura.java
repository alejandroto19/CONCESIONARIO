
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
public class Factura {
    
    public int codigoFactura;
    public String fecha;
    public int costoTotal;
    public int codigoCliente;
    List venta = new ArrayList (){};

    public Factura(int codigoFactura, String fecha, int costoTotal, int codigoCliente) {
        this.codigoFactura = codigoFactura;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.codigoCliente = codigoCliente;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public List getVenta() {
        return venta;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setVenta(List venta) {
        this.venta = venta;
    }

    
    
    
    
}

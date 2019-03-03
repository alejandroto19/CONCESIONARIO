
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
public class Stock {
 
    
    
    public int codigoStock;
    List Carro =new ArrayList(){ };

    public Stock(int codigoStock) {
        this.codigoStock = codigoStock;
    }

    public int getCodigoStock() {
        return codigoStock;
    }

    public List getCarro() {
        return Carro;
    }

    public void setCodigoStock(int codigoStock) {
        this.codigoStock = codigoStock;
    }

    public void setCarro(List Carro) {
        this.Carro = Carro;
    }
    
    
    
    public void agregarCarro(){ }
    
    public void carroMasBarato(){}
    public void carroMasCaro(){}
    
}

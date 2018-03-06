/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADO1;

/**
 *
 * @author vinicius.presoto
 */
public class no {
    
    private carros c;
    private no prox;
    
    public no (carros car){
        this.c = car;
        this.prox = null;
    }

    public carros getC() {
        return c;
    }

    public void setC(carros c) {
        this.c = c;
    }

    public no getProx() {
        return prox;
    }

    public void setProx(no prox) {
        this.prox = prox;
    }
    
    
    
}

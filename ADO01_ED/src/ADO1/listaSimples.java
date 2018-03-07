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
public class listaSimples {

    private no prim;
    private no ult;
    private int qtdNo;

    public listaSimples() {
        this.prim = null;
        this.ult = null;
        this.qtdNo = 0;
    }

    public no getPrim() {
        return prim;
    }

    public void setPrim(no prim) {
        this.prim = prim;
    }

    public no getUlt() {
        return ult;
    }

    public void setUlt(no ult) {
        this.ult = ult;
    }

    public int getQtdNo() {
        return qtdNo;
    }

    public void setQtdNo(int qtdNo) {
        this.qtdNo = qtdNo;
    }

    public boolean isEmpty() {
        return (this.prim == null);
    }

    public void inserirPrimeiro(carros c) {
        no novoNo = new no(c);
        if (this.isEmpty()) {
            this.ult = novoNo;
        }
        novoNo.setProx(this.prim);
        this.prim = novoNo;
        this.qtdNo++;
    }

    public boolean removerNo(String modelo) {
        no atual = this.prim;
        no anterior = null;
        if (this.isEmpty()) {
            return false;
        } else {
            while (atual != null && (!atual.getC().getModelo().equals(modelo))) {
                anterior = atual;
                atual = atual.getProx();
            }
            if (atual == prim) {
                if (this.prim == this.ult) {
                    this.ult = null;
                }
                this.prim = this.prim.getProx();
            } else {
                if (atual == ult) {
                    this.ult = anterior;
                }
                anterior.setProx(atual.getProx());

            }
        }
        this.qtdNo--;
        return true;

    }

    public String pesquisarNo(String modelo) {
        String msg = "";
        no atual = this.prim;
        while (atual != null && (!atual.getC().getModelo().equals(modelo))) {
            atual = atual.getProx();
        }
        return msg = "Modelo: " + atual.getC().getModelo() + "\n"
                + "Marca: " + atual.getC().getMarca() + "\n"
                + "Modelo: " + atual.getC().getAno();
    }

    public String imprimirLista() {
        String msg = "";
        if (this.isEmpty()) {
            msg = "Lista vazia";
        } else {
            no atual = this.prim;
            while (atual != null) {
                msg += atual.getC().getModelo() + "-->";
                atual = atual.getProx();
            }
        }
        return msg;
    }
}

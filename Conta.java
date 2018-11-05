/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

import java.util.LinkedList;

/**
 *
 * @author arttandrade
 */
public class Conta {
    private String nome;
    LinkedList<comida> pedidos;
    private Float total;
    private Funcionario garcom;
    
    Conta(){
    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void setGarcom(Funcionario Garcom) {
        this.garcom = Garcom;
    }

    public String getNome() {
        return nome;
    }

    public Float getTotal() {
        return total;
    }

    public Funcionario getGarcom() {
        return garcom;
    } 
        
    public void addPedido(comida comida){
        this.pedidos.add(comida);
    }
    
    public void calculaTotal(){
        int i=0;
        while(this.pedidos.get(i) != null){
            this.total = this.total + this.pedidos.get(i).getPreco();
        }
    }
    
    public void cancelarPedido(comida comida){
        this.pedidos.remove(comida);
    }
    
    public void fecharConta() throws Throwable{
        this.finalize();
    }
    
    public String toString(){
        String conta = "";
        conta += "Nome: " + this.nome + "\n";
        conta += "Pedidos: \n";
        int i=0;
        while(this.pedidos.get(i) != null){
            conta += "\t-" + this.pedidos.get(i).toString() + "\n";
        }
        conta += "Garçom: " + this.garcom.getNome();
        conta += "\n";
        conta += "Total: " + this.total + "\n";
        return conta; 
    }
}

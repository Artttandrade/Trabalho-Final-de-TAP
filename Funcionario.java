/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scr;

/**
 *
 * @author arttandrade
 */
public class Funcionario {
    private String nome;
    private int idade;
    private int servindo;
    private boolean cheio;
    private Float nota;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setServindo(int servindo) {
        this.servindo = servindo;
    }

    public void setCheio(boolean cheio) {
        this.cheio = cheio;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getServindo() {
        return servindo;
    }

    public boolean isCheio() {
        return cheio;
    }

    public Float getNota() {
        return nota;
    }

    
    
}

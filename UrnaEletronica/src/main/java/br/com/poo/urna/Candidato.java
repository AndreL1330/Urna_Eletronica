/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.urna;

/**
 *
 * @author Jean
 */
public class Candidato extends Partido{
    private String nome;
    private int numero;    
    
    public Candidato(String nome,int numero,String sigla){
        super(sigla);
        setNome(nome);
        setNumero(numero);
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }
}


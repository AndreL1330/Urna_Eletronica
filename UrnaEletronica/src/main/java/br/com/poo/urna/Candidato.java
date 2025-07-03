/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.urna;

/**
 *
 * @author Jean
 */
public class Candidato {
    private String nome;
    private int numero;
    private String partido;
    
    
    
    
    public Candidato(String nome, String partido, String pFest, String fotospascoapng){
  
        setNome(nome);
        setNumero(numero);
        setPartido(partido);
      
      
  }

    public Candidato() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
  
   public String getPartido() {
        return partido;
    }
   
  public void setPartido(String partido){
      this.partido = partido;
  } 
}


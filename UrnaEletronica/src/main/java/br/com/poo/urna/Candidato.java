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
    
    
    
  public Candidato(String nome,int numero,String partido){
  
        setNome(nome);
        setNumero(numero);
        setPartido(partido);
      
      
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


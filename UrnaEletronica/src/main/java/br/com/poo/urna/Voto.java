/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.urna;

/**
 *
 * @author 232.976682
 */
public class Voto {
    private int numDigitado;
    private Candidato candidato;
    
    public Voto(int numDigitado, Candidato candidato){
        setNumDigitado(numDigitado);
        setCandidato(candidato);
    }
    
    public Voto(){
        
    }

    public int getnumDigitado() {
       return numDigitado;
    }

    public void setNumDigitado(int numDigitado) {
       this.numDigitado = numDigitado;
    }

    public Candidato getCandidato() {
       return candidato;
    }

    public void setCandidato(Candidato candidato) {
       this.candidato = candidato;
    }
    
    public void verificarVoto(int numDigitado, Candidato candidato){
       if(numDigitado == candidato.getNumero()){
            
       }
       if(numDigitado == null){
            
       }
    }
    
}

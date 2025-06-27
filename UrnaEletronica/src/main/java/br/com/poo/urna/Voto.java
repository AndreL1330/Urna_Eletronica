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
    private int NumDigitado;
    private Candidato candidato;
    
    public Voto(int NumDigitado, Candidato candidato){
        setNumDigitado(NumDigitado);
        setCandidato(candidato);
    }
    
    public Voto(){
        
    }

    public int getNumDigitado() {
        return NumDigitado;
    }

    public void setNumDigitado(int NumDigitado) {
        this.NumDigitado = NumDigitado;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
    
    //if(NumDigitado == ){
    
//}
    
}

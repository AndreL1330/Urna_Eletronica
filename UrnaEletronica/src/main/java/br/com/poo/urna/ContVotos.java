/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.urna;

/**
 *
 * @author Jean
 */
public class ContVotos extends Candidato{
    private int qtdVotos;
    
    ContVotos(String nome,int numero,String partido){
        super(nome,partido, "PFest", "fotos/pascoa.png");
    }

    
    public ContVotos(int qtdVotos){
    
    setQtdVotos(qtdVotos);
}

    public int getQtdVotos() {
        return qtdVotos;
    }

    
    public void setQtdVotos(int qtdVotos) {
        this.qtdVotos = qtdVotos;
    }



}

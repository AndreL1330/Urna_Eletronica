/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.urna.MongoDB;

import br.com.poo.urna.Candidato;

/**
 *
 * @author Jean
 */
public class ManterCandidatoService {
     MongoDAO dao = new MongoDAO();

    public Candidato findByNumber(int num) {

        return dao.findByNumber(num);
    }
}

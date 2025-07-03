package br.com.poo.urna.Controller;
 
import br.com.poo.urna.Candidato;
import java.util.List;
import java.util.ArrayList;

public class Controller {
    private List<Candidato> listaCandidatos;
    
    
    public Controller(){
        listaCandidatos = new ArrayList<>();
        
        //festas populares
        listaCandidatos.add(new Candidato("94001", "Páscoa", "PFest", "fotos/pascoa.png"));
        listaCandidatos.add(new Candidato("94002", "Oktoberfest", "PFest", "fotos/oktoberfest.png"));
        listaCandidatos.add(new Candidato("94003", "Reveillon", "PFest", "fotos/reveillon.png"));
        
        //folclore
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        
        //esportes
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        
        //profissoes
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        
        //ritmos musicais
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        listaCandidatos.add(new Candidato());
        
    }
}

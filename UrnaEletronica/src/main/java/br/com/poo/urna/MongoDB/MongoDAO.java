/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.poo.urna.MongoDB;
import br.com.poo.urna.Candidato;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;
/**
 *
 * @author Jean
 */
public class MongoDAO {
   
     private MongoDatabase conection() {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("poo");
        return database;
    }
     public Candidato findByNumber(int num) {
        MongoDatabase database = conection();
        MongoCollection<Document> collection = database.getCollection("eleicoes");
        Bson filtro = Filters.eq("numero", num);
        Document candidatoDoc = collection.find(filtro).first();

        Candidato voto = new Candidato();
        voto.setNome(candidatoDoc.getString("nome"));
        voto.setNumero(candidatoDoc.getInteger("numero"));
        voto.setPartido(candidatoDoc.getString("siglaPart"));
        return voto;
    }
     
}

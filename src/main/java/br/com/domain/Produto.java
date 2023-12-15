package br.com.domain;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

@MongoEntity(collection = "produto")
@Getter
@Setter
public class Produto extends PanacheMongoEntity {


    private ObjectId id; 
    private String nome;
    private double preço;
    private int quantidade;

    
}

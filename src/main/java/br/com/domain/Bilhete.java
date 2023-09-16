package br.com.domain;

import org.bson.types.ObjectId;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.Setter;

@MongoEntity(collection = "bilhete")
@Getter
@Setter
public class Bilhete extends PanacheMongoEntity {


    private ObjectId id; 
    private double winProbability;
    private double odd;
    private double buyin;
    private double lucroReal;
    private String time1;
    private String time2;
    private int quantidade;
    private double ev;
    private double ep;

    
}

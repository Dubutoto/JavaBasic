package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductDelete {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> collection = database.getCollection("product");

        String brand = "Nike";
        Document query = new Document("category", "Clothing").append("brand", brand);
        collection.deleteOne(query);

        System.out.println("브랜드가 Nike인 상품 삭제 완료.");

        mongoClient.close();
    }
}
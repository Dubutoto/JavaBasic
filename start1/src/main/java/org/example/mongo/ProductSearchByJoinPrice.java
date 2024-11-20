package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductSearchByJoinPrice {
    public static void main(String[] args) {
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> collection = database.getCollection("product");

        int price = 1000000;
        Document query = new Document("category", "Electronics").append("price", new Document("$gte", price));
        for (Document product : collection.find(query)) {
            System.out.println("검색된 상품 정보 : " + product.toJson());
        }

        mongoClient.close();
    }
}

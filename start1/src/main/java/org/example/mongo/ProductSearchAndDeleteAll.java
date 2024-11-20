package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ProductSearchAndDeleteAll {
    public static void main(String[] args) {
        // MongoClient 생성 및 데이터베이스, 컬렉션 연결
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> collection = database.getCollection("product");

        // 조건: category가 "Clothing"이고 price가 30000 이상인 상품
        Document query = new Document("category", "Clothing").append("price", new Document("$gte", 30000));

        // 상품 검색 및 삭제
        collection.deleteMany(query);

        // MongoClient 종료
        mongoClient.close();
    }
}

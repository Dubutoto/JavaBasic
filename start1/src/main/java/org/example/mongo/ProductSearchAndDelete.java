package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class ProductSearchAndDelete {
    public static void main(String[] args) {
        // MongoClient 생성 및 데이터베이스, 컬렉션 연결
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> collection = database.getCollection("product");

        // 조건: category가 "Books"이고 price가 25000 이상인 상품
        Document query = new Document("category", "Books").append("price", new Document("$gte", 25000));

        // 상품 검색 및 삭제
        Document product = collection.find(query).first();
        if (product != null) {
            System.out.println("검색된 상품 정보: " + product.toJson());
            collection.deleteOne(query);
            System.out.println("상품이 삭제되었습니다.");
        } else {
            System.out.println("조건에 맞는 상품을 찾을 수 없습니다.");
        }

        // MongoClient 종료
        mongoClient.close();
    }
}

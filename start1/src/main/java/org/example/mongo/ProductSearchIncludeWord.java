package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import com.mongodb.client.FindIterable;

public class ProductSearchIncludeWord {

    public static void main(String[] args) {
        ProductSearchIncludeWord productSearch = new ProductSearchIncludeWord();
        productSearch.searchProductByName();
    }

    public void searchProductByName() {
        // MongoDB 연결 설정
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> collection = database.getCollection("product");

        // 검색 조건: category가 "Electronics"이고 name에 "Smart"가 포함된 상품
        Document query = new Document("category", "Electronics")
                .append("name", new Document("$regex", "Smart"));

        // 결과 검색 및 출력
        FindIterable<Document> results = collection.find(query);
        for (Document product : results) {
            System.out.println("검색된 상품: " + product.toJson());
        }

        // MongoClient 종료
        mongoClient.close();
    }
}

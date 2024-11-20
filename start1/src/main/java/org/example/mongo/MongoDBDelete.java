package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBDelete {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");

        // 블로그 서비스에서 회원 아이디로 삭제
        String memberId = "blogUser2";  // 삭제할 회원 아이디
        Document query = new Document("service", "Blog").append("id", memberId);
        collection.deleteOne(query);

        System.out.println("블로그 회원 정보 삭제 완료.");

        mongoClient.close();
    }
}


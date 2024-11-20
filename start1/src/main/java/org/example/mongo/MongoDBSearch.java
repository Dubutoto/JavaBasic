package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDBSearch {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("naver");
        MongoCollection<Document> collection = database.getCollection("members");

        // 카페 서비스에서 회원 아이디로 검색
        String memberId = "cafeUser1";  // 검색할 회원 아이디
        Document query = new Document("service", "Cafe").append("id", memberId);
        Document member = collection.find(query).first();

        if (member != null) {
            System.out.println("검색된 회원 정보: " + member.toJson());
        } else {
            System.out.println("회원 정보를 찾을 수 없습니다.");
        }

        mongoClient.close();
    }
}


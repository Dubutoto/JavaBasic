package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

public class Member하나수정 {
    public static void main(String[] args) {
        //1. MongoClient생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공~!");
        //3. 전송할 js생성
        //update할 json(document) filter을 생성
        Document filter = new Document();
        filter.append("id", "hong"); //{id : "kim"}
        //수정할 내용 지정
        Bson pw = Updates.set("tel", "999"); //{$set : {pw: "pass"}}

        //4. 전송, 결과처리
        member.updateMany(filter, pw);
        //db.member.updateMany({id : "kim"},{$set : {pw: "pass"}});
        client.close();
    }
}

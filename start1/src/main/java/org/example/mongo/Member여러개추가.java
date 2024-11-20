package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class Member여러개추가 {
    public static void main(String[] args) {
        //1. MongoClient생성
        MongoClient client = new MongoClient("localhost", 27017);
        //2. db연결, collection연결
        MongoDatabase db = client.getDatabase("shop");
        MongoCollection<Document> member = db.getCollection("member");
        System.out.println("member컬렉션까지 연결 성공~!");
        //3. 전송할 js생성
        //insert할 json(document)을 여러개 생성
        Document doc = new Document();
        doc.append("id", "apple2");
        doc.append("pw", "1234");
        doc.append("name", "apple2");
        doc.append("tel", "011");

        Document doc2 = new Document();
        doc2.append("id", "apple3");
        doc2.append("pw", "1234");
        doc2.append("name", "apple3");
        doc2.append("tel", "011");

        List<Document> list = new ArrayList<>();
        list.add(doc);
        list.add(doc2);

        //4. 전송, 결과처리
        member.insertMany(list);
        System.out.println("==== 몽고DB로 전송함.");
        client.close();
    }
}
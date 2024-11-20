package org.example.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.ArrayList;
import java.util.List;

public class Member하나수정2 {
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
        Bson pw = Updates.set("pw", "7777"); //{pw: "QKRAJRWK"}
        Bson name = Updates.set("name", "winner"); //{name: "sorkcjswo"}

        List<Bson> list = new ArrayList<>();
        list.add(pw);
        list.add(name);
        Bson all = Updates.combine(list); //{pw: "~~~", name: "~~~"}

        //4. 전송, 결과처리
        member.updateOne(filter, all);
        //db.member.updateOne({id : "kim"},{$set : {pw: "~~~", name: "~~~"}});
        client.close();
    }
}

//Bson 은 Json 을 나타내는 인터페이스
//Document 는 Bson 을 구현한 클래스
//Bson은 실제로 문자로 json을 저장하지 않고 바이너리형태로 저장해서 속도가 빠르다.
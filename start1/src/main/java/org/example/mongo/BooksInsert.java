package org.example.mongo;


import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class BooksInsert {

    public static void insertBookData() {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("Product");
        MongoCollection<Document> collection = database.getCollection("product");

        Document bookData = new Document("category", "Books")
                .append("name", "Java Programming")
                .append("price", 35000)
                .append("author", "John Doe")
                .append("description", "Learn Java programming");

        Document bookData2 = new Document("category", "Books")
                .append("name", "The Great Gatsby")
                .append("price", 20000)
                .append("author", "F. Scott Fitzgeraid")
                .append("description", "Classic American novel");

        List<Document> list = new ArrayList<>();
        list.add(bookData);
        list.add(bookData2);

        collection.insertMany(list);

        mongoClient.close();
        System.out.println("Electronics 정보 삽입 완료.");
    }
}

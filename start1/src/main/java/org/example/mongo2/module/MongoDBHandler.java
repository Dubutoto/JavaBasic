package org.example.mongo2.module;


import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MongoDBHandler {
    private static final String MONGO_URI = "mongodb://localhost:27017";

    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public void connect(String databaseName, String collectionName) {
        client = new MongoClient("localhost", 27017);
        database = client.getDatabase(databaseName);
        collection = database.getCollection(collectionName);
        System.out.println("Connected to MongoDB.");
    }

    public void insertActivityLog(Document log) {
        collection.insertOne(log);
    }

    public List<Document> findLogsByUserId(int userId) {
        Document filter = new Document("userId", userId);
        FindIterable<Document> results = collection.find(filter);

        // 결과를 리스트로 변환
        List<Document> logs = new ArrayList<>();
        for (Document doc : results) {
            logs.add(doc);
        }
        return logs;
    }

    public void close() {
        if (client != null) {
            client.close();
        }
    }
}

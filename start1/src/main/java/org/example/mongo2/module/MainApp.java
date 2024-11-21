package org.example.mongo2.module;

import org.bson.Document;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApp {
    public static void main(String[] args) {

        // 경고 무시
        Logger mongoLogger = Logger.getLogger( "org.mongodb.driver" );
        mongoLogger.setLevel(Level.WARNING);

        MysqlHandler mysqlHandler = new MysqlHandler();
        MongoDBHandler mongoHandler = new MongoDBHandler();

        try {
            // MySQL 연결
            mysqlHandler.connect();

            // 사용자 추가
            int userId = mysqlHandler.insertUser("hong", "hong@new.com");
            System.out.println("Generated userId: " + userId);

            // MongoDB 연결
            mongoHandler.connect("aws", "activity_logs");

            // 현재 시간 & 형식
            Date date = new Date();
            // 원하는 형식으로 포맷 설정
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            // 포맷된 시간
            String formattedDate = sdf.format(date);

            // 활동 로그 추가
            Document log1 = new Document("userId", userId)
                    .append("activity", "Login")
                    .append("timestamp", formattedDate);
            Document log2 = new Document("userId", userId)
                    .append("activity", "Shopping")
                    .append("timestamp", formattedDate);
            Document log3 = new Document("userId", userId)
                    .append("activity", "Order")
                    .append("timestamp", formattedDate);

            mongoHandler.insertActivityLog(log1);
            mongoHandler.insertActivityLog(log2);
            mongoHandler.insertActivityLog(log3);

            System.out.println("Inserted activity logs for userId: " + userId);

            // MySQL에서 사용자 정보 검색
            ResultSet userResult = mysqlHandler.getUserById(userId);
            if (userResult.next()) {
                System.out.println("User Info:");
                System.out.println("ID: " + userResult.getInt("id"));
                System.out.println("Name: " + userResult.getString("name"));
                System.out.println("Email: " + userResult.getString("email"));
            }

            // MongoDB에서 활동 로그 검색
            List<Document> foundLogs = mongoHandler.findLogsByUserId(userId);
            if (!foundLogs.isEmpty()) {
                System.out.println("MongoDB Search Results:");
                for (Document log : foundLogs) {
                    System.out.println(log.toJson());
                }
            } else {
                System.out.println("No activity logs found for userId: " + userId);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                mysqlHandler.close();
                mongoHandler.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

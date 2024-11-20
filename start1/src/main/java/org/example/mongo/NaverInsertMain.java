package org.example.mongo;

public class NaverInsertMain {

    public static void main(String[] args) {
        MongoDBBlogInsert.insertBlogMember();
        MongoDBCafeInsert.insertCafeMember();
        MongoDBLineInsert.insertLineMember();
    }
}

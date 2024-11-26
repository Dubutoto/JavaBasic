package org.example.dbcp;

public class DBCP {
    static DBCP instance;
    public static DBCP getInstance() {
        if (instance == null) {
            instance = new DBCP();
        }
        return instance;
    }
}

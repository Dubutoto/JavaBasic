package org.example.day16.네트워크;

import java.net.ServerSocket;

public class Server {
    public static void main(String[] args) {
        ServerSocket server = new ServerSocket(5000);
        //ip는 컴퓨터 따라감.
        while (true) {
            System.out.println("Server is activated");
            server.accept();
            System.out.println("Server accepted");
        }

    }
}

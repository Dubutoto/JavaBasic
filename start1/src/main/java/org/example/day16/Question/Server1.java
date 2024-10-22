package org.example.day16.Question;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9000);
        //1. 서버가 스타트
        //ip는 컴퓨터 따라감.

        int count = 0;
        while (true) {
            System.out.println("Server is activated");
            //2. 요청이 들어오면 승인용 서버가 승인을 함.
            // --> 연결통로(stream)가 만들어진다.(Socket)
            Socket socket = server.accept(); //소켓을 통해 데이터전달
            count++;
            System.out.println("Server accepted"+"\n"+count+"users");
            //3. 보낼 데이터를 정하자.
            // 스트림으로 연결된 데이터를 보낼 수 있는 부품. PrintWriter
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("I'm a Java programmer");
            socket.close();
        }
    }
}

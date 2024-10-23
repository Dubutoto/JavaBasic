package org.example.day17.Question;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_S {
    public static void main(String[] args) throws Exception {

        DatagramSocket socket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost");

        String s = "I am a android programmer";
        byte[] buf = s.getBytes();
        DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, 7100);
        System.out.println("클라이언트 포트>>"+ socket.getLocalPort());
        socket.send(packet);
        socket.close();
    }
}

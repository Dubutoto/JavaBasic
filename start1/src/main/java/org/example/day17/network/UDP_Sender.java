package org.example.day17.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_Sender {
    public static void main(String[] args) throws Exception {

        //보내는 전화기역할 부품 --> DatagramSocket
        DatagramSocket socket = new DatagramSocket();
        //주소: ip(InetAddress) + port(int)
        InetAddress ip = InetAddress.getByName("localhost");
        //Connection con = Jsoup.connection();
        //램에 어느 주소에 부품이 있는 줄을 알면, 그거 쓰면 됨!
        //없으면, new 생성해서 넣어줌.

        //데이터: String --> byte[]
        String s = "I am a Java programmer";
        byte[] buf = s.getBytes();
        //패킷 --> DatagramPacket(데이터, 주소)
        DatagramPacket packet = new DatagramPacket(buf, buf.length, ip, 7100);

        //소켓으로 패킷을 보내자.
        socket.send(packet);
        //소켓 자원해제.
        socket.close();
    }
}

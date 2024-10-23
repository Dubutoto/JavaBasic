package org.example.day17.network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Receiver {
    public static void main(String[] args) throws Exception {
        //공간 다 만들어두고 받을 준비를 먼저 하고 있어야 함
        //누군가가 ip+port로 보내면 자동으로 받게해야함.
        //여러 번 받고 싶으면 무한루프를 설정해야함.
        //스트림 전송시 1 byte 단위로 읽고 쓴다.
        DatagramSocket socket = new DatagramSocket(7100);
        byte[] data = new byte[256];
        // 보낼 때, 받을 때 DatagramPacket 형식임.
        // 데이터를 받아서 집어넣을 바이트 배열을 만들어놓아야한다.
        DatagramPacket packet = new DatagramPacket(data, data.length);
        //패킷으로 받으면 데이터(데이터그램)을 꺼내서 위에서 설정한 data배열에 넣어줘.

        System.out.println("UDP Receiver waiting the call");

        socket.receive(packet);

        // 받은 데이터를 스트링으로 변환해서 프린트
        System.out.println(data);
        System.out.println(new String(data));
        socket.close();
    }
}

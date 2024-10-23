package org.example.day17.chatServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;

public class 채팅서버 {

    // 클라이언트들의 주소를 저장하는 리스트
    static ArrayList<ClientInfo> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(7777);  // 서버는 7777 포트에서 메시지를 받음
            System.out.println("채팅 서버가 시작되었습니다...");

            while (true) {
                byte[] buffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                // 클라이언트로부터 메시지 수신
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength(), "UTF-8");
                System.out.println("받은 메시지: " + message);

                // 수신한 클라이언트의 정보 저장 (IP와 포트)
                ClientInfo senderInfo = new ClientInfo(packet.getAddress(), packet.getPort());

                // 새로운 클라이언트라면 리스트에 추가
                if (!clients.contains(senderInfo)) {
                    clients.add(senderInfo);
                    System.out.println("새로운 클라이언트 추가: " + senderInfo);
                }

                // 메시지를 보낸 클라이언트에게는 다시 전송하지 않음
                for (ClientInfo client : clients) {
                    if (!client.equals(senderInfo)) {  // 송신자 제외
                        DatagramPacket sendPacket = new DatagramPacket(buffer, packet.getLength(), client.address, client.port);
                        socket.send(sendPacket);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 클라이언트 정보를 저장하는 클래스
    static class ClientInfo {
        public final java.net.InetAddress address;
        public final int port;

        public ClientInfo(java.net.InetAddress address, int port) {
            this.address = address;
            this.port = port;
        }

        // 클라이언트 식별을 위해 equals와 hashCode 오버라이드
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            ClientInfo that = (ClientInfo) obj;
            return port == that.port && address.equals(that.address);
        }

        @Override
        public int hashCode() {
            return address.hashCode() * 31 + port;
        }

        @Override
        public String toString() {
            return "ClientInfo{" + "address=" + address + ", port=" + port + '}';
        }
    }
}


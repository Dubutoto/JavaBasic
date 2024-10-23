package org.example.day17.chatServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;1
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class 채팅클라이언트 extends JFrame {
    JTextArea list;
    DatagramSocket socket;
    InetAddress serverAddress;
    int serverPort = 7777;  // 서버가 사용할 포트

    public 채팅클라이언트() throws Exception {
        setTitle("채팅 클라이언트");
        setSize(500, 500);
        getContentPane().setBackground(Color.pink);

        list = new JTextArea();
        JTextField input = new JTextField();
        JScrollPane scrollPane = new JScrollPane(list);
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        list.setBackground(Color.pink);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true);
        list.setWrapStyleWord(true);
        list.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        socket = new DatagramSocket();
        serverAddress = InetAddress.getByName("127.0.0.1");  // 서버의 IP 주소로 변경 (서버가 있는 곳)

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = input.getText().trim();
                if (data.isEmpty()) {
                    return;
                }
                list.append("나: " + data + "\n");
                input.setText("");

                try {
                    byte[] sendData = data.getBytes(StandardCharsets.UTF_8);
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);
                    socket.send(sendPacket);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                list.setCaretPosition(list.getDocument().getLength());
            }
        });

        setVisible(true);

        new Thread(() -> receiveMessages()).start();
    }

    public void receiveMessages() {
        try {
            while (true) {
                byte[] buffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength(), StandardCharsets.UTF_8);
                list.append("너: " + message + "\n");
                list.setCaretPosition(list.getDocument().getLength());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        new 채팅클라이언트();
    }
}

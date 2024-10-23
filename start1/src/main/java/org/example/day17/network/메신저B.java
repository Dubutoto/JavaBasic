package org.example.day17.network;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class 메신저B extends JFrame {
    JTextArea list;

    메신저B() {
        setTitle("메신저B");
        setSize(500, 500);
        getContentPane().setBackground(Color.yellow);

        list = new JTextArea();
        JTextField input = new JTextField();
        JScrollPane scrollPane = new JScrollPane(list);  // 스크롤 패널 추가
        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);  // 스크롤 패널을 중앙에 추가
        add(input, BorderLayout.SOUTH);

        list.setBackground(Color.yellow);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.BLUE);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true);
        list.setWrapStyleWord(true);  // 단어 단위로 줄바꿈
        list.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data2 = data.getBytes(StandardCharsets.UTF_8);
                    InetAddress ip = InetAddress.getByName("127.0.0.1");
                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 7777);  // 메신저A 포트로 전송
                    socket.send(packet);
                    socket.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                // 자동 스크롤 기능
                list.setCaretPosition(list.getDocument().getLength());
            }
        });

        setVisible(true);

        // 메시지를 수신하는 스레드 실행
        new Thread(() -> receiveMessages()).start();
    }

    public void receiveMessages() {
        try {
            DatagramSocket socket = new DatagramSocket(7778);  // 메신저B는 7778 포트에서 수신
            byte[] data = new byte[1024];

            while (true) {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                socket.receive(packet);
                String message = new String(packet.getData(), 0, packet.getLength(), StandardCharsets.UTF_8);
                list.append("너: " + message + "\n");

                // 자동 스크롤 기능
                list.setCaretPosition(list.getDocument().getLength());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new 메신저B();
    }
}

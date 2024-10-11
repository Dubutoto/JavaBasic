package org.example.day9.memory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy2 {
        public static void main(String[] args) {
            String sourceFilePath = "/Users/vf20093/Desktop/Data/앙.txt"; // 원본 파일 경로
            String destinationFilePath = "/Users/vf20093/Desktop/Data/앙2.txt"; // 복사될 파일 경로

            // 파일 입력 및 출력을 위한 스트림 선언
            FileInputStream inputStream = null;
            FileOutputStream outputStream = null;

            try {
                // FileInputStream 객체 생성
                inputStream = new FileInputStream(sourceFilePath);
                // FileOutputStream 객체 생성
                outputStream = new FileOutputStream(destinationFilePath);

                // 버퍼를 생성하여 읽기 및 쓰기
                byte[] buffer = new byte[1024]; // 1KB 버퍼
                int bytesRead; // 읽은 바이트 수

                // 원본 파일에서 내용을 읽어와서 복사할 파일에 씀
                while ((bytesRead = inputStream.read(buffer)) != -1) { //내용이 끝나기 전까지 읽기.
                    outputStream.write(buffer, 0, bytesRead); // 읽은 바이트 수만큼 쓰기
                }
                System.out.println("File copied successfully!");
                inputStream.close();
                outputStream.close();
            } catch (Exception e) {
                System.out.println("An error occurred while copying the file.");
                e.printStackTrace();
            }
        }
    }


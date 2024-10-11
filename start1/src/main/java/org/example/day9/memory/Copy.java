package org.example.day9.memory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
    public static void main(String[] args) {
        // 원본 파일 경로
        String sourceFilePath = "/Users/vf20093/Desktop/Data/앙.txt"; // 복사할 원본 파일 경로
        // 복사된 파일 경로
        String destinationFilePath = "/Users/vf20093/Desktop/Data/앙2.txt"; // 복사될 파일 경로

        // Path 객체 생성
        Path sourcePath = Paths.get(sourceFilePath);
        Path destinationPath = Paths.get(destinationFilePath);

        try {
            // 파일 복사
            Files.copy(sourcePath, destinationPath);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}


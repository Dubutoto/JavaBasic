package org.example.day9.chracterFile;

import java.io.*;

public class ReadBuildFile {
    public static void main(String[] args) {
        long start = System.nanoTime();
        try {
            InputStream is = new FileInputStream("/Users/vf20093/Desktop/new_java/start1/build.gradle");
            Reader reader = new InputStreamReader(is);
            //버퍼에 다넣기위해
            BufferedReader br = new BufferedReader(reader);
            while (true) {
                String line = br.readLine(); //한줄씩
                if (line == null) {
                    break; //끝까지 다 읽어들이면 루프 탈출
                }
                System.out.println(line);
            }
            br.close(); //버퍼를 먼저 닫는것이 중요.
            is.close();
            reader.close();
        } catch (Exception e) {
           e.printStackTrace();
        }
        long end = System.nanoTime();
        long duration = end - start; //end 에서 start를 빼야함.
        System.out.println(duration);
    }
}

package org.example.day9.chracterFile;

import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        //파일 읽어오기(byte 단위 전송됨.)
        try {
            InputStream is = new FileInputStream("/Users/vf20093/Desktop/Data/앙.txt");
            Reader reader = new InputStreamReader(is);

            /* char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data,0,num);
            System.out.println(str); 캐릭터 단위로 읽음 */

            BufferedReader br = new BufferedReader(reader); //왕창 읽어들여서 버퍼에 다넣음
            while(true){
                String line = br.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
            is.close();
            reader.close();
            br.close();

        } catch (Exception e) {
            e.printStackTrace(); //자세히 에러정보를 프린트!
        }
    }
}

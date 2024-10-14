package org.example.day9.chracterFile;

import java.io.*;

public class ByteToCharStream {
    //글자를 써서, 파일에 저장하고 싶습니다.
    //FileWriter
    //글자를 써서, 네트워크로 전송해야한다.!!
    //네트워크 전송은 1바이트단위로 전송할 예정!
    //글자를 써서 바이트배열로 변환 후,
    //--> 바이트배열을 바이트스트림으로 저장!
    public static void main(String[] args) throws UnsupportedEncodingException {
        //파일에 쓰기(String --> byte 변환 저장)
        OutputStream os = null;
        try {
            os = new FileOutputStream("/Users/vf20093/Desktop/Data/data.txt");
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write("안녕!");
            writer.flush();
            writer.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace(); //자세히 에러정보를 프린트!
        }

        //파일 읽어오기(byte 단위 전송됨.)
        try {
            InputStream is = new FileInputStream("/Users/vf20093/Desktop/Data/data.txt");
            Reader reader = new InputStreamReader(is);
            char[] data = new char[100];
            int num = reader.read(data);
            String str = new String(data,0,num);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace(); //자세히 에러정보를 프린트!
        }
    }
}


// 이 파일 분석후 세부정리할것.

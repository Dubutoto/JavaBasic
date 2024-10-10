package org.example.day8.useclass;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteArray {
    public static void main(String[] args) {
        try{
            OutputStream os = new FileOutputStream("/Users/vf20093/Desktop/data/Arraydata.db");

            byte [] array = {10, 20 ,30};

            os.write(array); // 배열의 모든 바이트를 출력

            os.flush();
            os.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

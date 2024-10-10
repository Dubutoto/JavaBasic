package org.example.day8.useclass;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputS {
    public static void main(String[] args) {
        try {
        OutputStream os = new FileOutputStream("/Users/vf20093/Desktop/data/운동.txt");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();
            os.close();

        }
        catch (Exception e){
            e.printStackTrace(); //자세하게 프린트
        }
    }
}

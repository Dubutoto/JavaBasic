package org.example.day8.useclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadArray {
    public static void main(String[] args) {
        try{
            InputStream is = new FileInputStream("/Users/vf20093/Desktop/data/Arraydata.db");

            byte[] data = new byte[100];

            while(true){
                int num = is.read(data);
                if(num == -1)break;

                for(int i = 0; i<num;i++){
                    System.out.println(data[i]);
                }
            }

            is.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            
        }
    }
}

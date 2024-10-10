package org.example.day8.makeclass;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("/Users/vf20093/Desktop/jdk-17.0.2.jdk/Contents/Home/bin");
        // 슬러쉬는 하나 / 역슬러쉬는 두개 \\
        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        File[] list = file.listFiles();
        System.out.println(list.length);
        for (File f: list) {
            //확장자가 exe 인 경우만 프린트!
            String fileName = f.getName();
            if(fileName.endsWith(".exe")){
                System.out.println(fileName);
            }
            System.out.println(f.getPath());
            System.out.println(f.getParent());
            System.out.println(f.getAbsolutePath());

        }


        //list에 있는걸 f에 넣어라

        }
}

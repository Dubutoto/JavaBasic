package org.example.day15.문제풀이;

public class Box <X> {
    private X content;

    public void setContent(X content) {
        this.content = content;
    }

    public X getContent() {
        return content;
    }

    public static void main(String[] args) {
        // 정수를 저장하는 Box
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println("Integer Box: " + integerBox.getContent());

        // 문자열을 저장하는 Box
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        System.out.println("String Box: " + stringBox.getContent());
    }
}


package org.example.jdbc2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ProductVO {
    private int no;
    private String name;
    private String content;
    private int price;

//    @Override
//    public String toString() {
//        return "ProductVO{" +
//                "no=" + no +
//                ", name='" + name + '\'' +
//                ", content='" + content + '\'' +
//                ", price=" + price +
//                '}';
//    }
}

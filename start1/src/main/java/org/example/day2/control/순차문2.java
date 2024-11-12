
package org.example.day2.control;

import javax.swing.*;

public class 순차문2 { //Sequential steps2
    public static void main(String[] args) {
       String answer = "맑음";
       String answer2 = null;
        // 날씨가 어떄? 입력!
        answer2 = JOptionPane.showInputDialog("Input current weather");
        // 맑음과 같은지, 다른지 출력!
        System.out.println(answer.equals(answer2));
        JOptionPane.showMessageDialog(null,answer.equals(answer2));
        //str.equals();
        double temp = 20;  //온도
        double humid = 70; //습도

        //현재 온도와 습도를 입력받아
        String aTemp = null;
        String aHumid = null;
        aTemp = JOptionPane.showInputDialog("Input current temperature");
        aHumid = JOptionPane.showInputDialog("Input current humidity");

        // double parsedTemp = Double.parseDouble(aTemp);
        // double parsedHumid = Double.parseDouble(aHumid);

        System.out.println((Double.parseDouble(aTemp)>20.0d)&&(Double.parseDouble(aHumid)>70.0d));

        JOptionPane.showMessageDialog(null, (Double.parseDouble(aTemp)>20.0d)&&(Double.parseDouble(aHumid)>70.0d));
        //온도가 20도 보다 높고, 습도가 70보다 높은지 출력!
        //Double.parseDouble()이용

        //소숫점 뒷자리 처리

        double d = 3.147082093929319293129;
        System.out.println((int)d); //소숫점 뒷자리 소거해서 print 함
        System.out.printf("%.2f",d); //2자리까지 나옴

    }
}

import org.jsoup.Jsoup;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jsoup.connect("https://www.naver.com"); //try-catch 내장
        System.out.println("네이버에 원격 접속 성공!!");
    }
}
package org.example.day11.스태틱;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountManagement {
    public static void main(String[] args) {
        ArrayList<AccountData> accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // System.out.println(data1);

        while (true) {
            System.out.println("은행 계좌 관리 애플리케이션");
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 목록 보기");
            System.out.println("3. 계좌 정보 검색");
            System.out.println("4. 계좌 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴를 선택하세요: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("계좌 번호를 입력하세요: ");
                    int number = scanner.nextInt();
                    System.out.print("이름을 입력하세요: ");
                    String name = scanner.next();
                    System.out.print("금액을 입력하세요: ");
                    int balance = scanner.nextInt();
                    AccountData newAccount = new AccountData(number, name, (int) balance);
                    accounts.add(newAccount);
                    System.out.println("계좌가 생성되었습니다.");
                    break;
                case 2:
                    System.out.println("계좌 목록:");
                    for (AccountData account : accounts) {
                        System.out.println(account);
                    }
                    break;
                case 3:
                    System.out.print("검색할 계좌 번호를 입력하세요: ");
                    int searchNumber = scanner.nextInt();
                    boolean found = false;
                    for (AccountData account : accounts) {
                        if (account.number == searchNumber) {
                            System.out.println(account);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("해당 계좌 번호를 찾을 수 없습니다.");
                    }
                    break;
                case 4:
                    System.out.print("삭제할 계좌 번호를 입력하세요: ");
                    int deleteNumber = scanner.nextInt();
                    AccountData toRemove = null;
                    for (AccountData account : accounts) {
                        if (account.number == deleteNumber) {
                            toRemove = account;
                            break;
                        }
                    }
                    if (toRemove != null) {
                        accounts.remove(toRemove);
                        AccountData.count--;  // 계좌 수 감소
                        System.out.println("계좌가 삭제되었습니다.");
                    } else {
                        System.out.println("해당 계좌 번호를 찾을 수 없습니다.");
                    }
                    break;
                case 5:
                    System.out.println("EXIT");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR");
            }
        }
    }
}

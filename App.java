package calculator;

import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        do {
            // 사칙연산을 진행할지 원의 너비를 구할지 선택
            System.out.print("사칙연산 : 1 , 원의 넓이 : 2 ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("첫 번째 숫자 입력 : ");
                int FirstNumber = sc.nextInt();
                System.out.println("두 번째 숫자 입력 : ");
                int SecondNumber = sc.nextInt();
                System.out.println("사칙연산 기호 입력 : ");
                String A = sc.next();

                System.out.println("결과 : " + calculator.calculate(FirstNumber,SecondNumber,A));

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                if (sc.next().equals("remove")) {
                    calculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.next().equals("inquiry")) {
                    calculator.inquiryResult();
                }

            } else if (choice == 2) {
                System.out.println("원의 반지름 입력 : ");
                int half = sc.nextInt();
                System.out.println("결과 : " + calculator.calculateCircleArea(half));

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                if (sc.next().equals("inquiry")) {
                    calculator.inquiryCircleArea();
                }
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        } while (!sc.next().equals("exit"));

    }
}

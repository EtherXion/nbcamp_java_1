package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        int result = 0;

        do {

            System.out.println("첫 번째 숫자 입력 : ");
            int FirstNumber = sc.nextInt();
            System.out.println("첫 번째 숫자 입력 : ");
            int SecondNumber = sc.nextInt();
            System.out.println("사칙연산 기호 입력 : ");
            String A = sc.next();

            if (A.equals("+")) {
                result = FirstNumber + SecondNumber;
                queue.add(result);
            } else if (A.equals("-")) {
                result = FirstNumber - SecondNumber;
                queue.add(result);
            } else if (A.equals("*")) {
                result = FirstNumber * SecondNumber;
                queue.add(result);
            } else if (A.equals("/")) {
                result = FirstNumber / SecondNumber;
                queue.add(result);
            }

            System.out.println("결과 : " + result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.next().equals("remove")) {
                queue.remove();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.next().equals("inquiry")) {
                // forEach 사용
                for (Integer que : queue) {
                    System.out.println(que);
                }
            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) : ");
        } while (!sc.next().equals("exit"));

    }
}

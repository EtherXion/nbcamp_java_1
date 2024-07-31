package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */


    private Queue<Integer> queue = new LinkedList<>();
    private Queue<Double> queue2 = new LinkedList<>();

    public Queue<Integer> getQueue() {
        return new LinkedList<>(queue); // 그냥 return queue 보다 안전?
    }
    public void setQueue(Queue<Integer> queue) {
        this.queue = new LinkedList<>(queue);
    }
    public Queue<Double> getQueue2() {
        return new LinkedList<>(queue2); // 그냥 return queue 보다 안전?
    }
    public void setQueue2(Queue<Double> queque2) {
        this.queue2 = new LinkedList<>(queue2);
    }


    int result = 0;
    double circleresult = 0;

    // 연산
    public int calculate(int a, int b , String c) {
        /* 위 요구사항에 맞게 구현 */
        /* return 연산 결과 */

        if (c.equals("+")) {
            result = a + b;
            queue.add(result);
        } else if (c.equals("-")) {
            result = a - b;
            queue.add(result);
        } else if (c.equals("*")) {
            result = a * b;
            queue.add(result);
        } else if (c.equals("/")) {
            if (b == 0) {
                throw new ArithmeticException();
            } else {
                result = a / b;
                queue.add(result);
            }
        } else {
            throw new ArithmeticException();
        }

        return result;
    }

    // 데이터 삭제
    public void removeResult() {
        queue.remove();
    }

    // 데이터 조회
    public void inquiryResult() {
        for (Integer que : queue) {
            System.out.println(que);
        }
    }

    public double calculateCircleArea(int a) {
        circleresult = 3.14 * a * a;
        queue2.add(circleresult);
        return circleresult;
    }

    public void inquiryCircleArea() {
        for (Double que2 : queue2) {
            System.out.println(que2);
        }
    }

}

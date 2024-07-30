package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */


    private Queue<Integer> queue = new LinkedList<>();

    public Queue<Integer> getQueue() {
        return new LinkedList<>(queue); // 그냥 return queue 보다 안전?
    }
    public void setQueue(Queue<Integer> queue) {
        this.queue = new LinkedList<>(queue);
    }


    int result = 0;

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
}

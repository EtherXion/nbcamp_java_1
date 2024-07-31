package calculator;

import java.util.LinkedList;
import java.util.Queue;

public class CircleCalculator {

    private Queue<Double> queue2 = new LinkedList<>();
    public Queue<Double> getQueue2() {
        return new LinkedList<>(queue2); // 그냥 return queue 보다 안전?
    }
    public void setQueue2(Queue<Double> queque2) {
        this.queue2 = new LinkedList<>(queue2);
    }

    double circleresult = 0;

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

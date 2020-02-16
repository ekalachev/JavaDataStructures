import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        int removed = queue.remove();
        System.out.println("Was removed: " + removed);

        int top = queue.peek();
        System.out.println("The top of the queue: " + top);

        System.out.println(queue);
    }
}

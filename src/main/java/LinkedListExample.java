import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();
        states.add("Alabama"); // O(1)
        states.add("Alaska"); // O(1)
        states.add("California"); // O(1)
        states.add("Colorado"); // O(1)
        states.add("Connecticut"); // O(1)
        states.addFirst("Arizona"); // O(1)

        System.out.println(states); // [Arizona, Alabama, Alaska, California, Colorado, Connecticut]

        System.out.println(states.getLast()); // Connecticut
        System.out.println(states.getFirst()); // Arizona

        ListIterator listIterator = states.listIterator(states.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        // Connecticut
        // Colorado
        // California
        // Alaska
        // Alabama
        // Arizona

        states.contains("California"); // O(n)
        states.indexOf("California"); // O(n)
    }
}

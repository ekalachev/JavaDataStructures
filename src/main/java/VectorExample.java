import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Vector is very similar to the behavior of an ArrayList.
        // One of the early benefits of the vectors, was that they provided automatic synchronization
        // which made them threat safe. Vector by necessity takes a worst case approach to synchronization
        // which causes its performance to suffer.

        // Vectors are not in wide use now. Most people use ArrayList.

        Vector<String> states = new Vector();

        states.add("Alabama"); // O(1)
        states.add("Alaska"); // O(1)
        states.add("California"); // O(1)
        states.add("Colorado"); // O(1)
        states.add("Connecticut"); // O(1)
        states.add(0, "Arizona"); // O(n)
        states.add(3, "Virginia"); // O(n)

        System.out.println(states); // [Arizona, Alabama, Alaska, Virginia, California, Colorado, Connecticut]
    }
}

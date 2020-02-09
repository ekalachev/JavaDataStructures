import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IterableInterface {
    public static void main(String[] args) {
        Collection collection = Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet");
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

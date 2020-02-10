import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> games = new ArrayList<>();
        games.add("game 1"); // time complexity O(1)
        games.add("game 2"); // time complexity O(1)
        games.add(0, "game 3"); // time complexity O(n)

        System.out.println(games); // will return [game 3, game 1, game 2]
    }
}
import java.util.*;


public class Driver {
    public static void main(String[] args) {

        HashMap<String, Integer> items = new HashMap<>();
        items.put("a", 1);

        List<Monster> monsters = new ArrayList<>();

        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5 , items));

        for (Monster monster : monsters) {
            System.out.println(monster);
        }


    }
}

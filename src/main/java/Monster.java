
import java.util.*;

public abstract class  Monster {

    private  final Integer hp;
    private  final Integer xp;
    private  final Integer maxHp;

   private HashMap<String, Integer> items = new HashMap<>();

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.items = items;
        this.xp = xp;
    }

    public Integer getHp() {

        return hp;
    }

    public Integer getXp() {

        return xp;
    }

    public Integer getMaxHp() {

        return maxHp;
    }

    public HashMap<String, Integer>getItems() {

        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Monster monster)) return false;
        return Objects.equals(hp, monster.hp) &&
                Objects.equals(xp, monster.xp) &&
                Objects.equals(maxHp, monster.maxHp) &&
                Objects.equals(items, monster.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(hp, xp, maxHp, items);

    }
    @Override
    public String toString() {

        return "hp = " + getHp() + "/" + getMaxHp();

    }






}


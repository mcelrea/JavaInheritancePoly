import java.util.ArrayList;

public class Main {

    static ArrayList<Entity> entities = new ArrayList();

    public static void main(String[] args) {
        createEntities();
        printEntities();
    }

    public static void createEntities() {
        entities.add(new Entity(50,50,"Tree"));
        entities.add(new Entity(500,462,"Tree"));
        entities.add(new Entity(652,34,"Rock"));
    }

    public static void printEntities() {
        for(Entity e: entities) {
            System.out.println(e);
        }
    }
}

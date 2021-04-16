
import java.util.ArrayList;

public class Main {

    static ArrayList<Entity> entities = new ArrayList();
    static ArrayList<Enemy> enemies = new ArrayList();

    public static void main(String[] args) {
        //createEntities();
        //printEntities();

        createEnemies();
        enemiesAttack();
    }

    public static void enemiesAttack() {
        for(Enemy temp: enemies) {
            temp.attack();
        }
    }

    public static void createEnemies() {
        enemies.add(new Enemy(10,10,"E1",1,1,1));
        enemies.add(new Skeleton(130,10,"S1",7,3,1));
        enemies.add(new Zombie(105,103,"Z1",10,2,2));
        enemies.add(new Skeleton(150,510,"S2",6,2,2));
        enemies.add(new Zombie(110,140,"Z2",3,10,2));
        enemies.add(new Skeleton(130,710,"S3",1,1,1));
        enemies.add(new GiantRat(130,710,"S3",1,1,1));
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

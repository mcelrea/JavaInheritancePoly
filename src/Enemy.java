public class Enemy extends Entity {

    //additional fields
    private int hp;
    private int strength;
    private int intelligence;

    public Enemy(int x, int y, String name,
                 int hp, int strength, int intelligence) {
        super(x,y,name);
        this.hp = hp;
        this.strength = strength;
        this.intelligence = intelligence;
    }
}

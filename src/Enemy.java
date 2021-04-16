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

    public void attack() {
        System.out.println(name + " attacks you for 1 damage");
    }

    //overriden method
    public String toString() {
        return "(ENEMY)" + name + " at (" + x + "," + y + ")";
    }
}

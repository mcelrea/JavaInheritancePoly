public class Skeleton extends Enemy {

    public Skeleton(int x, int y, String name,
                    int hp, int strength, int intelligence) {
        super(x, y, name, hp, strength, intelligence);
    }

    public void attack() {
        System.out.println(name + " slaps you with a bony hand for 5 points of damage!");
    }

    //OVERLOADED METHOD - it adds another version of attack
    //with a different signature
    public void attack(int x) {
        System.out.println(name + " stabs you with a sword for " + x + " points of damage");
    }
}

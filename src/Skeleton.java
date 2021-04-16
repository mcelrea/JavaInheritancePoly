public class Skeleton extends Enemy {

    public Skeleton(int x, int y, String name,
                    int hp, int strength, int intelligence) {
        super(x, y, name, hp, strength, intelligence);
    }

    public void attack() {
        System.out.println(name + " slaps you with a bony hand for 5 points of damage!");
    }
}

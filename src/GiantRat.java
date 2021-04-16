public class GiantRat extends Enemy {

    public GiantRat(int x, int y, String name,
                  int hp, int strength, int intelligence) {
        super(x, y, name, hp, strength, intelligence);
    }

    public void attack() {
        System.out.println(name + " licks you for 1 point of damage...duh...posion lick");
    }
}

public class Zombie extends Enemy {

    public Zombie(int x, int y, String name,
                    int hp, int strength, int intelligence) {
        super(x, y, name, hp, strength, intelligence);
    }

    public void attack() {
        System.out.println(name + " kicks you with a slimy foot...ewwww....2 points of damage");
    }
}

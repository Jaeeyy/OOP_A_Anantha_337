package CodelabM3;

public class Enemy extends GameCharacter {
    public Enemy(String Name, int Health)  {
        super(Name, Health);
    }

    @Override
    public void attack(GameCharacter target ) {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";

        System.out.println( green+ getName() +reset+ " attack " +yellow+ target.getName()  +reset+   " using Orbital Strike!");
        target.setHealth(target.getHealth() - 20);
        System.out.println(yellow+ target.getName() +reset+ " Now Has " +red+ target.getHealth() +reset+ " Health");
        System.out.println("---------------------------------------------------");
    }
}

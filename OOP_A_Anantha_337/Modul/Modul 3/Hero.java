package CodelabM3;

public class Hero extends GameCharacter {
    public Hero(String Name, int Health)  {
        super(Name, Health);
    }

    @Override
    public void attack(GameCharacter target ) {
        String red = "\u001B[31m";
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";
        String green = "\u001B[32m";


        System.out.println(yellow +getName() +reset + " attack " +green + target.getName() +reset+ " using Snake Bite!");
        target.setHealth(target.getHealth() - 15);
        System.out.println(green +target.getName()+ reset + " Now Has " +red+ target.getHealth() +reset+ " Health");
        System.out.println("---------------------------------------------------");
    }
}

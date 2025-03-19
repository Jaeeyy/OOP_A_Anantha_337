package CodelabM3;

public class Main {
    public static void main(String[] args) {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String reset = "\u001B[0m";
        String yellow = "\u001B[33m";

        GameCharacter GeneralCharacter = new GameCharacter("General Character", 100);
        Hero hero = new Hero("Brimstone", 150);
        Enemy enemy = new Enemy("Viper", 200);

        System.out.println("=======Initial Status=========");
        System.out.println(yellow+ "Brimstone" +reset+ " has health: " +red+ hero.getHealth() +reset+" HP");
        System.out.println(green+ "Viper" +reset+ " has health: " +red+ enemy.getHealth() +reset+" HP");
        System.out.println();
        System.out.println("------------------------------------");

        hero.attack(enemy);
        enemy.attack(hero);
    }


}
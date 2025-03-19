package CodelabM3;

public class GameCharacter {
    private String Name;
    private int Health;

    public GameCharacter(String name, int health) {
        this.Name = name;
        this.Health = health;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public void attack(GameCharacter target) {}
}

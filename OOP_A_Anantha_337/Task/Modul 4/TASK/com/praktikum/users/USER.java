package TASK.com.praktikum.users;

public abstract class USER {
    public String username; 
    public String password;

    public USER(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public abstract void displayappmenu();
}

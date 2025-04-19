package Task1M3;


public class AdminClass extends UserClass{
    String username;
    String password;



    public AdminClass(String name, String student_ID,String username, String password) {
        super(name, student_ID);
        this.username = username;
        this.password = password;
    }

    @Override
    public void Login() {
        if(username.equals("Admin337") && password.equals("password337")) {
            System.out.println("=== Login Successful ===");
            System.out.println();
        }else{
            System.out.println("=== Login Failed ===");
        }
    }

    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("=== Login Successful ===");
    }
}






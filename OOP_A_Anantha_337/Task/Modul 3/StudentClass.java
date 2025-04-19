package Task1M3;

public class StudentClass extends UserClass{ //inheritance
    private String namaUser = ("Budi Anantha");
   public StudentClass(String name, String student_ID) {
       super(name, student_ID);
   }


   @Override
    public void Login() {
       super.Login();
       if(getName().equals(namaUser) && getStudent_ID().equals("202410370110337")){
           System.out.println("=== Logged in ===");
           System.out.println();
           displayinfo();

       }else{
           System.out.println("=== Not logged in ===");

       }
   }
    @Override
    public void displayinfo(){
        super.displayinfo();
        System.out.println("=== Login Success ===");
    }
}

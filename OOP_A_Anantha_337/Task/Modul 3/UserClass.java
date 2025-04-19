package Task1M3;

public class UserClass {
    private String Name;  //encapsulated private
    private String student_ID;

    public UserClass(String name, String student_ID) {
        this.setName(name);
        this.setStudent_ID(student_ID);
    }

    public String getName() { //agar bisa mengakses ecapsulated
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(String student_ID) {
        this.student_ID = student_ID;
    }




    public void Login(){}


    public void displayinfo(){
        System.out.println("Name: " + Name);
        System.out.println("Student ID: " + student_ID);
    }
}

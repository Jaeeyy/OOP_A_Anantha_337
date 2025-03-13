import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan Login (1-2) :");
        int pilihan = input.nextInt();
        input.nextLine();

        Admin UserAdmin = new Admin();
        Student UserStudent = new Student();

        UserAdmin.NamaAdmin = "Admin337";
        UserStudent.Namasiswa= "Budi Anantha Trikurnia Irawan";

        UserAdmin.PasswordAdmin = "password337";
        UserStudent.NIM = "202410370110337";



        if (pilihan == 1) {
            while (true){
            UserAdmin.displayInfo();}
        } else if (pilihan == 2) {
            while (true){
            UserStudent.StudentLogin();}
        }else{
            System.out.println("Pilihan tidak valid");
        }


    }
}

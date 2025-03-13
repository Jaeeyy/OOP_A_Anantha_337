import java.util.Scanner;

public class Admin {
    Scanner admin = new Scanner(System.in);
        String NamaAdmin;
        String PasswordAdmin;
        String inputAdmin;
        String passAdmin;

        void displayInfo() {
            System.out.print("Masukkan User Admin : ");
            inputAdmin = admin.nextLine();
            System.out.print("Masukkan Password Admin : ");
            passAdmin = admin.nextLine();


            if (inputAdmin.equals(NamaAdmin) && passAdmin.equals(PasswordAdmin)) {
                System.out.println("Login Berhasil");
                System.out.println("Selamat Datang Admin");
                System.out.println("");
                System.exit(0);

            } else {
                System.out.println("Login Gagal");
                System.out.println("Username atau Password Salah");
                System.out.println("");
            }
        }
}

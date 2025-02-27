import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner pop = new Scanner(System.in);

        String username;
        String Password;
        String NIM;

        //Pilihan Login
        System.out.println("Pilihan Login");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan Login (1-2) :");
        int pilihan = pop.nextInt();
        pop.nextLine();

        //Type of Login
        if (pilihan == 1) {
           while (true) {
               System.out.print("Masukkan Username Admin :");
               username = pop.nextLine();
               System.out.print("Masukkan Password Admin :");
               Password = pop.nextLine();

               //Login Admin
               if (username.equals("Admin337") && Password.equals("password337")) {
                   System.out.println("Login Berhasil");
                   System.out.println("Selamat Datang Admin");
                   break;
               } else {
                   System.out.println("Login Gagal");
                   System.out.println("Username atau Password Salah");
               }
           }


        } else if (pilihan == 2) {
            while (true) {
                System.out.print("Login Username Mahasiswa :");
                username = pop.nextLine();
                System.out.print("Masukkan NIM Mahasiswa :");
                NIM = pop.nextLine();

                //Login Mahasiswa
                if (username.equals("Budi Anantha Trikurnia Irawan") && NIM.equals("202410370110337")) {
                    System.out.println("Login Berhasil");
                    System.out.println("Selamat Datang Mahasiswa");
                    System.out.println("Nama :"+ username);
                    System.out.println("NIM :"+ NIM);
                    break;
                }else{
                    System.out.println("Login Gagal");
                    System.out.println("Username atau NIM Salah");
                    System.out.print("\n");
                }
            }
            
        } else {
            System.out.println("Bruh..");
        }
    }
}

import java.util.Scanner;

public class Student {
        Scanner student = new Scanner(System.in);
        String Namasiswa;
        String NIM;
        String InputSiswa;
        String InputNIM;

        void StudentLogin() {
            System.out.print("Masukkan Nama Mahasiswa : ");
            InputSiswa = student.nextLine();
            System.out.print("Masukkan NIM Mahasiswa : ");
            InputNIM = student.nextLine();


            if (InputSiswa.equals(Namasiswa) && InputNIM.equals(NIM)) {
                System.out.println("Login Berhasil");
                System.out.println("Selamat Datang");
                System.out.println("");
                DisplayInfo();
                System.exit(0);
            } else {
                System.out.println("Login Gagal");
                System.out.println("Username atau Password Salah");
            }
        }

        void  DisplayInfo(){
            System.out.println("===DATA MAHASISWA===");
            System.out.println("Namasiswa = " + Namasiswa);
            System.out.println("NIM = " + NIM);
        }
}

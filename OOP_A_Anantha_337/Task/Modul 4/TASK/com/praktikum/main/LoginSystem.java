package TASK.com.praktikum.main;
import TASK.com.praktikum.users.*;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner pop = new Scanner (System.in);


        System.out.println("=== Selamat Datang di Sistem Laporan Barang Hilang ===");
        System.out.println("Silakan login untuk melanjutkan.");

        System.out.print("1. Admin\n2. Mahasiswa\nPilih jenis user (1/2): ");
        int pilihan = pop.nextInt();
        pop.nextLine(); 
        if (pilihan == 1) {
            USER admin = new ADMIN("admin", "admin123");
            System.out.print("Username: ");
            String username = pop.nextLine();
            System.out.print("Password: ");
            String password = pop.nextLine();
            if (username.equals(admin.username) && password.equals(admin.password)) {
                System.out.println("Login berhasil!");
                admin.displayappmenu();
            } else {
                System.out.println("Username atau password salah.");
            }
        } else if (pilihan == 2) {
            USER mahasiswa = new MAHASISWA("Budi Anantha", "337");
            System.out.print("Username: ");
            String username = pop.nextLine();
            System.out.print("Password: ");
            String password = pop.nextLine();
            if (username.equals(mahasiswa.username) && password.equals(mahasiswa.password)) {
                System.out.println("Login berhasil!");
                mahasiswa.displayappmenu();
            } else {
                System.out.println("Username atau password salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
    
        


    }


}

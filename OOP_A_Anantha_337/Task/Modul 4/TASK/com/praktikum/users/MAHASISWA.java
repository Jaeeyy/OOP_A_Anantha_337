package TASK.com.praktikum.users;
import TASK.com.praktikum.action.MahasiswaAction;
import java.util.Scanner;

public class MAHASISWA extends USER implements MahasiswaAction {
    String username;
    String password;

    public MAHASISWA(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }
    
    @Override
    public void reportItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama barang yang ingin dilaporkan: ");
        String itemName = scanner.nextLine();
        System.out.println("Masukkan deskripsi barang: ");
        String itemDescription = scanner.nextLine();
        System.out.println("Masukkan lokasi barang: ");
        String itemLocation = scanner.nextLine();
        System.out.println("Item dilaporkan.");
    }
        
    @Override
    public void viewreporteditem() {
        System.out.println("Fitur ini masih belum tersedia...");
    }

    @Override
    public void displayappmenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menu Aplikasi ===");
        System.out.println("1. Laporkan Barang Hilang");
        System.out.println("2. Lihat Daftar Laporan");
        System.out.println("3. Logout");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                reportItem();
                break;
            case 2:
                viewreporteditem();
                break;
            case 3:
                System.out.println("Logout successful!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}

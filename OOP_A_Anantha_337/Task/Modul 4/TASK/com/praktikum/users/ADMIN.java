package TASK.com.praktikum.users;
import TASK.com.praktikum.action.AdminAction;
import java.util.Scanner;

public class ADMIN extends USER implements AdminAction {
    String username;
    String password;

    public ADMIN(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public void manageItem() {
        System.out.println("Fitur ini masih belum tersedia...");
    }

    @Override
    public void ManageUser() {
        System.out.println("Fitur ini masih belum tersedia...");
    }

    @Override
    public void displayappmenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menu Aplikasi ===");
        System.out.println("1. Kelola Laporan Barang");
        System.out.println("2. Kelola Data Mahasiswa");
        System.out.println("3. Logout");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                manageItem();
                break;
            case 2:
                ManageUser();
                break;
            case 3:
                System.out.println("Logout successful!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

}

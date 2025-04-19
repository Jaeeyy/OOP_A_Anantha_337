package Task1M3;

import java.util.Scanner;

public class LoginSysClass{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Pilihan Login
        System.out.println("=== WELCOME TO LOGIN SYSTEM ===");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Please Choose an option (1-2) :");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                System.out.println("=== ADMIN LOGIN ===");
                System.out.print("Username: ");
                String username = input.nextLine();
                System.out.print("Password: ");
                String password = input.nextLine();

                AdminClass admin = new AdminClass("", "", username, password);
                admin.Login();
                break;

            case 2:
                System.out.println("=== MAHASISA LOGIN ===");
                System.out.print("Student Name: ");
                String name = input.nextLine();
                System.out.print("Student ID: ");
                String id = input.nextLine();

                StudentClass student = new StudentClass(name, id);
                student.Login();
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
    }
}


import java.util.Scanner;
import java.time.LocalDate;

public class Codelab1 {

    public static void main(String[] args) {
        String nama;
        String kelaminn;
        int tahun_lahir;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        nama = input.nextLine();

        System.out.print("Masukkan kelamin Anda(L/P): ");
        kelaminn = input.next().toLowerCase();
        switch (kelaminn) {
            case "l":
                kelaminn = "Laki-Laki";
                break;
            case "p":
                kelaminn = "Perempuan";
                break;
            default:
                kelaminn = "Tidak Ada";
                break;
        }

        System.out.print("Masukkan tahun lahir Anda: ");
        tahun_lahir = input.nextInt();
        tahun_lahir = LocalDate.now().getYear() - tahun_lahir;
        System.out.print("\n\n");

        System.out.println("Data DIRI");
        System.out.println("Nama anda : " + nama);
        System.out.println("Kelamin anda : " + kelaminn);
        System.out.println("Umur anda :" + tahun_lahir);

    }
}

package PBOM5.CL;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ManajemenStok {
    private static ArrayList<Barang> daftarBarang = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Pensil", 50));
        daftarBarang.add(new Barang("Buku", 30));
        daftarBarang.add(new Barang("Penghapus", 20));
        
        boolean running = true;
        while (running) {
            try {
                System.out.println("\n==== Menu Manajemen Stok ====");
                System.out.println("1. Tambah Barang Baru");
                System.out.println("2. Tampilkan Semua Barang");
                System.out.println("3. Kurangi Stok Barang");
                System.out.println("4. Keluar");
                System.out.print("Pilih opsi: ");
                
                int pilihan = scanner.nextInt();
                scanner.nextLine();
                
                switch (pilihan) {
                    case 1:
                        tambahBarang();
                        break;
                    case 2:
                        tampilkanDaftarBarang();
                        break;
                    case 3:
                        kurangiStok();
                        break;
                    case 4:
                        running = false;
                        System.out.println("Terima kasih! Program berakhir.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Masukkan angka.");
                scanner.nextLine(); 
            }
        }
        
        scanner.close();
    }
    
    public static void tampilkanDaftarBarang() {
        System.out.println("===== Daftar Barang =====");
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang yang tersedia.");
            return;
        } else {
            Iterator<Barang> iterator = daftarBarang.iterator();
            int index = 1;
         while (iterator.hasNext()) {
            Barang barang = iterator.next();
            System.out.println(index + ". " + barang.getNama() + " - Stok: " + barang.getStok());
            index++;
            }
        }
    }
    
    public static void tambahBarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Penambahan Stok Barang =====");
        System.out.print("Masukkan nama barang: ");
        String namaBarang = scanner.nextLine();
        System.out.print("Masukkan Jumlah Stok Barang: ");
        try {
            int jumlahStok = scanner.nextInt();
            scanner.nextLine(); 
            
            if (jumlahStok <= 0) {
                System.out.println("Jumlah stok harus lebih dari 0.");
                return;
            }
            
            daftarBarang.add(new Barang(namaBarang, jumlahStok));
            System.out.println("Barang '" + namaBarang + "' berhasil ditambahkan dengan stok " + jumlahStok);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan masukkan angka untuk jumlah stok.");
            scanner.nextLine(); 
        }
    }
    
    public static void kurangiStok() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===== Pengurangan Stok Barang =====");
        if (daftarBarang.isEmpty()) {
            System.out.println("Tidak ada barang yang tersedia.");
            return;
        }
        
        tampilkanDaftarBarang();
        
        System.out.print("Masukkan nomor indeks barang yang akan dikurangi stoknya: ");
        try {
            int indeksBarang = scanner.nextInt();
            scanner.nextLine();
            
            if (indeksBarang < 1 || indeksBarang > daftarBarang.size()) {
                System.out.println("Indeks barang tidak valid.");
                return; 
            }
            
            Barang barang = daftarBarang.get(indeksBarang - 1);
            System.out.print("Masukkan jumlah stok yang akan dikurangi: ");
            int jumlahKurang = scanner.nextInt();
            scanner.nextLine(); 
            
            if (jumlahKurang <= 0) {
                System.out.println("Jumlah stok yang akan dikurangi harus lebih dari 0.");
                return; 
            }
            
            int stokSaatIni = barang.getStok();
            if (jumlahKurang > stokSaatIni) {
                throw new StokBarangTidakCukupException("Stok " + barang.getNama() + " tidak cukup. Stok saat ini: " + stokSaatIni);
            } else {
                barang.setStok(stokSaatIni - jumlahKurang);
                System.out.println("Stok barang '" + barang.getNama() + "' berhasil dikurangi. Sisa stok: " + barang.getStok());
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan masukkan angka.");
            scanner.nextLine();
        } catch (StokBarangTidakCukupException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Indeks barang tidak valid: " + e.getMessage());
        }
    }
}   
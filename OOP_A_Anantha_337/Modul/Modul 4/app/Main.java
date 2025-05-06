package app;
import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        
        Buku fiksi = new Fiksi("Harry Potter", "J.K. Rowling", "Fantasi");
        Buku nonfiksi = new NonFiksi("Sapiens", "Yuval Noah Harari", "Sejarah");
        
        Anggota anggota1 = new Anggota("Budi", "337");
        Anggota anggota2 = new Anggota("rakki", "382");

        fiksi.DisplayInfo();
        nonfiksi.DisplayInfo();

        anggota1.DisplayInfo();
        anggota2.DisplayInfo();

        anggota1.pinjamBuku(fiksi.judul, 7);
        anggota1.kembalikanBuku(fiksi.judul);

        anggota2.pinjamBuku(nonfiksi.judul, 10);
        anggota2.kembalikanBuku(nonfiksi.judul);

    }
}

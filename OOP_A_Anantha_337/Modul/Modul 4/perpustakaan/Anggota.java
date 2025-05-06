package perpustakaan;

public class Anggota implements Peminjaman {
    String nama;
    String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }
    public void DisplayInfo() {
        System.out.println("Anggota: " + nama +" (ID: " + idAnggota+")");
        
    }

    @Override
    public void pinjamBuku(String judul, int durasi) {
        System.out.println();
        System.out.println(nama + " meminjam buku berjudul: " + judul);
        System.out.println(nama + " meminjam buku " + judul + " selama " + durasi + " hari.");
        System.out.println();
    }

    @Override
    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
        System.out.println();
    }

}

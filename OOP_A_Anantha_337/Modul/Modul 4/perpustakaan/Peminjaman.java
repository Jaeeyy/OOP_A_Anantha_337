package perpustakaan;

public interface Peminjaman {
    void pinjamBuku(String judul, int durasi);
    void kembalikanBuku(String judul);

}
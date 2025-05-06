package perpustakaan;

public class NonFiksi extends Buku {
    String bidang;

    public NonFiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Bidang: " + bidang);
        System.out.println();
    }
}

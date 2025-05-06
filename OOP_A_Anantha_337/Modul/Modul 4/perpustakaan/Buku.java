package perpustakaan;


public abstract class Buku {
    public String judul; 
    String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
   
    public abstract void DisplayInfo();

}

package perpustakaan;

public class Fiksi extends Buku {
    String genre;

    public Fiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    
    @Override
    public void DisplayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Genre: " + genre);
        System.out.println();
    }

}

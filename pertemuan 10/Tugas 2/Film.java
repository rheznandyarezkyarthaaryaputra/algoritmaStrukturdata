public class Film {
    public int id;
    public String judul;
    public double rating;
    public Film next;
    public Film prev;

    public Film(int id, String judul, double rating) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}
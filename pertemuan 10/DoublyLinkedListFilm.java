public class DoublyLinkedListFilm {
    private Film head;
    private Film tail;

    public void tambahDataAwal(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (head == null) {
            head = newFilm;
            tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
    }

    public void tambahDataAkhir(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (tail == null) {
            head = newFilm;
            tail = newFilm;
        } else {
            newFilm.prev = tail;
            tail.next = newFilm;
            tail = newFilm;
        }
    }

    public void tambahDataIndex(int id, String judul, double rating, int index) {
        Film newFilm = new Film(id, judul, rating);
        Film current = head;
        int counter = 1;
        while (current != null && counter < index - 1) {
            current = current.next;
            counter++;
        }
        if (current == null) {
            System.out.println("Index tidak valid");
        } else {
            newFilm.next = current.next;
            newFilm.prev = current;
            if (current.next != null) {
                current.next.prev = newFilm;
            }
            current.next = newFilm;
        }
    }

    public void hapusDataPertama() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void hapusDataTerakhir() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        }
    }

    public void hapusDataTertentu(int id) {
        Film current = head;
        while (current != null && current.id != id) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("ID Film tidak ditemukan");
        } else {
            if (current.prev != null) {
                current.prev.next = current.next;
            } else {
                head = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            } else {
                tail = current.prev;
            }
        }
    }

    public void cetakData() {
        Film current = head;
        System.out.println("====================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("====================");
        int index = 1;
        while (current != null) {
            System.out.println("ID: " + current.id);
            System.out.println("Judul Film: " + current.judul);
            System.out.println("Rating Film: " + current.rating);
            current = current.next;
            index++;
        }
    }

    public void cariData(int id) {
        Film current = head;
        int index = 1;
        while (current != null && current.id != id) {
            current = current.next;
            index++;
        }
        if (current == null) {
            System.out.println("ID Film tidak ditemukan");
        } else {
            System.out.println("Data ID Film: " + id + " berada di node ke-" + index);
            System.out.println("IDENTITAS:");
            System.out.println("ID Film: " + current.id);
            System.out.println("Judul Film: " + current.judul);
            System.out.println("IMDB Rating: " + current.rating);
        }
    }

    public void urutDataRatingDesc() {
        Film current = head;
        while (current != null) {
            Film nextFilm = current.next;
            while (nextFilm != null) {
                if (current.rating < nextFilm.rating) {
                    double tempRating = current.rating;
                    current.rating = nextFilm.rating;
                    nextFilm.rating = tempRating;

                    int tempId = current.id;
                    current.id = nextFilm.id;
                    nextFilm.id = tempId;

                    String tempJudul = current.judul;
                    current.judul = nextFilm.judul;
                    nextFilm.judul = tempJudul;
                }
                nextFilm = nextFilm.next;
            }
            current = current.next;
        }
    }
}
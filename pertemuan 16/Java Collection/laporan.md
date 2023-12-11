nama:rheznandya rezky artha arya putra
kelas:2C SIB

Langkah Pratikum 1
-Buatlah sebuah class ContohList yang main methode berisi kode program seperti di bawah ini.
-Tambahkan kode program untuk menggunakan collection dengan aturan penulisan kode program seperti berikut.
-Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.
<img src="Screenshot (1196)-1.png">
*Pertanyaan*
-Pada potongan kode pertama, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
Di Java, ArrayList adalah bagian dari Java Collections Framework dan menggunakan elemen generik sehingga dapat menyimpan berbagai jenis data.
 Generik memungkinkan Anda menentukan tipe data yang dapat ditampung oleh ArrayList.
 Dalam kode yang Anda berikan, ArrayList diinisialisasi dengan tipe Elemen, yang merupakan kelas yang  Anda tetapkan.Ini berarti bahwa ArrayList dapat berisi objek apa pun yang merupakan turunan dari kelas Elemen atau subkelasnya.Saat Anda mendeklarasikan "ArrayList" Anda memberi tahu Java bahwa "ArrayList" ini hanya berisi objek bertipe kelas "Elemen".Hal ini memastikan keamanan tipe  waktu kompilasi dan memungkinkan Anda mendeteksi kesalahan tipe data  sebelum program Anda dijalankan.Obat generik juga memiliki manfaat lain.
 Karena tipe objek sudah diketahui, tidak perlu mengonversi objek saat mengambilnya dari ArrayList.


-Modifikasi potongan kode pertama sehingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
<img src="Screenshot (1197).png">
-Ubah kode pada baris 1 potongan kode ke-2 menjadi LinkedList<String> names = new LinkedList<>();
<img src="Screenshot (1198).png">
-Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
<img src="Screenshot (1199).png">
-Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
Kode ini menginisialisasi LinkedList dari sebuah string dan menambahkan beberapa nama ke dalamnya.
 Saat Anda menjalankan kode, kode tersebut  akan mencetak "Menggunakan LinkedList: " diikuti dengan daftar nama yang  ditambahkan ke  LinkedList.
 Perbedaan utama antara LinkedList dan ArrayList yang  Anda lihat di output adalah performa saat menambahkan dan menghapus elemen dari LinkedList dapat bervariasi.
 Namun, ini tidak muncul di output, hanya bagaimana daftar tersebut dikelola di memori dan saat runtime.


Langkah Praktikum 2
-Buatlah class dengan nama LoopCollection serta tambahkan method main yang isinya adalah sebagai berikut.
-Tambahkan potongan kode berikut ini dari yang sebelumnya agar proses menampilkan elemen pada sebuah stack bervariasi.
-Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.
<img src="Screenshot (1202).png">

*Pertanyaan*
-Apakah perbedaan fungsi push() dan add() pada objek fruits?
-Silakan hilangkan baris ke-1 dan ke-2 pada potongan kode kedua, apakah yang akan terjadi? Mengapa bisa demikian?
Menghapus pernyataan import ini akan menyebabkan kesalahan kompilasi karena kompiler tidak dapat menemukan definisi untuk ArrayList dan metode statis dalam koleksi yang Anda gunakan dalam kode Anda.
-Jelaskan fungsi dari baris ke-6 dan ke-9 pada potongan kode kedua?
   1.Baris ke-6 dari potongan kode tersebut:
    Baris ini mendeklarasikan dan menginisialisasi sebuah List dengan tipe String dan menginstansiasinya sebagai ArrayList<String>. List adalah sebuah interface, dan ArrayList adalah implementasi konkret dari interface tersebut yang menggunakan array dinamis. Kode ini menyiapkan fruits sebagai koleksi yang dapat menyimpan sekumpulan objek String.
   2.Baris ke-9 dari potongan kode tersebut:
     Baris ini memanfaatkan metode addAll dari kelas utilitas Collections untuk menambahkan beberapa elemen ke dalam List yang telah dideklarasikan. Metode ini mengambil List (fruits) sebagai argumen pertama dan elemen-elemen yang akan ditambahkan sebagai argumen berikutnya. Ini adalah cara yang ringkas untuk menambahkan beberapa elemen ke dalam List tanpa harus menambahkannya satu per satu menggunakan metode add.

-Silakan ganti baris kode ke-1 padda potongan kode pertama, Stack menjadi List dan apakah yang terjadi? Mengapa bisa demikian?
Jika Anda mengganti `ArrayList` dengan `Stack` di baris pertama kode tersebut, `fruits` akan menjadi sebuah `Stack` bukan `ArrayList`. `Stack` adalah struktur data LIFO (last-in, first-out), yang berbeda dengan `ArrayList` yang memungkinkan akses acak ke elemen-elemennya. Anda juga akan perlu mengganti metode seperti `Collections.addAll` dan `Collections.reverse`, karena `Stack` tidak mendukung metode-metode ini secara langsung. Kode tersebut tidak akan berfungsi seperti sebelumnya tanpa modifikasi lebih lanjut.
-Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
<img src="Screenshot (1203).png">
-Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
<img src="Screenshot (1204).png">
Langkah Praktikum 3
-Buatlah sebuah class Mahasiswa dengan attribute, kontruktor, dan fungsi sebagai berikut.
-Selanjutnya, buatlah sebuah class ListMahasiswa yang memiliki attribute seperti di bawah ini.
-Method tambah(), hapus(), update(), dan tampil() secara berurut dibuat agar bisa melakukan operasi-operasi seperti yang telah disebutkan.
-Untuk proses hapus, update membutuhkan fungsi pencarian terlebih dahulu yang potongan kode programnya adalah sebagai berikut.
-Pada class yang sama, tambahkan main method seperti potongan program berikut dan amati hasilnya!
-Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini.
<img src="Screenshot (1205).png">

*Pertanyaan*
-Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
Fungsi tambah() yang menggunakan unlimited argument biasanya menggunakan konsep "variadic function." Variadic function adalah fungsi yang dapat menerima sejumlah argumen variabel, yang berarti Anda dapat memanggil fungsi ini dengan jumlah argumen yang tidak pasti saat waktu kompilasi. Dalam banyak bahasa pemrograman, Anda dapat mencapai ini dengan menggunakan parameter seperti ... atau * (tergantung pada bahasa pemrograman) di depan parameter fungsi. Kelebihan dari variadic function adalah fleksibilitas, karena Anda dapat menggunakan jumlah argumen yang berbeda saat memanggil fungsi tanpa harus mendefinisikan beberapa versi fungsi dengan jumlah argumen yang berbeda.
-Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
<img src="Screenshot (1207).png">
-Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
<img src="Screenshot (1206).png">
*Tugas Praktikum*
Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah. Data Mahasiswa dan Mata Kuliah perlu melalui penginputan data terlebih dahulu.

<img src="Screenshot (1209).png">
-Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1!
<img src="Screenshot (1206).png">
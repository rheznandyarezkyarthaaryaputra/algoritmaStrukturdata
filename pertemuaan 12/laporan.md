nama:rheznandya rezky artha arya putra
kelas :2c sib 

12.2 Kegiatan Praktikum 1
12.2.1 Prosedur Percobaan
Pada percobaan 1 ini akan diimplementasikan Graph menggunakan Linked Lists untuk
merepresentasikan graph adjacency. Silakan lakukan langkah-langkah praktikum sebagai berikut.
1. Buatlah class Node, dan class Linked Lists sesuai dengan praktikum Double Linked Lists.
2. Tambahkan class Graph yang akan menyimpan method-method dalam graph dan juga
method main().
3. Di dalam class Graph, tambahkan atribut vertex bertipe integer dan list[] bertipe LinkedList.
4. Tambahkan konstruktor default untuk menginisialisasi variabel vertex dan menambahkan
perulangan untuk jumlah vertex sesuai dengan jumlah length array yang telah ditentukan.
5. Tambahkan method addEdge(). Jika yang akan dibuat adalah graph berarah, maka yang
dijalankan hanya baris pertama saja. Jika graph tidak berarah yang dijalankan semua baris
pada method addEdge().
6. Tambahkan method degree() untuk mengampilkan jumlah derajat lintasan pada suatu vertex.
Di dalam metode ini juga dibedakan manakah statement yang digunakan untuk graph berarah
atau graph tidak berarah. Eksekusi hanya sesuai kebutuhan saja.
7. Tambahkan method removeEdge(). Method ini akan menghapus lintasan ada suatu graph.
Oleh karena itu, dibutuhkan 2 parameter untuk menghapus lintasan yaitu source dan
destination.
8. Tambahkan method removeAllEdges() untuk menghapus semua vertex yang ada di dalam
graph.
9. Tambahkan method printGraph() untuk mencatak graph ter-update.
10. Compile dan jalankan method main() dalam class Graph untuk menambahkan beberapa edge
pada graph, kemudian tampilkan. Setelah itu keluarkan hasilnya menggunakan pemanggilan
method main(). Keterangan: degree harus disesuaikan dengan jenis graph yang telah dibuat
(directed/undirected).
11. Amati hasil running tersebut.
12. Tambahkan pemanggilan method removeEdge() sesuai potongan code di bawah ini pada
method main(). Kemudian tampilkan graph tersebut.
13. Amati hasil running tersebut.
14. Uji coba penghapusan lintasan yang lain! Amati hasilnya!
12.2.2 Verifikasi Hasil Percobaan
Verifikasi hasil kompilasi kode program Anda dengan gambar berikut ini
Hasil running pada langkah ke-11

 <img src= "Screenshot (1156)-2.png">
 Hasil running pada langkah ke-13
<img src= " Screenshot (1159).png  ">



1. Sebutkan beberapa jenis (minimal 3) algoritma yang menggunakan dasar Graph, dan apakah
kegunaan algoritma-algoritma tersebut?

-Algoritma Dijkstra
Algoritma Dijkstra digunakan untuk mencari jalur terpendek dari satu titik ke titik lain dalam sebuah Graph. Algoritma ini menggunakan pendekatan greedy, yaitu dengan memilih jalur terdekat yang belum pernah dikunjungi.

-Algoritma Prim
Algoritma Prim digunakan untuk mencari pohon minimum spanning tree dari sebuah Graph. Pohon minimum spanning tree adalah pohon yang menghubungkan semua titik dalam Graph dengan total panjang sisi yang minimal. Algoritma ini menggunakan pendekatan greedy, yaitu dengan menambahkan sisi yang memiliki bobot paling kecil ke pohon.

-Algoritma Floyd-Warshall
Algoritma Floyd-Warshall digunakan untuk mencari jarak minimum antara dua titik dalam sebuah Graph. Algoritma ini menggunakan pendekatan dinamik, yaitu dengan menyimpan hasil dari perhitungan sebelumnya untuk mempercepat perhitungan berikutnya.

2. Pada class Graph terdapat array bertipe LinkedList, yaitu LinkedList list[]. Apakah tujuan
pembuatan variabel tersebut ?

Tujuan pembuatan variabel LinkedList list[] pada class Graph adalah untuk menyimpan semua sisi (edge) yang ada di dalam Graph. Setiap sisi akan disimpan sebagai sebuah objek LinkedList yang memiliki dua elemen, yaitu titik awal (source) dan titik akhir (target).

3. Apakah alasan pemanggilan method addFirst() untuk menambahkan data, bukan method add
jenis lain pada linked list ketika digunakan pada method addEdge pada class Graph?

Alasan pemanggilan method addFirst() untuk menambahkan data pada method addEdge pada class Graph adalah untuk menjaga urutan sisi dalam Graph. Pada method addFirst(), data akan selalu ditambahkan di awal LinkedList. Hal ini berarti, sisi yang baru ditambahkan akan selalu berada di urutan paling depan.

Jika menggunakan method add jenis lain, urutan sisi dalam Graph tidak akan terjaga. Misalnya, jika menggunakan method addLast(), sisi yang baru ditambahkan akan selalu berada di urutan paling belakang.

4. Bagaimana cara mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge
pada graph ? secara singkat

Untuk mendeteksi prev pointer pada saat akan melakukan penghapusan suatu edge pada graph, dapat dilakukan dengan cara berikut:

1.Mendapatkan iterator untuk sisi yang akan dihapus.
2.Melakukan iterasi ke sisi sebelumnya dengan menggunakan method previous().
3.Menyimpan pointer ke sisi sebelumnya.

5. Kenapa pada praktikum 12.2 langkah ke-12 untuk menghapus path yang bukan merupakan
lintasan pertama kali menghasilkan output yang salah ? Bagaimana solusinya ?

 langkah ke-12 untuk menghapus path yang bukan merupakan lintasan pertama kali menghasilkan output yang salah karena metode removeEdge() tidak menghapus semua sisi yang terhubung ke vertex 3. Hal ini terjadi karena metode removeEdge() hanya menghapus sisi yang menghubungkan vertex 3 dengan vertex 1.

Solusinya adalah untuk mengubah metode removeEdge() agar menghapus semua sisi yang terhubung ke vertex 3. 

12.3 Kegiatan Praktikum 2
Kegiatan praktikum 2 merupakan implementasi Graph dengan Matriks. Silakan lakukan langkahlangkah percobaan praktikum 2 berikut ini, kemudian verifikasi hasilnya. Setelah itu jawablah
pertanyaan terkait percobaan yang telah Anda lakukan.
12.3.1 Tahapan Percobaan
Pada praktikum 2 ini akan diimplementasikan Graph menggunakan matriks untuk
merepresentasikan graph adjacency. Silakan lakukan langkah-langkah praktikum sebagai berikut.
1. Uji coba graph bagian 2 menggunakan array 2 dimensi sebagai representasi graph. Buatlah class
graphArray yang didalamnya terdapat variabel vertices dan array twoD_array!
2. Buatlah konstruktor graphArray sebagai berikut!
3. Untuk membuat suatu lintasan maka dibuat method makeEdge() sebagai berikut.
Untuk menampilkan suatu lintasan diperlukan pembuatan method getEdge() berikut.
4. Kemudian buatlah method main() seperti berikut ini.
5. Jalankan class graphArray dan amati hasilnya!
12.3.2 Verifikasi Hasil Percobaan
Hasil running pada langkah ke-13
<img src= "Screenshot (1158).png">

12.3.3 Pertanyaan Percobaan
1. Apakah perbedaan degree/derajat pada directed dan undirected graph?
-Directed graph: Degree suatu vertex adalah jumlah vertex lain yang terhubung dengan vertex tersebut, dengan arah yang ditentukan.
-Undirected graph: Degree suatu vertex adalah jumlah vertex lain yang terhubung dengan vertex tersebut, tanpa arah tertentu.
2. Pada implementasi graph menggunakan adjacency matriks. Kenapa jumlah vertices harus
ditambahkan dengan 1 pada indeks array berikut?

Pada gambar tersebut, vertex 0 terhubung dengan vertex 3, vertex 4, dan vertex 1. Oleh karena itu, degree vertex 0 adalah 3.
3. Apakah kegunaan method getEdge() ?

Kegunaan method getEdge() secara singkat adalah untuk mendapatkan edge yang terhubung dengan vertex tertentu.

4. Termasuk jenis graph apakah uji coba pada praktikum 12.3 ?

Uji coba pada gambar tersebut adalah undirected graph.

5. Mengapa pada method main harus menggunakan try-catch Exception

Method main harus menggunakan try-catch Exception untuk menangani kesalahan yang mungkin terjadi selama program berjalan.


12.4 Tugas Praktikum
1. Ubahlah lintasan pada praktikum 12.2 menjadi inputan!
2. Tambahkan method graphType dengan tipe boolean yang akan membedakan graph termasuk
directed atau undirected graph. Kemudian update seluruh method yang berelasi dengan method
graphType tersebut (hanya menjalankan statement sesuai dengan jenis graph) pada praktikum
12.2
3. Modifikasi method removeEdge() pada praktikum 12.2 agar tidak menghasilkan output yang
salah untuk path selain path pertama kali!
4. Ubahlah tipe data vertex pada seluruh graph pada praktikum 12.2 dan 12.3 dari Integer menjadi
tipe generic agar dapat menerima semua tipe data dasar Java! Misalnya setiap vertex yang
awalnya berupa angka 0,1,2,3, dst. selanjutnya ubah menjadi suatu nama daerah seperti Malang,
Surabaya, Gresik, Bandung, dst.
Screenshot (1160).png
<img src= "Screenshot (1160).png">
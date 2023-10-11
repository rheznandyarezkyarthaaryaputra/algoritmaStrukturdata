                                             JOBSHEET VII
                                                 QUEUE
nama :rheznadya rezky artha arya putra
kls 2c sib
7.2 Praktikum 1
Pada percobaan ini, kita akan mengimplementasikan penggunaan class Queue.
7.2.1 Langkah-langkah Percobaan
1. Perhatikan Diagram Class berikut ini:
2. Buat project baru dengan nama Jobsheet8, buat package dengan nama Praktikum1, kemudian
buat class baru dengan nama Queue.
3. Tambahkan atribut max, size, front, rear, dan Q sesuai diagram class di atas.
4. Tambahkan pula konstruktor berparameter dan method Create seperti gambar berikut ini.
Di dalam konstruktor, terdapat kode program yang digunakan untuk memanggil method Create.
5. Buat method IsEmpty bertipe boolean yang digunakan untuk mengecek apakah queue kosong.
6. Buat method IsFull bertipe boolean yang digunakan untuk mengecek apakah queue sudah penuh.
7. Buat method peek bertipe void untuk menampilkan elemen queue pada posisi paling depan.
8. Buat method print bertipe void untuk menampilkan seluruh elemen pada queue mulai dari posisi
front sampai dengan posisi rear.
9. Buat method clear bertipe void untuk menghapus semua elemen pada queue
10. Buat method Enqueue bertipe void untuk menambahkan isi queue dengan parameter data yang
bertipe integer
11. Buat method Dequeue bertipe int untuk mengeluarkan data pada queue di posisi belakang
12. Selanjutnya, buat class baru dengan nama QueueMain tetap pada package Praktikum1. Buat
method menu bertipe void untuk memilih menu program pada saat dijalankan.
13. Buat fungsi main, kemudian deklarasikan Scanner dengan nama sc.
14. Buat variabel n untuk menampung masukan berupa jumlah maksimal elemen yang dapat
disimpan pada queue.
15. Lakukan instansiasi objek Queue dengan nama Q dengan mengirimkan parameter n sebagai
kapasitas elemen queueu
16. Deklarasikan variabel dengan nama pilih bertipe integer untuk menampung pilih menu dari
pengguna.
17. Lakukan perulangan menggunakan do-while untuk menjalankan program secara terus menerus
sesuai masukan yang diberikan. Di dalam perulangan tersebut, terdapat pemilihan kondisi
menggunakan switch-case untuk menjalankan operasi queue sesuai dengan masukan pengguna.
18. Compile dan jalankan class QueueMain, kemudian amati hasilnya.
7.2.2 Verifikasi Hasil Percobaan
<img src="Screenshot (965).png">

7.2.3 Pertanyaan
1. Pada method Create, mengapa atribut front dan rear diinisialisasi dengan nilai -1, tidak 0?
jawab
Atribut front dan rear diinisialisasi dengan nilai -1 karena queue dianggap kosong pada awal operasi. Nilai -1 menunjukkan bahwa queue tidak memiliki elemen sama sekali.Jika front dan rear diinisialisasi dengan nilai 0, maka queue akan dianggap memiliki elemen pada awal operasi. Hal ini dapat menyebabkan kesalahan jika program mencoba untuk mengakses elemen yang tidak ada.

2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
jawab
Potongan kode berikut digunakan untuk menangani kasus ketika queue sudah penuh. Jika rear sudah sama dengan max-1, maka rear akan direset menjadi 0. Hal ini dilakukan agar elemen baru dapat disimpan pada posisi pertama di dalam queue.

3. Perhatikan kembali method Enqueue, baris kode program manakah yang menunjukkan bahwa data baru disimpan pada posisi terakhir di dalam queue?
jawab
Baris kode program yang menunjukkan bahwa data baru disimpan pada posisi terakhir di dalam queue adalah baris berikut:
data[rear] = item;
Baris kode ini akan menyimpan data baru ke dalam elemen queue pada posisi rear.

4. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa data yang dikeluarkan adalah data pada posisi paling depan di dalam queue?
jawab
Baris kode program yang menunjukkan bahwa data yang dikeluarkan adalah data pada posisi paling depan di dalam queue adalah baris berikut:
data[front] = 0;
Baris kode ini akan mengubah nilai elemen queue pada posisi front menjadi 0. Hal ini menunjukkan bahwa elemen tersebut telah dikeluarkan dari queue.

5. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
jawab
Potongan kode berikut digunakan untuk menangani kasus ketika queue sudah kosong. Jika front sudah sama dengan max-1, maka front akan direset menjadi 0. Hal ini dilakukan agar queue dapat menerima elemen baru.

6. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
jawab
Pada method print, perulangan dilakukan untuk menampilkan semua elemen yang ada di dalam queue. Oleh karena itu, variabel i diinisialisasi dengan nilai front, yaitu posisi elemen pertama di dalam queue.Jika variabel i diinisialisasi dengan nilai 0, maka perulangan akan dimulai dari posisi elemen kedua di dalam queue. Hal ini akan menyebabkan elemen pertama di dalam queue tidak ditampilkan.

7. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
jawab
Potongan kode berikut digunakan untuk menghitung jumlah iterasi yang dilakukan dalam perulangan.

1 = (1 + 1) + max;
Persamaan ini dapat diartikan sebagai berikut:

1 = 2 + max;
Oleh karena itu, nilai variabel 1 akan sama dengan jumlah elemen yang ada di dalam queue.
7.3 Praktikum 2
7.3.1 Langkah-langkah Percobaan
1. Perhatikan Diagram Class berikut ini:
2. Buat package dengan nama Praktikum2, kemudian buat class baru dengan nama Penumpang.
3. Tambahkan atribut-atribut Penumpang seperti pada Class Diagram Penumpang, kemudian
tambahkan pula konstruktornya seperti gambar berikut ini.
4. Salin kode program class Queue pada Praktikum1 untuk digunakan kembali pada Praktikum2 ini.
Karena pada Praktikum1, data yang disimpan pada queue hanya berupa array bertipe integer,
sedangkan pada Praktikum2 data yang digunakan adalah object, maka perlu dilakukan modifikasi
pada class Queue tersebut.
5. Lakukan modifikasi pada class Queue dengan mengubah tipe int[] Q menjadi Penumpang[] Q
karena pada kasus ini data yang akan disimpan pada queue berupa object Penumpang. Modifikasi
perlu dilakukan pada atribut, method Create, method Enqueue, dan method Dequeue.
6. Karena satu elemen queue terdiri dari beberapa informasi (nama, kota asal, kota tujuan, jumlah
tiket, dan harga), maka ketika mencetak data juga perlu ditampilkan semua informasi tersebut,
sehingga meodifikasi perlu dilakukan pada method peek dan method print.
7. Selanjutnya, buat class baru dengan nama QueueMain tetap pada package Praktikum2. Buat
method menu untuk mengakomodasi pilihan menu dari masukan pengguna
8. Buat fungsi main, deklarasikan Scanner dengan nama sc
9. Buat variabel max untuk menampung kapasitas elemen pada queue. Kemudian lakukan
instansiasi objek queue dengan nama antri dan nilai parameternya adalah variabel jumlah.
10. Deklarasikan variabel dengan nama pilih bertipe integer untuk menampung pilih menu dari
pengguna.
11. Tambahkan kode berikut untuk melakukan perulangan menu sesuai dengan masukan yang
diberikan oleh pengguna.
12. Compile dan jalankan class QueueMain, kemudian amati hasilnya.
7.3.2 Verifikasi Hasil Percobaan
<img src="Screenshot (968).png">
7.3.3 Pertanyaan
1. Perhatikan class Queue, apa fungsi kode program berikut pada method Dequeue?
Penumpang data = new Penumpang ("", "", "", 0, 0);
jawab
Dalam kode Penumpang data = new Penumpang ("", "", "", 0, 0);, objek data diinisialisasi dengan nilai-nilai default yang tidak valid, mungkin digunakan sebagai tindakan awal untuk menghindari kesalahan saat mengakses data yang tidak ada dalam antrian.
2. Pada soal nomor 1, apabila kode program tersebut diganti dengan kode berikut:
Penumpang data = new Penumpang().
Apakah yang terjadi? Mengapa demikian?
jawab
Jika kode Penumpang data = new Penumpang(); digunakan, maka objek data akan diisi dengan nilai-nilai default yang tidak berguna dalam konteks penggunaan antrian.
3. Tunjukkan kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue!
jawab
Untuk menampilkan data yang dikeluarkan dari queue, Anda dapat menggunakan perulangan untuk mengakses dan mencetak setiap elemen dalam queue, seperti yang ditunjukkan dalam kode program yang diberikan. Kode ini akan terus mencetak elemen hingga queue kosong.

3. Tunjukkan kode program yang digunakan untuk menampilkan data yang dikeluarkan dari queue!
jawab

<img src="Screenshot (970).png">
4. Lakukan modifikasi program dengan menambahkan method baru bernama peekRear pada class
Queue yang digunakan untuk mengecek antrian yang berada di posisi belakang! Tambahkan pula
daftar menu
jawab 
<img src="Screenshot (971).png">
5. Cek Antrian paling belakang pada class QueueMain sehingga method peekRear
dapat dipanggil!
jawab
Screenshot (972).png
<img src="Screenshot (972).png">
7.4 Tugas
1. Tambahkan dua method berikut ke dalam class Queue pada Praktikum1:
a. Method peekPosition(data: int) : void
Untuk menampilkan posisi dari sebuah data di dalam queue, misalnya dengan mengirimkan 
data tertentu, akan diketahui posisi (indeks) data tersebut berada di urutan keberapa
b. Method peekAt(position: int) : void
Untuk menampilkan data yang berada pada posisi (indeks) tertentu
Sesuaikan daftar menu yang terdapat pada class QueueMain sehingga kedua method tersebut 
dapat dipanggil!
jawab
<img src="Screenshot (974).png">

2.Buatlah program antrian untuk mengilustasikan mahasiswa yang sedang meminta tanda tangan 
KRS pada dosen DPA di kampus. Ketika seorang mahasiswa akan mengantri, maka dia harus 
menuliskan terlebih dulu NIM, nama, absen, dan IPK seperti yang digambarkan pada Class 
diagram berikut:
Class diagram Queue digambarkan sebagai berikut:
Catatan:
• Method create(), isEmpty(), isFull(), enqueue(), dequeue() dan print(), kegunaannya sama seperti 
yang telah dibuat pada Praktikum
• Method peek(): digunakan untuk menampilkan data Mahasiswa yang berada di posisi antrian 
paling depan
• Method peekRear(): digunakan untuk menampilkan data Mahasiswa yang berada di posisi antrian 
paling belakang
• Method peekPosition(): digunakan untuk menampilkan posisi antrian ke berapa, seorang 
Mahasiswa berada. Pengecekan dilakukan berdasarkan NIM
• Method printMahasiswa(): digunakan untuk menampilkan data mahasiswa pada suatu posisi 
tertentu dalam antrian
jawab
<img src="Screenshot (975).png">

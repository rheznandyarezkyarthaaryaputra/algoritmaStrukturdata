  nama rheznandya rezky artha arya putra
  kls:2C sib                                              
                                                  JOBSHEET - V
                                     SORTING (BUBBLE SORT DAN SELECTION SORT)
5.2.1 Langkah Praktikum 1
SORTING – BUBBLE SORT
1. Buatlah project baru pada Netbeans dengan nama Main
2. Buat class Sort, kemudian deklarasikan variabel berikut ini :
3. Buatlah konstruktor dengan parameter Data[] dan jumData
4. Isi Konstruktor tersebut dengan kode berikut
5. Buatlah method bubbleSort bertipe void
6. Deklarasikan isi method bubbleSort dengan menggunakan algoritma Bubble Sort 
7. Buatlah method tampilData bertipe void
8. Deklarasikan isi dari method tampilData
9. Buat array pada class Main dengan nama data kemudian isi array tersebut
10. Buatlah objek baru dengan nama urut yang merupakan instansiasi dari class Sort, kemudian isi parameternya
11. Lakukan pemanggilan method bubbleSort dan tampilData
12. Jalankan program, dan amati hasilnya!
<img scr="image-1.png">
5.2.4 Pertanyaan!
1. Jelaskan maksud dari kode berikut
jawaban: Kode tersebut merupakan deklarasi variabel pengurutan kelas BubbleSort. Kelas BubbleSort merupakan kelas yang mengimplementasikan algoritma  Bubble Sort. Algoritma Bubble Sort adalah algoritma pengurutan sederhana yang  membandingkan elemen-elemen tabel secara berurutan dan menukarnya ketika elemen yang lebih besar mendahului elemen yang lebih kecil.  Dalam kodenya, variabel a adalah array yang dapat diurutkan. Variabel a.length adalah panjang array a. Jadi kodenya dapat diartikan sebagai berikut: 
 Deklarasikan beberapa variabel  kelas BubbleSort. Isi pengurutan dengan objek BubbleSort baru dengan parameter array a dan panjang array a.length. 
2. Jelaskan fungsi kode program berikut
jawaban:
Kode adalah fungsi yang menukarkan dua elemen  array. Variabel waktu digunakan untuk menyimpan nilai  elemen pertama, kemudian nilai  elemen kedua ditukar dengan elemen pertama. Nilai  elemen pertama yang semula disimpan pada variabel waktu kemudian digantikan dengan nilai  elemen kedua yang semula disimpan pada elemen pertama.  Dalam kode tersebut, variabel j adalah indeks elemen pengganti.
4. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!
algoritma pencarian nilai minimum pada selection sort adalah sebagai berikut:
-Mulai dari elemen pertama, cari elemen dengan nilai minimum dalam array.
-Tukar elemen tersebut dengan elemen pertama dalam array.
-Lakukan langkah 1 dan 2 untuk elemen berikutnya.
5. Kerjakan kembali program pengurutan menggunakan algoritma bublle sort dan 
SelectionSort di atas dengan pengurutan secara DESC!
<img scr="Screenshot (892).png">
5.2.2 Membuat Class DaftarMahasiswaBerprestasi
1. Di dalam class DaftarMahasiswaBerprestasi terdapat daftar mahasiswa mahasiswa yang dinyatakan sebagai mahasiswa berprestasi. Di dalam class ini
2. Buat class DaftarMahasiswaBerprestasi seperti di bawah ini!
3. Tambahkan method tambah() di dalam class tersebut! Method tambah() digunakan untuk menambahkan objek dari class Mahasiswa ke dalam atribut listMhs.
4. Tambahkan method tampil() di dalam class tersebut! Method tampil() 
digunakan untuk menampilkan semua data mahasiswa-mahasiswa yang ada di 
dalam class tersebut! Perhatikan penggunaan sintaks for yang agak berbeda 
dengan for yang telah dipelajari sebelumnya, meskipn secara konsep 
sebenarnya mirip.
5. Tambahkan method bubbleSort() di dalam class tersebut
6. Sampai tahap ini class DaftarMahasiswaBerprestasi telah lengkap.
<img scr="Screenshot (906).png">
5.2.3 Membuat Class Main
1. Buat class Main dan didalamnya buat method main() seperti di bawah ini!
2. Di dalam method main(), buatlah 2 objek dari class Scanner, sebuah objek 
DaftarMahasiswaBerprestasi dan deklarasikan variabel jumlahMhs senilai 5.!
3. Kemudian lakukan perulangan sebanyak 5 kali menggunakan for, untuk 
memasukan data nama, umur, tahun masuk dan ipk dari tiap mahasiswa, dan 
menambahkan objek mahasiswa ke dalam objek daftar mahasiswa berprestasi!
4. Coba tampilkan data-data mahsiswa yang telah masuk dalam daftar mahasiswa 
berprestasi!
5. Panggil method bubbleSort() dan tampilkan kembali hasilnya!
Coba jalankan dan amati kembali hasilnya! Apakah semua data kini telah 
terurut secara menurun berdasar ipk?
<img scr="Screenshot (907).png">
5.3.5 Menambahkan Proses Selection Sort di dalam Class DaftarMahasiswaBerprestasi
1. Lihat kembali class DaftarMahasiswaBerprestasi, dan tambahkan method 
selectionSort() di dalamnya! Method ini juga akan melakukan proses sorting
secara ascending, tetapi menggunakan pendekatan selection sort.
2. Setelah itu, buka kembali class Main, dan di dalam method main() tambahkan 
baris program untuk memanggil method selectionSort() tersebut!
3. Coba jalankan kembali class Main, dan amati hasilnya! Apakah kini data 
mahasiswa telah tampil urut menaik berdasar ipk?
5.3.4 Verifikasi Hasil Percobaan
<img scr="Screenshot (905)-1.png">

5.3.6 Pertanyaan

1.Tunjukkan proses pencarian nilai minimum pada algoritma Selection Sort yang telah 
dipraktikkan pada pertemuan ini (bukti screen shoot kode program dan penjelasan)!

jawaban
<img scr="Screenshot (909).png">

langkah-langkahnya:

-Inisialisasi indeks minimum ke 0.
-Iterasi melalui array, membandingkan setiap elemen dengan elemen terkecil yang ditemukan sejauh ini.
-Jika elemen yang sedang diperiksa lebih kecil dari elemen terkecil yang ditemukan, perbarui indeks minimum.
-Setelah selesai iterasi, elemen terkecil sudah ditemukan.
-Tukar elemen terkecil dengan elemen di indeks tertentu.
-Ulangi langkah 2-5 hingga seluruh array diurutkan.
-Proses ini terus berlanjut hingga seluruh array diurutkan
2.Jelaskan perbedaan proses swap yang terjadi pada Bubble Sort dengan Selection 
Sort!
jawaban
Bubble Sort: Mengurutkan data dengan membandingkan dua elemen data yang berurutan dan menukar posisinya jika elemen pertama lebih besar dari elemen kedua.
Selection Sort: Mengurutkan data dengan mencari elemen terbesar dalam array dan menukar posisinya dengan elemen terakhir.


3. Tujuan baris program if(listMhs[j].ipk> ListMhs[j-1].ipk)

Tujuan baris program if(listMhs[j].ipk> ListMhs[j-1].ipk) adalah untuk memeriksa apakah elemen data di indeks j lebih besar dari elemen data di indeks j-1. Jika benar, maka kedua elemen data tersebut akan ditukar posisinya.

4. Pertanyaan perulangan pada bubbleSort()

a. Perbedaan antara kegunaan perulangan i dan perulangan j
jawab:
Perulangan i digunakan untuk menentukan iterasi bubble sort. Perulangan j digunakan untuk membandingkan dua elemen data yang berurutan.

b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1?
jawab:
Syarat dari perulangan i adalah i<listMhs.length-1 karena bubble sort akan berhenti ketika elemen terakhir sudah pasti terurut.

c. Mengapa syarat dari perulangan jadalah j<listMhs.length-i?
jawab:
Syarat dari perulangan j adalah j<listMhs.length-i karena bubble sort akan membandingkan elemen data dari indeks ke-1 hingga indeks terakhir.

d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
jawab:
Jika banyak data di dalam listMhs adalah 50, maka perulangan i akan berlangsung sebanyak 49 kali. Tahap bubble sort yang ditempuh adalah 49 tahap.

5.4 Tugas
1.- Coding Main :
<img scr=" Screenshot (912).png">
- Coding anggota :
<img scr=" Screenshot (915).png">
-Coding daftaranggota :
<img scr=" Screenshot (914).png">
- Output:
<img scr=" Screenshot (908).png">
2. - Coding Main :
<img scr=" Screenshot (912).png">
- Coding anggota :
<img scr=" Screenshot (915).png">
-Coding daftaranggota :
<img scr=" Screenshot (914).png">
- Output:
<img scr=" Screenshot (908).png">

Soal 3
- Main :
<img scr=" Screenshot (915).png">
- Perpus :
<img scr=" Screenshot (918).png">
- Prosesperpus :
<img scr=" Screenshot (917).png">
-output
  
<img scr=" Screenshot (916).png">
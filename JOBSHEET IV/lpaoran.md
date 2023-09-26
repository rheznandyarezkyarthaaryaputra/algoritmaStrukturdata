Nama :rheznandya rezky artha arya putra
kelas:2C SIB
                                                    JOBSHEET IV 
                                                    SEARCHING

*4.2 Praktikum 1 
Pada percobaan ini, kita akan mengimplementasikan penggunaan unordered sequential search 
pada array of object. 
4.2.1 Langkah-langkah Percobaan 
1. Pada Project StrukturData yang sudah dibuat pada Minggu sebelumnya, buat package dengan 
nama minggu5, kemudian buat class baru dengan nama Mahasiswa. Tambahkan atribut kode, 
nim, namaMahasiswa dan ipk, serta berikan konstruktor berparameter seperti gambar berikut 
ini.
2. Buat class baru dengan nama MahasiswaMain tetap pada package minggu5. Buat class main, 
kemudian lakukan instansiasi objek array dan isikan datanya. Kemudian tambahkan kode 
program untuk melakukan pencarian menggunakan Sequential Search.
3. Jalakan (run) class MahasiswaMain dan amati hasilnya
<img scr="Screenshot (843)-1.png">
4.2.3 Pertanyaan 
1. Perhatikan class MahasiswaMain, jelaskan fungsi kode program berikut ini!
jawaban :
Kode program if (cari.equalsIgnoreCase (mhs[i].StudentName)) membandingkan nama siswa yang akan dicari (search) dengan nama siswa pada indeks i tabel siswa. Perbandingannya peka huruf besar-kecil, artinya huruf besar dan kecil diabaikan.
2. Lakukan modifikasi pada program tersebut, sehingga jika data yang dicari tidak ditemukan, maka 
akan menampilkan “Data tidak ditemukan”!
jawaban
<img scr="image-2.png>">
3. Lakukan modifikasi pada program tersebut agar pencarian dilakukan bukan berdasarkan nama 
mahasiswa, melainkan berdasarkan IPK
jawaban:
<img scr="img scr=image-3.png">
*4.3 Praktikum 2
Pada percobaan ini, kita akan mengimplementasikan penggunaan ordered sequential search pada 
array of object.
4.3.1 Langkah-langkah Percobaan
1. Pada package minggu5, buat class baru dengan nama OrderedSearch. Tambahkan atribut arr, 
serta berikan konstruktor berparameter. Tambahkan pula method Cari dan Tampilkan seperti 
gambar berikut ini.
2. Buat class baru dengan nama PencarianMain tetap pada package minggu5. Buat class main, buat 
array dan isikan datanya seperti gambar berikut ini.
3. Jalakan (run) class PencarianMain dan amati hasilnya
<img scr="image-4.png">
4.3.3 Pertanyaan
1. Perhatikan class PencarianMain, jelaskan fungsi dari kode kode program berikut ini!
jawabn:

Kode program OrderedSearch os= new OrderedSearch (data); berfungsi untuk membuat objek OrderedSearch baru dengan parameter data. Objek OrderedSearch digunakan untuk melakukan pencarian data secara terurut

2. Perhatikan class Pencarian, pada method Cari terdapat dua kali break. Jelaskan fungsi masing masing break tersebut pada kode program tersebut!
jawaaban:
Pada method Cari() kelas Pencarian, terdapat dua kali break. Fungsi masing-masing break tersebut adalah sebagai berikut:

-Break pertama berfungsi untuk menghentikan iterasi loop while jika data yang dicari ditemukan.
-Break kedua berfungsi untuk menghentikan iterasi loop while jika data yang dicari tidak ditemukan dan indeks sudah mencapai batas akhir array.


3. Lakukan modifikasi pada program tersebut sehingga data array dapat bersifat dinamis (dapat 
diinputkan oleh pengguna)
jawaban:
<img scr="Screenshot (849).png">
4.4 Tugas
1. Terdapat sebuah array satu dimensi sebagai berikut:
Buatlah program untuk mencari sebuah nilai x dan tentukan jenis sequential search manakah 
yang optimal dan cocok untuk array diatas dengan:
a. x=41
b. x=50
jawaban
<img scr="Screenshot (851).png">
2.Terdapat sebuah array dua dimensi yang menggambarkan nama mahasiswa pada 3 kelompok 
yang berbeda dalam satu kelas. Baris menunjukkan kelompok, sedangkan kolom menunjukkan 
data mahasiswa dalam satu kelompok dengan contoh seperti di bawah ini.Berdasarkan data tersebut, buatlah program untuk melakukan pencarian data kelompok dan 
urutan mahasiswa, dimana data nama mahasiswa yang dicari diinputkan melalui keyboard!
Contoh hasil tampilan dari pencarian seperti di bawah ini
<img scr="Screenshot (853).png">
3.Terdapat sebuah array satu dimensi sebagai berikut:
Buatlah program untuk mencari dan mencetak isi array yang nilainya terbesar, serta mencetak di 
posisi mana saja nilai terbesar tersebut berada!
jawaban:
<img scr="Screenshot (854).png">
4.Buatlah program untuk melakukan pencarian data penduduk berdasarkan NIK. Setiap penduduk 
mempunyai catatan data yang terdiri dari NIK, nama, alamat, dan jenis kelamin. Jumlah penduduk
jawaban:
<img scr="Screenshot (854).png">
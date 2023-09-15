 nama :rheznadya rezky artha arya putra
 kelas:sib 2c
 
 4.2.1 Langkah-langkah Percobaan
<img scr="image.png">
soal 4.2.1
1.Jelaskan mengenai base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial!
jawabannya
Dalam algoritma Divide and Conquer, baseline adalah kondisi di mana suatu masalah  dapat diselesaikan secara langsung tanpa harus membaginya lebih lanjut menjadi submasalah yang lebih kecil. Dalam hal mencari nilai koefisien, baselinenya adalah ketika n = 1.
2. Pada implementasi Algoritma Divide and Conquer Faktorial apakah lengkap terdiri dari 3 tahapan
divide, conquer, combine? Jelaskan masing-masing bagiannya pada kode program!
jawabannya
Ya, implementasi algoritma divide and conquer faktorial pada kode program di atas lengkap terdiri dari 3 tahapan, yaitu:
a.Divide
Tahap divide pada kode program di atas dilakukan oleh fungsi FactorialDC(). Fungsi ini menerima satu parameter, khususnya n, yaitu bilangan yang ingin kita hitung faktorialnya
b.Conquer
Tahap conquer pada kode program di atas dilakukan oleh fungsi FactorialDC(). Fungsi ini akan dipanggil secara rekursif untuk menghitung nilai faktorial  n - 1.
c.Combine
Tahap combine kode program di atas dilakukan oleh fungsi FactorialDC(). Fungsi ini akan menggabungkan hasil dari dua submasalah yang  dihitung pada Tahap combine.
3.Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan
for?Buktikan!
jawabannya
 Ya, perulangan metode FactorialBF() dapat dimodifikasi melebihi penggunaan for. Cara lain adalah dengan menggunakan while
 <img scr="image-1.png">
 4. Tambahkan pegecekan waktu eksekusi kedua jenis method tersebut!
 <img scr="image-2.png">
5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
jawabannya
Ya, ada perbedaan waktu eksekusi antara algoritma brute force dan algoritma divide and conquer untuk pencarian nilai faktorial, terutama untuk inputan elemen yang di atas 20 angka.
buktina:
<img scr="carbon (26).png">

4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
<img scr="image-3.png">

4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!
jawabannya
Perbedaan utama antara method PangkatBF() dan PangkatDC() adalah pada cara perhitungannya. Method PangkatBF() menggunakan algoritma brute force, yaitu dengan menghitung nilai pangkat secara langsung. Sedangkan method PangkatDC() menggunakan algoritma divide and conquer, yaitu dengan membagi masalah menjadi dua sub-masalah yang lebih kecil, dan kemudian menyelesaikan masing-masing sub-masalah secara rekursif.
2.Jelaskan arti potongan kode tersebut
jawabannya
Potongan kode tersebut merupakan bagian dari method PangkatDC() untuk menghitung nilai pangkat dari sebuah bilangan. Potongan kode tersebut digunakan untuk menentukan apakah bilangan yang diberikan adalah bilangan ganjil atau genap.
3.Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
jawabannya
Tahap combine dalam algoritma divide and conquer adalah tahap untuk menggabungkan hasil dari dua sub-masalah yang telah diselesaikan. Tahap ini diperlukan jika algoritma divide and conquer membagi masalah menjadi dua sub-masalah yang lebih kecil.
bukti:
<img scr="image-4.png">

4.Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan
konstruktor.
<img scr="image-5.png">
5. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan!
<img.scr="image-6.png">
4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
4.4.1 Langkah-langkah Percobaan
<img.scr="image-7.png">

4.4.3 Pertanyaan
1. Berikan ilustrasi perbedaan perhitungan keuntungan dengan method TotalBF() ataupun
TotalDC()
jawaban:
-TotalBF()
Pada method TotalBF(), total keuntungan dihitung dengan menjumlahkan semua keuntungan bulanan secara langsung.
-TotalDC()
Pada method TotalDC(), total keuntungan dihitung dengan membagi masalah menjadi dua sub-masalah yang lebih kecil, kemudian menghitung total keuntungan dari masing-masing sub-masalah dan menambahkannya.

2. Perhatikan output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di
belakang koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk
kedua jenis algoritma tersebut.
jawabannya
Untuk membatasi output setelah koma agar menjadi standar untuk kedua jenis algoritma tersebut, Anda dapat melakukannya dengan cara:


a.Gunakan format angka .2f untuk menampilkan dua angka setelah koma desimal
b.Gunakan pembulatan untuk membulatkan hasilnya menjadi dua digit

3. Mengapa terdapat formulasi return value berikut?Jelaskan!
jawabannya
 karena formulasi return value berikut digunakan untuk:

A.Membatasi output di belakang koma menjadi dua angka
B.Menampilkan output dalam format juta

4. Kenapa dibutuhkan variable mid pada method TotalDC()?
jawabannya
karena method TotalDC(), masalah awal dibagi menjadi dua sub-masalah jika jumlah bulan lebih dari 1. Sub-masalah 1 adalah keuntungan bulanan dari indeks 0 hingga mid, dan sub-masalah 2 adalah keuntungan bulanan dari indeks mid + 1 hingga end.
Proses pembagian masalah menjadi dua sub-masalah dilakukan dengan menggunakan variabel mid. Mid adalah indeks tengah dari array keuntunganBulan.
Dengan demikian, variable mid dibutuhkan untuk membagi masalah menjadi dua sub-masalah yang lebih kecil.
5. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!
jawabannya
Untuk menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan, dapat dilakukan dengan cara berikut:
1.Buat sebuah class baru yang menyimpan informasi tentang perusahaan, seperti nama perusahaan, jumlah bulan, dan keuntungan bulanan.2Buat sebuah 2.2.buat sebuah array untuk menyimpan objek perusahaan.
3.Buat sebuah method untuk menghitung total keuntungan perusahaan.
4.Panggil method tersebut untuk setiap objek perusahaan.
buktinya
<img.scr="image-8.png">
4.5 Latihan Praktikum
<img.scr="image-9.png">

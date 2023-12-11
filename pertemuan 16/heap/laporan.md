nama:rheznandya rezky artha arya putra
kelas:2C SIB


Langkah Praktikum 1
-Buatkan kelas Heap
-Tambahkan atribut heap dengan tipe List<Integer>
-Tambahkan juga konstruktor untuk kelas Heap.
-Jangan lupa, import package yang dibutuhkan.
-Tambahkan method getHeap() pada kelas Heap.
-Selanjutnya, untuk melakukan pencekan terhahdap child sebelah kiri, buat method leftChild(int index) . Pada kasus ini, kita akan berasumsi bahwa index heap dimulai dari 0. sehingga nilai child kiri adalah .
-Tambakan pula method untuk pengecekan child sebelah kanan. Dikarenakan index heap dimulai dari 0, maka nilai index child sebelah kanan adalah .
-Selanjutnya, untuk mengetahui index parent dari sebuah child, buatlah method bantuan dengan nama parent(int index).
-Pada heap, diperlukan proses menukar nilai ketika nilai pada susunan heap tidak valid. Oleh karena buat, buatlah method swap(int index1, int index2) yang akan digunakan untuk proses swap.
-Sampai pada tahap ini, Anda telah mengimplementasikan fungsi-fungsi dasar pada struktur data heap. Fungsi-fungsi tersebut nantinya akan digunakan pada proses penambahan dan pengurangan data.
-Untuk menambahkan data, buatlah method insert(int value).
-Selanjutnya, untuk mengurani nilai pada heap, buatlah method remove(). Pada kasus ini, Anda membuat maximum priority queuing, sehingga, hanya node root yang akan dikeluarkan terlebih dahulu.
-Setelah proses penghapusan, heap harus menyusun kembali struktur data yang ada didalamnya agar tetap valid dengan mempertahankan struktur complete tree. Tambakan method sinkDown(int index) untuk menerapakan solusi dari kondisi tersebut.
-Untuk menguji apakah heap yang dibuat dapat berjalan sesuai dengan kaidah heap, buatlah kelas HeapMain yang berisi main method untuk melakukan pengujian.
-Jalankan program dan validasi hasilnya.

<img src="Screenshot (1194).png">
*Pertanyaan*
-Pada method swap terdapat method set yang dipanggil oleh objek heap. Apa fungsi dari set?
Pada metode Swap, metode Set yang dipanggil oleh objek Heap menggantikan nilai  elemen di  heap dengan nilai  baru.
 Dalam konteks struktur data heap, ini digunakan untuk mengubah urutan elemen dalam heap agar sesuai dengan properti heap, biasanya properti nilai maksimum atau minimum heap.
-Pada method remove digunakan nilai kembalian (return value) yaitu Integer. Apa perbedaan nilai kembalian antara Interger dan int? Mengapa digunakan Integer?
Method remove menggunakan nilai kembalian dalam bentuk bilangan bulat (huruf besar).
 Perbedaan integer dan int adalah integer merupakan tipe data objek, sedangkan int merupakan tipe data primitif.
  Integer dapat mengembalikan null jika elemen tidak  ditemukan selama penghapusan, tetapi int tidak dapat menyimpan nilai null.
 Ini berguna untuk menunjukkan bahwa elemen tidak ditemukan, tetapi tidak mungkin dilakukan dengan int.
-Perhatikan method sinkDown baris ke-17 sampai ke-20. Proses apa yang dijalankan pada baris tersebut?
Baris 17-20 dari metode SinkDown membandingkan elemen pada posisi saat ini di heap dengan turunannya (anak kiri dan anak kanan).
 Tujuannya adalah untuk memeriksa apakah elemen saat ini lebih kecil dari  kedua anaknya.
 Dalam hal ini, elemen saat ini ditukar dengan salah satu turunannya untuk mempertahankan properti heap.
 Proses ini berjalan secara rekursif hingga elemen yang akan disinkronkan mencapai posisinya yang sesuai di heap.
 Ini adalah bagian dari operasi sinkdown algoritme Heapify untuk mempertahankan properti heap.
 
 *Modifikasi kode pada Prakitkum 1 menjadi heap untuk minimum priority queuing. Gunakan data yang sama dengan Praktikum 1 dan amati hasilnya.
 <img src="Screenshot (1195).png">
nama :rheznandya rezky artha arya putra
kelas: 2C sib
 pertemuan 8
 JOBSHEET IX
LINKED LIST
9.1 Tujuan Praktikum
Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Membuat struktur data linked list
2. Membuat linked list pada program
3. Membedakan permasalahan apa yang dapat diselesaikan menggunakan linked list
9.2 Praktikum 1
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat Single Linked List dengan
representasi data berupa Node, pengaksesan linked list dan metode penambahan data.
9.2.1 Langkah-langkah Percobaan
1. Pada Project StrukturData yang sudah dibuat pada Minggu sebelumnya, buat package
dengan nama minggu11
2. Tambahkan class-class berikut:
a. Node.java
b. SingleLinkedList.java
c. SLLMain.java
3. Implementasi class Node
4. Tambahkan atribut pada class SingleLinkedList
5. Sebagai langkah berikutnya, akan diimplementasikan method-method yang terdapat pada
SingleLinkedList.
6. Tambahkan method isEmpty().
7. Implementasi method untuk mencetak dengan menggunakan proses traverse.
8. Implementasikan method addFirst().
9. Implementasikan method addLast().
10. Implementasikan method insertAfter, untuk memasukkan node yang memiliki data
input setelah node yang memiliki data key
11. Tambahkan method penambahan node pada indeks tertentu.
12. Pada class SLLMain, buatlah fungsi main, kemudian buat object dari class
SingleLinkedList.
13. Tambahkan Method penambahan data dan pencetakan data di setiap penambahannya
agar terlihat perubahannya.
9.2.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini.
<img scr="Screenshot (1024).png ">
9.2.3 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
jawab:
Hasil compile kode program di baris pertama menghasilkan "Linked List Kosong" karena pada saat itu linked list masih kosong. Variabel head yang merupakan referensi ke node pertama dalam linked list masih bernilai null.
2. Pada step 10, jelaskan kegunaan kode berikut
jawab:
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut
jawab:
kode ini digunakan untuk menambahkan node baru dengan data ndInput ke dalam linked list di belakang node temp. Kode ini bekerja dengan cara sebagai berikut:
-Kode ndInput.next = temp.next menunjuk node ndInput ke node berikutnya setelah node temp.
-Kode temp.next = ndInput menunjuk node temp ke node ndInput.
9.3 Praktikum 2
Didalam praktikum ini, kita akan mempraktekkan bagaimana mengakses elemen, mendapatkan
indeks dan melakukan penghapusan data pada Single Linked List.
9.3.1 Langkah-langkah Percobaan
1. Implementasikan method untuk mengakses data dan indeks pada linked list
2. Tambahkan method untuk mendapatkan data pada indeks tertentu pada class Single
Linked List
3. Implementasikan method indexOf.
4. Tambahkan method removeFirst pada class SingleLinkedList
5. Tambahkan method untuk menghapus data pada bagian belakang pada class
SingleLinkedList
6. Sebagai langkah berikutnya, akan diimplementasikan method remove
7. Implementasi method untuk menghapus node dengan menggunakan index.
8. Kemudian, coba lakukan pengaksesan dan penghapusan data di method main pada class
SLLMain dengan menambahkan kode berikut
9. Method SLLMain menjadi:
10. Jalankan class SLLMain
9.3.2 Verifikasi Hasil Percobaan
Cocokkan hasil compile kode program anda dengan gambar berikut ini.
<img scr="Screenshot (1027).png">
9.3.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
jawab:
Keyword break digunakan pada fungsi remove untuk menghentikan proses pencarian node yang memiliki data sama dengan key. Hal ini diperlukan untuk mencegah terjadinya loop tak berhingga jika node yang dicari tidak ada dalam linked list.
2. Jelaskan kegunaan kode dibawah pada method remove
jawab: Kode ini digunakan untuk menghapus node yang memiliki data sama dengan key dari linked list. Kode ini bekerja dengan cara sebagai berikut:
-jika node berikutnya setelah node temp memiliki data sama dengan key, maka node tersebut akan dihapus dari linked list.
-Kode temp.next = temp.next.next menunjuk node temp ke node berikutnya setelah node yang dihapus.
3. Apa saja nilai kembalian yang dapat dikembalikan pada method indexOf? Jelaskan maksud
masing-masing kembalian tersebut!
jawab:
Method indexOf dapat mengembalikan empat nilai sebagai berikut:

- -1 jika node yang dicari tidak ada dalam linked list.
-   0 jika node yang dicari adalah node pertama dalam linked list.
-    1 jika node yang dicari adalah node kedua dalam linked list.
-   dst.
Arti masing-masing nilai kembalian adalah sebagai berikut:
- -1: Node yang dicari tidak ditemukan.
- 0: Node yang dicari adalah node pertama dalam linked list.
- 1: Node yang dicari adalah node kedua dalam linked list.
- dst.

soal
1.<img scr="Screenshot (1032).png ">
2.<img scr="Screenshot (1033).png ">
3.<img scr="Screenshot (1034).png">
4.<img scr="Screenshot (1030).png">
5.<img scr="Screenshot (1031).png ">
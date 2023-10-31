Langkah Percobaan 1
-Buatlah projek baru.
-Buat kelas Node.
-Tambahkan atribut berikut pada kelas Node
-Tambahkan konstruktor untuk kelas Node.
-Buat kelas DoublyLinkedList.
-Pada kelas tersebut, tambahkan atribut berikut,
-Selanjutnya, buatlah konstruktor untuk kelas -DoublyLinkedList.
-Tambahkan method isEmpty().
-Kemudian, buat method addFirst(). Method ini akan menjalankan penambahan data di bagian depan linked list.
-Selain itu pembuatan method addLast() akan menambahkan data pada bagian belakang linked list.
-Untuk menambahkan data pada posisi yang telah ditentukan dengan indeks, dapat dibuat dengan method add(int item, int index).
-Jumlah data yang ada di dalam linked lists akan diperbarui secara otomatis, sehingga dapat dibuat method size() untuk mendapatkan nilai dari size.
-Selanjutnya dibuat method clear() untuk menghapus semua isi linked lists, sehingga linked lists dalam kondisi kosong.
-Untuk mencetak isi dari linked lists dibuat method print(). Method ini akan mencetak isi linked lists berapapun size-nya. Jika kosong akan dimunculkan suatu pemberitahuan bahwa linked lists dalam kondisi kosong.
-Selanjutya dibuat class DoublyLinkedListMain untuk mengeksekusi semua method yang ada pada class DoublyLinkedList.
-Isikan kode berikut pada method main.

*vertifikasi hasi praktikum*
<img src =" image-1.png">
pertanyaan
1.Jelaskan perbedaan antara single linked list dengan doubly linked lists!
jawaban:


-Single Linked List: Setiap node hanya memiliki referensi ke node berikutnya, memungkinkan perjalanan maju tetapi sulit untuk perjalanan mundur.
-Doubly Linked List: Setiap node memiliki referensi ke node berikutnya dan node sebelumnya, memungkinkan perjalanan maju dan mundur dengan mudah, namun memerlukan lebih banyak memori.
2.Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut
tersebut?
jawaban:
-"next" adalah referensi ke node berikutnya dalam daftar.
-"prev" adalah referensi ke node sebelumnya dalam daftar.
3.Perhatikan konstruktor pada class DoublyLinkedList. Apa kegunaan inisialisasi atribut head dan size?
jawaban:
Konstruktor pada class DoublyLinkedList digunakan untuk menginisialisasi atribut-atribut utama dari Doubly Linked List, yaitu atribut "head" yang menunjukkan node pertama dalam daftar dan atribut "size" yang menyimpan jumlah node dalam daftar. Inisialisasi atribut "head" dengan nilai null menandakan bahwa awalnya daftar kosong, dan inisialisasi "size" dengan nilai 0 mencerminkan bahwa daftar awalnya tidak memiliki elemen. Dengan inisialisasi ini, kita dapat melacak dan mengelola daftar dengan benar saat elemen-elemen ditambahkan atau dihapus.
4.Pada method addFirst(), mengapa dalam pembuatan objek dari konstruktor class Node prev dianggap sama dengan null?
jawabanya:
karena di Dalam metode `addFirst()`, `head` diinisialisasi dengan `new Node(null, data, null)` karena kita sedang menambahkan elemen pertama ke dalam linked list, dan elemen pertama tidak memiliki node sebelumnya (sehingga `prev` diatur ke `null`) dan tidak memiliki node berikutnya (sehingga `next` juga diatur ke `null`).
5.Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode?
jawabannya:
Statement head.prev = newNode adalah cara untuk mengubah referensi prev dari node pertama dalam linked list (head) untuk menunjuk ke node baru (newNode) yang telah ditambahkan sebagai elemen pertama. Dengan kata lain, ini menghubungkan node pertama ke node baru sehingga node baru menjadi node sebelumnya dalam linked list.

6.Perhatikan isi method addLast(), apa arti dari pembuatan objek Node dengan mengisikan parameter prev dengan current, dan next dengan null?
jawaban nya:
Dalam method addLast(), pembuatan objek Node dengan new Node(current, data, null) menghubungkan node baru ke node terakhir saat ini dalam linked list dengan prev diatur sebagai current, dan menandakan bahwa node baru adalah elemen terakhir dengan next diatur ke null.
7.Pada method add(), terdapat potongan kode program sebagai berikut,
jawabannya:
Potongan kode program tersebut digunakan dalam method add() untuk menambahkan elemen baru di awal (sebagai elemen pertama) dari Doubly Linked List
prak 2
langkah percobaan
-Buatlah method removeFirst() di dalam class DoublyLinkedList.
-tambahkan method removeLast() yang masih belum dibuat pada tahap sebelumnya.
-Terakhir, tambahkan method remove() pada kelas DoublyLinkedList.
-Selanjutnya, untuk menguji method remove yang telah Anda buat, tambahkan beberapa kode berikut pada main class.
*vertifikasi hasi praktikum*
<img src =" Screenshot (1121).png">
*pertanyaan*
1.Apakah maksud statement berikut pada method removeFirst()? 
jawaban:
Statement head = head.next pada method removeFirst() digunakan untuk membuat head (node pertama) menunjuk ke node selanjutnya dalam linked list. Dengan kata lain, ini menghapus node pertama dari linked list. Selain itu, head.prev = null digunakan untuk memutuskan hubungan dengan node sebelumnya, dan size-- digunakan untuk mengurangi ukuran linked list.

2.Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
jawabnya:
Untuk mendeteksi apakah data ada di bagian akhir dalam method removeLast(), Anda dapat memeriksa apakah current.next adalah null. Jika current.next adalah null, maka current adalah elemen terakhir dalam linked list, dan Anda dapat menghapusnya.
3.Jelaskan alasan mengapa potongan kode program di bawah ini tidak cocok untuk perintah remove!
jawabannya
Potongan kode program yang diberikan tidak cocok untuk perintah `remove` karena tidak memeriksa apakah `head` adalah elemen yang akan dihapus dan tidak menangani dengan benar kasus ketika elemen yang akan dihapus adalah elemen terakhir dalam linked list. Operasi `remove` memerlukan perawatan khusus untuk mengidentifikasi elemen yang akan dihapus dan mengaturnya dengan benar, terutama dalam kasus-kasus tertentu seperti elemen pertama atau terakhir.
4.Jelaskan fungsi kode program berikut ini pada fungsi remove!
jawabanya
Kode program current.prev.next = current.next; dan current.next.prev = current.prev; adalah bagian dari langkah-langkah yang diperlukan untuk menghapus elemen (node) tertentu dari linked list ganda pada metode remove
Praktikum 3
-Buatlah method getFirst() di dalam class DoublyLinkedList untuk mendapatkan data pada awal linked lists.
-selanjutnya, buatlah method getLast() untuk mendapat data pada akhir linked lists.
-Method get(int index) dibuat untuk mendapatkan data pada indeks tertentu.
Pada main class tambahkan potongan program berikut dan amati hasilnya!
*vertifikasi hasi praktikum*
<img src ="Screenshot (1130).png">
pertanyaan
1.Jelaskan method size() pada class DoublyLinkedList!
Method size() pada class DoublyLinkedList: Method size() digunakan untuk mengembalikan jumlah elemen (node) dalam DoublyLinkedList. Ini menghitung jumlah elemen dalam linked list dengan mengiterasi melalui elemen dari awal hingga akhir dan menghitungnya. Hasil yang dikembalikan adalah jumlah elemen dalam linked list
2.Jelaskan cara mengatur indeks pada doubly linked lists supaya dapat dimulai dari indeks ke-1!
Mengatur indeks pada Doubly Linked Lists supaya dimulai dari indeks ke-1: Untuk mengatur indeks agar dimulai dari 1 pada Doubly Linked List, Anda perlu mengubah cara Anda mengindeks elemen. Sebagai contoh, jika Anda ingin mengakses elemen pada indeks ke-1, sebenarnya Anda mengakses elemen pertama pada linked list. Ini dapat dilakukan dengan mengabaikan elemen "head" dan mengindeks elemen pertama sebagai indeks 1.
3.Jelaskan perbedaan karakteristik fungsi Add pada doubly linked list dan single linked list!
-Doubly Linked List: Pada Doubly Linked List, setiap node memiliki dua pointer, yaitu pointer "next" yang mengarah ke node berikutnya, dan pointer "prev" yang mengarah ke node sebelumnya. Ini memungkinkan pergerakan maju dan mundur dalam linked list dengan mudah. Operasi "add" pada Doubly Linked List dapat dilakukan dengan memanfaatkan pointer "next" dan "prev" untuk mengubah referensi node sebelum dan sesudahnya, sehingga operasi penambahan dapat dilakukan dengan cepat di berbagai posisi dalam linked list.
-Single Linked List: Pada Single Linked List, setiap node hanya memiliki satu pointer "next" yang mengarah ke node berikutnya. Ini memungkinkan pergerakan maju, tetapi tidak memungkinkan pergerakan mundur. Operasi "add" pada Single Linked List hanya dapat dilakukan dengan memanfaatkan pointer "next" untuk mengubah referensi node sebelumnya. Jika Anda ingin menambahkan elemen di tengah linked list, Anda harus mengunjungi elemen sebelumnya dan mengubah referensinya. Operasi ini lebih kompleks daripada Doubly Linked List.
4.Jelaskan perbedaan logika dari kedua kode program di bawah ini

Secara singkat, perbedaan utama adalah:

Kode 1 menggunakan ukuran (size) sebagai penentu apakah struktur data kosong atau tidak, dengan perlu melakukan perbandingan nilai 0.
Kode 2 langsung memeriksa apakah elemen pertama (head) dalam struktur data adalah null untuk menentukan apakah struktur data kosong. Kode kedua adalah pendekatan yang lebih langsung dan efisien.
soal
1.<img src ="Screenshot (1126).png">
2<img src =" Screenshot (1129).png">
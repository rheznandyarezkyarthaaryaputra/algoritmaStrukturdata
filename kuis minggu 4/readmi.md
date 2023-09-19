nama rheznandya rezky artha arya putra
kls:2c sib

**Laporan Codingan Java**
<img scr="Screenshot (787)-1">

**Kesimpulan**

Codingan Java yang diberikan merupakan program kasir supermarket yang memiliki fitur-fitur dasar, yaitu:

* Menambah item
* Menghapus item
* Menghitung total belanja
* Menampilkan daftar item
* Memeriksa pesanan

Program ini menggunakan **ArrayList** untuk menyimpan daftar item yang telah dibeli. **Iterator** digunakan untuk menghapus item dari daftar item. **Double** digunakan untuk menyimpan harga item.

**Kelebihan**

Codingan Java ini memiliki beberapa kelebihan, antara lain:

* Mudah dipahami
* Kode yang rapi dan terstruktur
* Menggunakan konsep OOP

**Kekurangan**

Codingan Java ini masih memiliki beberapa kekurangan, antara lain:

* Tidak dapat menangani transaksi pembayaran
* Tidak dapat menghasilkan laporan transaksi

**Rekomendasi**

Untuk meningkatkan program ini, dapat ditambahkan fitur-fitur berikut:

* Fitur untuk menangani transaksi pembayaran
* Fitur untuk menghasilkan laporan transaksi

**Penjelasan**

Berikut adalah penjelasan lebih rinci tentang fitur-fitur yang ada di dalam codingan Java tersebut:

* **Fitur menambahkan item**

Fitur ini digunakan untuk menambahkan item baru ke daftar pembelian. Pengguna harus memasukkan nama item, jumlah item, dan harga item.

* **Fitur menghapus item**

Fitur ini digunakan untuk menghapus item dari daftar pembelian. Pengguna harus memasukkan nama item yang ingin dihapus.

* **Fitur menghitung total belanja**

Fitur ini digunakan untuk menghitung total belanja dari semua item yang ada di daftar pembelian. Total belanja dihitung dengan menjumlahkan harga item dikalikan jumlah item.

* **Fitur menampilkan daftar item**

Fitur ini digunakan untuk menampilkan daftar item yang ada di daftar pembelian.

* **Fitur memeriksa pesanan**

Fitur ini digunakan untuk memeriksa pesanan yang telah dibeli, termasuk memeriksa apakah ada item yang memiliki jumlah atau harga negatif.

**Contoh penggunaan**

Berikut adalah contoh penggunaan codingan Java tersebut:

```
// Menambahkan item
kasir.addItem("Mie Instan", 10, 2000);
kasir.addItem("Roti", 5, 5000);

// Menghapus item
kasir.deleteItem("Roti");

// Menghitung total belanja
double totalBelanja = kasir.calculateTotal();

// Menampilkan daftar item
kasir.displayItems();

// Memeriksa pesanan
kasir.check_order();
```

Output:

```
Menambahkan item "Mie Instan" dengan jumlah 10 dan harga 2000
Menambahkan item "Roti" dengan jumlah 5 dan harga 5000
Menghapus item "Roti"
Total belanja: Rp 200.000
Daftar item:
Nama: Mie Instan, Jumlah: 10, Harga: Rp 20.000

Pemesanan sudah benar
```

**Kesimpulan**

Codingan Java yang diberikan merupakan program kasir supermarket yang sederhana dan mudah digunakan. Program ini dapat menjadi dasar untuk mengembangkan program kasir supermarket yang lebih kompleks.


flowchart:
<img scr="Screenshot (788)">

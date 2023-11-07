Langkah Percobaan1
-Buatlah class Node, BinaryTree dan BinaryTreeMain. 
-Di dalam class Node, tambahkan atribut data, left dan right, serta konstruktor default dan berparameter.
-Di dalam class BinaryTree, tambahkan atribut root.
-Tambahkan konstruktor default dan method isEmpty() di dalam class BinaryTree.
-Tambahkan method add() di dalam class BinaryTree. Di bawah ini proses penambahan node tidak dilakukan secara rekursif, agar lebih mudah dilihat alur proses penambahan node dalam tree. Jika dilakukan dengan proses rekursif, penulisan kode akan lebih efisien.
-Tambahkan method find().
-Tambahkan method traversePreOrder(), traverseInOrder() dan traversePostOrder(). Method traverse digunakan untuk mengunjungi dan menampilkan node-node dalam tree, baik dalam mode pre-order, in-order maupun post-order.
-Tambahkan method getSuccessor(). Method ini akan digunakan ketika proses penghapusan node yang memiliki 2 child.
-Tambahkan method delete(). Di dalam method delete tambahkan pengecekan apakah tree kosong, dan jika tidak cari posisi node yang akan di hapus. Kemudian tambahkan proses penghapusan terhadap node current yang telah ditemukan.
-Buka class BinaryTreeMain dan tambahkan method main().
-Compile dan jalankan class BinaryTreeMain untuk mendapatkan simulasi jalannya program tree yang telah dibuat.
-Amati hasil running tersebut.
<img src ="Screenshot (1136).png">
Pertanyaan

1.Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
jawaban:
proses pencarian data dalam binary search tree lebih efektif dibanding binary tree biasa karena:
A.Data-data diurut berdasarkan nilainya, sehingga proses pencarian dapat dilakukan dengan cepat.
2.Apa fungsi atribut left dan right pada class Node?
jawaban:
Atribut left dan right pada class Node digunakan untuk menyimpan pointer ke node kiri dan kanan dari node tersebut. Dalam binary search tree, atribut left digunakan untuk menyimpan pointer ke node anak kiri dari node tersebut, sedangkan atribut right digunakan untuk menyimpan pointer ke node anak kanan dari node tersebut.
3.Simak pertanyaan berikut,
   -Apa kegunaan dari atribut root di dalam class BinaryTree?
   jawaban:
   Atribut root pada class BinaryTree digunakan untuk menyimpan pointer ke node root dari tre
  -Ketika objek tree pertama kali dibuat, apa nilai dari root?
  jawaban:
  Ketika objek tree pertama kali dibuat, nilai dari root adalah null. Hal ini karena tree pada awalnya kosong, sehingga tidak ada node yang menjadi root.
4.Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? 
jawabnnya:

Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, maka node baru tersebut akan menjadi root dari tree tersebut. Hal ini karena node root adalah node yang memiliki nilai paling kecil atau paling besar dari semua node pada tree.
5.Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
jawaban:
 A.Kondisi pertama:
Jika data yang akan ditambahkan lebih kecil dari nilai node yang sedang diproses, maka node baru harus ditambahkan ke subtree kiri dari node tersebut.
Oleh karena itu, baris program tersebut akan terlebih dahulu mengecek apakah subtree kiri dari node yang sedang diproses tidak kosong.
Jika subtree kiri tidak kosong, maka node yang sedang diproses akan diubah menjadi node root dari subtree kiri tersebut.
Hal ini dilakukan agar proses pencarian node yang tepat untuk menambahkan node baru dapat dilanjutkan ke subtree kiri tersebut.

B.Kondisi kedua:
Jika data yang akan ditambahkan lebih besar atau sama dengan nilai node yang sedang diproses, maka node baru harus ditambahkan ke subtree kanan dari node tersebut.
Oleh karena itu, baris program tersebut akan membuat objek node baru yang berisi data yang akan ditambahkan.
Kemudian, atribut left dari node yang sedang diproses akan diatur menjadi node baru yang baru dibuat.
Hal ini dilakukan untuk menambahkan node baru ke subtree kanan dari node tersebut.
Proses penambahan node baru akan diakhiri karena node baru sudah berada di posisi yang tepat.

Langkah Percobaan 2
1.Buatlah class BinaryTreeArray dan BinaryTreeArrayMain.
2.Buat atribut data dan idxLast di dalam class BinaryTreeArray. Buat juga method populateData() dan traverseInOrder().
3.Kemudian dalam class BinaryTreeArrayMain buat method main().
4.Jalankan class BinaryTreeArrayMain dan amati hasilnya!
-Amati hasil running tersebut.
<img src =" Screenshot (1137).png">
Pertanyaan
1.Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
jawabannya:
Atribut data pada class BinaryTreeArray digunakan untuk menyimpan data-data yang akan ditambahkan ke binary tree
2.Apakah kegunaan dari method populateData()?
jawabannya:
Method populateData() pada class BinaryTreeArray digunakan untuk menambahkan data-data dari array data ke binary tree.

3.Apakah kegunaan dari method traverseInOrder()?
jawabannya:

Method traverseInOrder() pada class BinaryTreeArray digunakan untuk melakukan traversal inorder pada binary tree. Traversal inorder adalah salah satu metode traversal binary tree yang dilakukan dengan mengunjungi node-node dari kiri ke kanan, dimulai dari node root.

4.Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing?
jawabannya:

-Left child: Posisi left child selalu berada di sebelah kiri node parent. Dalam hal ini, node parent berada di indeks 2, sehingga posisi left child adalah 2 * 2 - 1 = 3.
-Right child: Posisi right child selalu berada di sebelah kanan node parent. Dalam hal ini, node parent berada di indeks 2, sehingga posisi right child adalah 2 * 2 = 4.
5.Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
jawabannya:
Statement int idxLast = 6 pada praktikum 2 percobaan nomor 4 digunakan untuk menentukan indeks terakhir dari array data yang berisi data yang akan ditambahkan ke binary tree

Tugas
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif.
<img src =" Screenshot (1139).png">
2.Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree.
<img src ="Screenshot (1140).png">
3.Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf.
<img src ="Screenshot (1141).png">
4.Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree.
<img src =" Screenshot (1142).png">
-Amati hasil running tersebut.
<img src =" Screenshot (1138).png">
5.Modifikasi class BinaryTreeArray, dan tambahkan : 
   1.method add(int data) untuk memasukan data ke dalam tree 
   <img src ="Screenshot (1144).png">
   2.method traversePreOrder() dan traversePostOrder().
   <img src ="Screenshot (1144).png">
-Amati hasil running tersebut.
<img src ="Screenshot (1143).png">

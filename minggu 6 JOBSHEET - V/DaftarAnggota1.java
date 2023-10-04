package tugas;
import com.company.mahasiswa;
public class DaftarAnggota1 {
 anggota list[] = new anggota[5];
 int id ;
 void tambah(anggota n){
 if (id < list.length){
 list[id] = n;
 id++;
 }else {
 System.out.println("Data sudah Penuh");
 }
 }
 void tampil(){
 for(anggota n : list){
 n.tampil();
 System.out.println("------------------");
 }
 }

void selectionsort(){
 for (int i = 0; i < list.length-1; i++){
 int max= i;
 for (int j = i+1; j< list.length; j++){
 if (list[j].tinggi > list[max].tinggi){
 max = j;
 }
 }
 anggota tmp = list[max];
 list[max] = list[i];
 list[i] = tmp;
 }
 }

    void pemilihan(){
        boolean status = false;
        for (int i = 0;i < list.length;i++){
        if (list[i].tinggi > 170){
        System.out.println("Nama : "+list[i].nama);
        System.out.println("Kelas : "+list[i].kelas);
        System.out.println("Tinggi : "+list[i].tinggi);
        System.out.println("");
        status = true;
        } else if (status = false) {
        System.out.println("Tidak ada Yang lolos pada seleksi");

        }
        }
    }
}

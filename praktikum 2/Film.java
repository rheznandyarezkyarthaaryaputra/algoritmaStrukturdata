public class Film {
String judul,genre,rate;
int jumlahTiket,hargaTiket;


Film(){

}
Film (String jd,String gr,String rt,int jt,int ht){
    judul=jd;
    genre=gr;
    rate=rt;
    jumlahTiket=jt;
    hargaTiket=ht;
}

void tampilFilm(){
System.out.println ("Judul:"+judul);
System.out.println ("Genre:"+genre);
System.out.println ("Rate:"+rate);
System.out.println ("Jumlah Tiket:"+jumlahTiket);
System.out.println("Harga Tiket:"+hargaTiket);
}
void tambahTiket(int n){
    jumlahTiket +=n;
}
void kurangTiketTiket(int n) {
    jumlahTiket -=n;
}
int totalRevenue(int jumlah){
    return jumlah*hargaTiket;
}
}
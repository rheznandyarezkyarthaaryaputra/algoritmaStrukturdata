public class nasabah2 {
    private int Id;
    private String nama;
    private String alamat;
    private int noHP;
    private float jmlHutang;
    private boolean statusAktif;
    private Rekening[] rekenings;

    public nasabah2(int Id, String nama, String alamat, int noHP, int maxRekenings) {
        this.Id = Id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.jmlHutang = 0;
        this.statusAktif = false;
        this.rekenings = new Rekening[maxRekenings];
    }

    public void bukaRekening(int noRek) {
        if (statusAktif) {
            for (int i = 0; i < rekenings.length; i++) {
                if (rekenings[i] == null) {
                    rekenings[i] = new Rekening(noRek);
                    return;
                }
            }
            System.out.println("Jumlah rekening sudah mencapai batas maksimum.");
        } else {
            System.out.println("Rekening tidak aktif");
        }
    }

    public void tutupRekening(int noRek) {
        if (statusAktif) {
            for (int i = 0; i < rekenings.length; i++) {
                if (rekenings[i] != null && rekenings[i].getNoRek() == noRek) {
                    rekenings[i] = null;
                    return;
                }
            }
            System.out.println("Rekening dengan nomor " + noRek + " tidak ditemukan.");
        } else {
            System.out.println("Rekening tidak aktif");
        }
    }

    public void lihatRekenings() {
        if (statusAktif) {
            System.out.println("Rekening-rekening yang dimiliki:");
            for (Rekening rekening : rekenings) {
                if (rekening != null) {
                    System.out.println("Nomor Rekening: " + rekening.getNoRek());
                }
            }
        } else {
            System.out.println("Rekening tidak aktif");
        }
    }

    // ... (Implementasi method-method lain seperti sebelumnya)

    public static void main(String[] args) {
        nasabah2 nasabah1 = new nasabah2(1, "John Doe", "Jl. Contoh", 123456789, 5);
        nasabah1.bukaRekening(1001);
        nasabah1.bukaRekening(1002);

        System.out.println("Rekening-rekening Nasabah 1:");
        nasabah1.lihatRekenings();

        nasabah1.tutupRekening(1001);
        System.out.println("Rekening-rekening Nasabah 1 setelah menutup Rekening 1001:");
        nasabah1.lihatRekenings();
    }
}

class Rekening {
    private int noRek;

    public Rekening(int noRek) {
        this.noRek = noRek;
    }

    public int getNoRek() {
        return noRek;
    }
}

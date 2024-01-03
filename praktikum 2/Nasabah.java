
    public class Nasabah {
    private int Id;
    private String nama;
    private String alamat;
    private int noHP;
    private int saldo;
    private float jmlHutang;
    private int noRek;
    private boolean statusAktif;

    public Nasabah(int Id, String nama, String alamat, int noHP) {
        this.Id = Id;
        this.nama = nama;
        this.alamat = alamat;
        this.noHP = noHP;
        this.saldo = 0;
        this.jmlHutang = 0;
        this.noRek = 0;
        this.statusAktif = false;
    }

    public void bukaRekening(int noRek) {
        this.noRek = noRek;
        this.statusAktif = true;
    }

    public void tutupRekening() {
        this.statusAktif = false;
    }

    public int lihatSaldo() {
        if (this.statusAktif) {
            return this.saldo;
        } else {
            System.out.println("Rekening tidak aktif");
            return 0;
        }
    }

    public int menabung(int deposit) {
        if (this.statusAktif) {
            this.saldo += deposit;
            return this.saldo;
        } else {
            System.out.println("Rekening tidak aktif");
            return 0;
        }
    }

    public int tarikTunai(int jmlTarik) {
        if (this.statusAktif) {
            if (this.saldo >= jmlTarik) {
                this.saldo -= jmlTarik;
                return this.saldo;
            } else {
                System.out.println("Saldo tidak mencukupi");
                return 0;
            }
        } else {
            System.out.println("Rekening tidak aktif");
            return 0;
        }
    }

    public String berhutang(float jmlHutang) {
        if (this.statusAktif) {
            if (jmlHutang >= this.saldo) {
                return "Ajuan peminjaman ditolak";
            } else {
                this.jmlHutang = jmlHutang;
                float cicilanPerBulan = jmlHutang / 6;
                return "Pinjaman disetujui. Cicilan per bulan: " + cicilanPerBulan;
            }
        } else {
            return "Rekening tidak aktif";
        }
    }

    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah(1, "John Doe", "Jl. Contoh", 123456789);
        nasabah1.bukaRekening(1001);
        System.out.println("Saldo: " + nasabah1.lihatSaldo());  // Output: Saldo: 0
        System.out.println("Saldo setelah menabung: " + nasabah1.menabung(1000));  // Output: Saldo setelah menabung: 1000
        System.out.println(nasabah1.berhutang(500));  // Output: Pinjaman disetujui. Cicilan per bulan: 83.333336
    }
}


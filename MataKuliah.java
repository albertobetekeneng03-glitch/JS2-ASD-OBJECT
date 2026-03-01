public class MataKuliah {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah() {}

    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama   : " + nama);
        System.out.println("SKS    : " + sks);
        System.out.println("Jam    : " + jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Jam tidak mencukupi untuk dikurangi");
        }
    }
}
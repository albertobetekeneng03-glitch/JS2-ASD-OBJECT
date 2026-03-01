public class Dosen03 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen03() {}

    public Dosen03(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID      : " + idDosen);
        System.out.println("Nama    : " + nama);
        System.out.println("Aktif   : " + statusAktif);
        System.out.println("Tahun   : " + tahunBergabung);
        System.out.println("Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status diubah menjadi: " + statusAktif);
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Keahlian diubah menjadi: " + bidangKeahlian);
    }
}
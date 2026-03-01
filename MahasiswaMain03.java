public class MahasiswaMain03 {
    public static void main(String[] args) {
        Mahasiswa03 mhs1 = new Mahasiswa03();

        mhs1.nim = "254107060148";
        mhs1.nama = "Alberto Gute Betekeneng";
        mhs1.kelas = "SIB-1E";
        mhs1.ipk = "4.0";

        mhs1.TampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja(Double.parseDouble(mhs1.ipk)));

        mhs1.UbahKelas("SIB-1E");
        mhs1.UpdateIPK("3.8");

        mhs1.TampilkanInformasi();
    }
}

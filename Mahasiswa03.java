;
public class Mahasiswa03 {
        String nim;
        String nama;
        String kelas;
        String ipk;

        void TampilkanInformasi() {
            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Kelas: " + kelas);
            System.out.println("IPK: " + ipk);
        }

        void UbahKelas(String kelasBaru) {
            kelas = kelasBaru;
            System.out.println("Kelas berhasil diubah menjadi " + kelas);
        }

        void UpdateIPK(String ipkBaru) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diubah menjadi " + ipk);
            System.out.println("IPK tidak valid, harus antara 0.0 – 4.0.");
        }
    

    String nilaiKinerja(double ipk) {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        }else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}



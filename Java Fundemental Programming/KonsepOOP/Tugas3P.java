package KonsepOOP;

import java.util.ArrayList;
import java.util.List;
class JawabanSiswa {
    private String nama;
    private char[] jawaban;

    // Constructor
    public JawabanSiswa(String nama, char[] jawaban) {
        this.nama = nama;
        this.jawaban = jawaban;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk jawaban
    public char[] getJawaban() {
        return jawaban;
    }
}

class Ujian {
    private char[] kunciJawaban;

    // Constructor
    public Ujian(char[] kunciJawaban) {
        this.kunciJawaban = kunciJawaban;
    }

    // Method untuk menghitung nilai
    public int menghitungNilai(JawabanSiswa JawabanSiswa) {
        int nilai = 0;
        char[] jawaban = JawabanSiswa.getJawaban();
        
        for (int i = 0; i < kunciJawaban.length; i++) {
            if (jawaban[i] == kunciJawaban[i]) {
                nilai += 10;
            }
        }
        return nilai;
    }

    // Method untuk menentukan kelulusan
    public String menentukanKelulusan(int nilai) {
        return (nilai >= 70) ? "LULUS" : "GAGAL";
    }
}

public class Tugas3P {
    public static void main(String[] args) {
        // Kunci jawaban
        char[] kunciJawaban = {'A', 'B', 'A', 'C', 'D', 'D', 'A', 'B', 'B', 'B'};
        
        // Data siswa
        List<JawabanSiswa> siswa = new ArrayList<>();
        siswa.add(new JawabanSiswa("Awac", new char[]{'A', 'B', 'A', 'C', 'D', 'D', 'A', 'B', 'B', 'B'}));
        siswa.add(new JawabanSiswa("Benhar", new char[]{'B', 'C', 'B', 'C', 'C', 'A', 'C', 'B', 'C', 'B'}));
        siswa.add(new JawabanSiswa("Celia", new char[]{'A', 'A', 'A', 'C', 'D', 'D', 'A', 'C', 'B', 'C'}));
        siswa.add(new JawabanSiswa("Dava", new char[]{'B', 'A', 'B', 'A', 'D', 'A', 'B', 'B', 'B', 'B'}));
        siswa.add(new JawabanSiswa("Eigen", new char[]{'A', 'A', 'A', 'B', 'D', 'C', 'B', 'A', 'B', 'B'}));

        // Proses penilaian
        Ujian ujian = new Ujian(kunciJawaban);
        
        for (JawabanSiswa paraSiswa : siswa) {
            int nilai = ujian.menghitungNilai(paraSiswa); // Hitung nilai
            String status = ujian.menentukanKelulusan(nilai); // Tentukan status
            
            // Tampilkan hasil
            System.out.println("Nama: " + paraSiswa.getNama());
            System.out.println("Nilai: " + nilai);
            System.out.println("Status: " + status);
            System.out.println("----------------------");
        }
    }
}
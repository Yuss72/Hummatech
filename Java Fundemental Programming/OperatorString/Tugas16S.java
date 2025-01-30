package OperatorString;

import java.util.ArrayList;
public class Tugas16S {
    public static void main(String[] args) {
        String kalimat = "Siswa kelas industri sangat antusias untuk belajar di hari sabtu";

        String[] kata = kalimat.split(" ");

        int jS = 0;
        for (int u = 0; u < kalimat.length(); u++) {
            char karakter = kalimat.charAt(u);
            if (karakter == 'S' || karakter == 's') {
                jS++;
            }
        }

        System.out.println("Kalimat: " + kalimat);
        System.out.println("Jumlah S Di Dalam Kalimat Tersebut Adalah: " + jS);
    }
}

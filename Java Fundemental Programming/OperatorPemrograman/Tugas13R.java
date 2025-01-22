/*
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 3 - September - 2024
 * Kode program : Jawaban Kuis
 * 
 * Di tugas tugas saya sebelumnya lupa untuk mengetik ini
 */

import java.util.Scanner;

public class Tugas13R {
    public static void main(String[] args) {
        Scanner kuis = new Scanner(System.in);

        // Pertanyaan kuis
        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("A. Operator Indosat");
        System.out.println("B. Operator Aritmatika");
        System.out.println("C. Operator Telkomsel");
        System.out.println("D. Operator Assignment");
        System.out.println("Masukkan jawaban (A/B/C/D): ");

        char inputJawaban = kuis.next().toUpperCase().charAt(0);
        boolean jawabanKuis = (inputJawaban == 'B') || (inputJawaban == 'D');

        System.out.println("\n=== Output ===");
        System.out.println("Jawaban anda: " + jawabanKuis);
    }
}

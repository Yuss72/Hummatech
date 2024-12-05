/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 24  - Oktober - 2024
 * Kode program : Pengualangan
 */

package Perulangan;
import java.util.Scanner;
public class Tugas10O {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Perulangan while untuk uncounted loop
        while (!input.equals("ya")) {
            System.out.print("Apakah Anda ingin berhenti? (ketik 'ya' untuk berhenti): ");
            input = scanner.nextLine();
        }
        System.out.println("Program berhenti.");
    }
}



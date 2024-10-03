/*
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 3 - September - 2024
 * Kode program : Operator Bitwise
 */

import java.util.Scanner;

public class Tugas15R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input user
        System.out.println("Masukkan nilai a yang anda inginkan: ");
        int nilaiA = input.nextInt();
        System.out.println("Masukkan nilai b yang anda inginkan: ");
        int nilaiB = input.nextInt();

        // deklrasasi variable hasil
        int hasil;

        // operator bitwise
        hasil = nilaiA & nilaiB;
        System.out.println("hasil dari a & b: " + hasil);

        hasil = nilaiA | nilaiB;
        System.out.println("hasil dari a | b: " + hasil);

        hasil = nilaiA ^ nilaiB;
        System.out.println("hasil dari a ^ b: " + hasil);

        hasil = ~nilaiA;
        System.out.println("hasil dari ~a: " + hasil);

        hasil = nilaiA << 2;
        System.out.println("hasil dari a << 2: " + hasil);

        hasil = nilaiA >> 2;
        System.out.println("hasil dari a >> 2: " + hasil);
    }
}

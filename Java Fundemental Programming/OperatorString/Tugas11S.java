package OperatorString;

import java.util.Scanner;
public class Tugas11S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.print("Silahkan Pilih Kata Ke Berapa Yang Hanya Akan Di Tampilkan Di Setiap Kata: ");
        int iKata = input.nextInt();
        iKata -= 1;
        // flush
        input.nextLine();

        String[] kata = kalimat.split(" ");

        System.out.println("\nMengambil karakter dari Kalimat: " + kalimat);
        for (int u = 0; u < kata.length; u++) {
            System.out.print(kata[u].charAt(iKata) + " ");
        }
    }
}

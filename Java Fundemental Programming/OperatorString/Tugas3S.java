package OperatorString;

import java.util.Scanner;
import java.util.ArrayList;
public class Tugas3S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Silahkan Masukkan Jumlah Data String Yang Akan Di Inputkan Ke Dalam Array: ");
        int iJData = input.nextInt();
        // flush
        input.nextLine();

        ArrayList<String> kata = new ArrayList<>();

        System.out.println("\nSilahkan Masukkan Data String: ");
        for (int u = 0; u < iJData; u++) {
            System.out.print("Array ke " + u + ": ");
            String iData = input.nextLine();
            kata.add(iData);
        }

        System.out.println("\n=== Mengecek Apakah Ada Data Di Dalam Array Serta Menampilkan Isi ===");
        for (int u = 0; u < iJData; u++) {
            if ((kata.get(u)).length() > 0) {
                System.out.println("Array ke " + u + " Terisi : " + kata.get(u));
            } else {
                System.out.println("Array ke " + u + " Kosong.");
            }
        }
    }
}
